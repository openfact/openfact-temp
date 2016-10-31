/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openfact.subsystem.server.extension;

import org.jboss.as.controller.AttributeDefinition;
import org.jboss.as.controller.PathAddress;
import org.jboss.as.controller.PathElement;
import org.jboss.as.controller.PropertiesAttributeDefinition;
import org.jboss.as.controller.SimpleAttributeDefinition;
import org.jboss.as.controller.descriptions.ModelDescriptionConstants;
import org.jboss.as.controller.operations.common.Util;
import org.jboss.as.controller.parsing.ParseUtils;
import org.jboss.as.controller.persistence.SubsystemMarshallingContext;
import org.jboss.dmr.ModelNode;
import org.jboss.dmr.Property;
import org.jboss.staxmapper.XMLElementReader;
import org.jboss.staxmapper.XMLElementWriter;
import org.jboss.staxmapper.XMLExtendedStreamReader;
import org.jboss.staxmapper.XMLExtendedStreamWriter;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import java.util.List;

import static org.openfact.subsystem.server.extension.OpenfactExtension.PATH_SUBSYSTEM;
import static org.openfact.subsystem.server.extension.ProviderResourceDefinition.ENABLED;
import static org.openfact.subsystem.server.extension.ProviderResourceDefinition.PROPERTIES;
import static org.openfact.subsystem.server.extension.SpiResourceDefinition.DEFAULT_PROVIDER;
import static org.openfact.subsystem.server.extension.ThemeResourceDefinition.MODULES;

/**
 * The subsystem parser, which uses stax to read and write to and from xml
 */
class OpenfactSubsystemParser implements XMLStreamConstants, XMLElementReader<List<ModelNode>>, XMLElementWriter<SubsystemMarshallingContext> {

    /**
     * {@inheritDoc}
     */
    @Override
    public void readElement(final XMLExtendedStreamReader reader, final List<ModelNode> list) throws XMLStreamException {
        // Require no attributes
        ParseUtils.requireNoAttributes(reader);
        ModelNode addOpenfactSub = Util.createAddOperation(PathAddress.pathAddress(PATH_SUBSYSTEM));
        list.add(addOpenfactSub);

        while (reader.hasNext() && nextTag(reader) != END_ELEMENT) {
            if (reader.getLocalName().equals(OpenfactSubsystemDefinition.WEB_CONTEXT.getXmlName())) {
                OpenfactSubsystemDefinition.WEB_CONTEXT.parseAndSetParameter(reader.getElementText(), addOpenfactSub, reader);
            } else if (reader.getLocalName().equals(OpenfactSubsystemDefinition.PROVIDERS.getXmlName())) {
                readProviders(reader, addOpenfactSub);
            } else if (reader.getLocalName().equals(OpenfactSubsystemDefinition.MASTER_ORGANIZATION_NAME.getXmlName())) {
                OpenfactSubsystemDefinition.MASTER_ORGANIZATION_NAME.parseAndSetParameter(reader.getElementText(), addOpenfactSub, reader);
            } else if (reader.getLocalName().equals(OpenfactSubsystemDefinition.SCHEDULED_TASK_INTERVAL.getXmlName())) {
                OpenfactSubsystemDefinition.SCHEDULED_TASK_INTERVAL.parseAndSetParameter(reader.getElementText(), addOpenfactSub, reader);
            } else if (reader.getLocalName().equals(ThemeResourceDefinition.TAG_NAME)) {
                readTheme(list, reader);
            } else if (reader.getLocalName().equals(SpiResourceDefinition.TAG_NAME)) {
                readSpi(list, reader);
            } else {
                throw new XMLStreamException("Unknown openfact-server subsystem tag: " + reader.getLocalName());
            }
        }
    }
    
    private void readProviders(final XMLExtendedStreamReader reader, ModelNode addOpenfactSub) throws XMLStreamException {
        while (reader.hasNext() && nextTag(reader) != END_ELEMENT) {
            OpenfactSubsystemDefinition.PROVIDERS.parseAndAddParameterElement(reader.getElementText(),addOpenfactSub, reader);
        }
    }
    
    private void readTheme(final List<ModelNode> list, final XMLExtendedStreamReader reader) throws XMLStreamException {
        ModelNode addThemeDefaults = new ModelNode();
        addThemeDefaults.get(ModelDescriptionConstants.OP).set(ModelDescriptionConstants.ADD);
        PathAddress addr = PathAddress.pathAddress(PathElement.pathElement(ModelDescriptionConstants.SUBSYSTEM, OpenfactExtension.SUBSYSTEM_NAME),
                                                   PathElement.pathElement(ThemeResourceDefinition.TAG_NAME, ThemeResourceDefinition.RESOURCE_NAME));
        addThemeDefaults.get(ModelDescriptionConstants.OP_ADDR).set(addr.toModelNode());
        list.add(addThemeDefaults);
        
        while (reader.hasNext() && nextTag(reader) != END_ELEMENT) {
            String tagName = reader.getLocalName();
            if (MODULES.getName().equals(tagName)) {
                readModules(reader, addThemeDefaults);
                continue;
            }
            
            SimpleAttributeDefinition def = OpenfactExtension.THEME_DEFINITION.lookup(tagName);
            if (def == null) throw new XMLStreamException("Unknown theme tag " + tagName);
            def.parseAndSetParameter(reader.getElementText(), addThemeDefaults, reader);
        }
    }
    
    private void readModules(final XMLExtendedStreamReader reader, ModelNode addThemeDefaults) throws XMLStreamException {
        while (reader.hasNext() && nextTag(reader) != END_ELEMENT) {
            MODULES.parseAndAddParameterElement(reader.getElementText(),addThemeDefaults, reader);
        }
    }
    
    private void readSpi(final List<ModelNode> list, final XMLExtendedStreamReader reader) throws XMLStreamException {
        String spiName = ParseUtils.requireAttributes(reader, "name")[0];
        ModelNode addSpi = new ModelNode();
        addSpi.get(ModelDescriptionConstants.OP).set(ModelDescriptionConstants.ADD);
        PathAddress addr = PathAddress.pathAddress(PathElement.pathElement(ModelDescriptionConstants.SUBSYSTEM, OpenfactExtension.SUBSYSTEM_NAME),
                                                   PathElement.pathElement(SpiResourceDefinition.TAG_NAME, spiName));
        addSpi.get(ModelDescriptionConstants.OP_ADDR).set(addr.toModelNode());
        list.add(addSpi);
        
        while (reader.hasNext() && nextTag(reader) != END_ELEMENT) {
            if (reader.getLocalName().equals(DEFAULT_PROVIDER.getXmlName())) {
                DEFAULT_PROVIDER.parseAndSetParameter(reader.getElementText(), addSpi, reader);
            } else if (reader.getLocalName().equals(ProviderResourceDefinition.TAG_NAME)) {
                readProvider(list, spiName, reader);
            }
        }
    }
    
    private void readProvider(final List<ModelNode> list, String spiName, final XMLExtendedStreamReader reader) throws XMLStreamException {
        String[] attributes = ParseUtils.requireAttributes(reader, "name", ENABLED.getXmlName());
        String providerName = attributes[0];
        String enabled = attributes[1];
        
        ModelNode addProvider = new ModelNode();
        addProvider.get(ModelDescriptionConstants.OP).set(ModelDescriptionConstants.ADD);
        PathAddress addr = PathAddress.pathAddress(PathElement.pathElement(ModelDescriptionConstants.SUBSYSTEM, OpenfactExtension.SUBSYSTEM_NAME),
                                                   PathElement.pathElement(SpiResourceDefinition.TAG_NAME, spiName),
                                                   PathElement.pathElement(ProviderResourceDefinition.TAG_NAME, providerName));
        addProvider.get(ModelDescriptionConstants.OP_ADDR).set(addr.toModelNode());
        addProvider.get(ENABLED.getName()).set(Boolean.valueOf(enabled));
        list.add(addProvider);
        
        while (nextTag(reader) != END_ELEMENT) {
            if (reader.getLocalName().equals(PROPERTIES.getXmlName())) {
                readProperties(PROPERTIES, addProvider, reader);
            }
        }
    }
    
    private void readProperties(final PropertiesAttributeDefinition attrDef, ModelNode addOp, final XMLExtendedStreamReader reader) throws XMLStreamException {
        while (nextTag(reader) != END_ELEMENT) {
        int attrCount = reader.getAttributeCount();
            if (attrCount != 2) throw new XMLStreamException("Property must have only two attributes");
            String name = "";
            String value = "";
            for (int i=0 ; i < 2; i++) {
                String attrName = reader.getAttributeLocalName(i);
                String attrValue = reader.getAttributeValue(i);
                if (attrName.equals("name")) {
                    name = attrValue;
                } else if (attrName.equals("value")) {
                    value = attrValue;
                } else {
                    throw new XMLStreamException("Property can only have attributes named 'name' and 'value'");
                }
            }
            attrDef.parseAndAddParameterElement(name, value, addOp, reader);
        nextTag(reader);
        }
            }
        
    // used for debugging
    private int nextTag(XMLExtendedStreamReader reader) throws XMLStreamException {
        return reader.nextTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void writeContent(final XMLExtendedStreamWriter writer, final SubsystemMarshallingContext context) throws XMLStreamException {
        context.startSubsystemElement(OpenfactExtension.NAMESPACE, false);
        writeWebContext(writer, context);
        writeList(writer, context.getModelNode(), OpenfactSubsystemDefinition.PROVIDERS, "provider");
        writeAdmin(writer, context);
        writeScheduledTaskInterval(writer, context);
        writeThemeDefaults(writer, context);
        writeSpis(writer, context);
        writer.writeEndElement();
    }
    
    private void writeThemeDefaults(XMLExtendedStreamWriter writer, SubsystemMarshallingContext context) throws XMLStreamException {
        if (!context.getModelNode().get(ThemeResourceDefinition.TAG_NAME).isDefined()) {
            return;
        }
        
        writer.writeStartElement(ThemeResourceDefinition.TAG_NAME);
        ModelNode themeElements = context.getModelNode().get(ThemeResourceDefinition.TAG_NAME, ThemeResourceDefinition.RESOURCE_NAME);
        for (AttributeDefinition def : ThemeResourceDefinition.ALL_ATTRIBUTES) {
            if (themeElements.hasDefined(def.getName())) {
                if (def == MODULES) {
                    ModelNode themeContext = context.getModelNode().get("theme", "defaults");
                    writeList(writer, themeContext, def, "module");
                } else {
                    def.marshallAsElement(themeElements, writer);
                }
            }
        }
        writer.writeEndElement();
    }

    private void writeSpis(XMLExtendedStreamWriter writer, SubsystemMarshallingContext context) throws XMLStreamException {
        if (!context.getModelNode().get(SpiResourceDefinition.TAG_NAME).isDefined()) {
            return;
        }
        
        for (Property spi : context.getModelNode().get(SpiResourceDefinition.TAG_NAME).asPropertyList()) {
            writer.writeStartElement(SpiResourceDefinition.TAG_NAME);
            writer.writeAttribute("name", spi.getName());
            ModelNode spiElements = spi.getValue();
            DEFAULT_PROVIDER.marshallAsElement(spiElements, writer);
            writeProviders(writer, spiElements);
            writer.writeEndElement();
        }
    }
    
    private void writeProviders(XMLExtendedStreamWriter writer, ModelNode spiElements) throws XMLStreamException {
        if (!spiElements.get(ProviderResourceDefinition.TAG_NAME).isDefined()) {
            return;
        }
        
        for (Property provider : spiElements.get(ProviderResourceDefinition.TAG_NAME).asPropertyList()) {
            writer.writeStartElement(ProviderResourceDefinition.TAG_NAME);
            writer.writeAttribute("name", provider.getName());
            ModelNode providerElements = provider.getValue();
            ENABLED.marshallAsAttribute(providerElements, writer);
            PROPERTIES.marshallAsElement(providerElements, writer);
            writer.writeEndElement();
        }
    }
    
    private void writeWebContext(XMLExtendedStreamWriter writer, SubsystemMarshallingContext context) throws XMLStreamException {
        if (!context.getModelNode().get(OpenfactSubsystemDefinition.WEB_CONTEXT.getName()).isDefined()) {
            return;
        }

        OpenfactSubsystemDefinition.WEB_CONTEXT.marshallAsElement(context.getModelNode(), writer);
    }
    
    private void writeAdmin(XMLExtendedStreamWriter writer, SubsystemMarshallingContext context) throws XMLStreamException {
        if (!context.getModelNode().get(OpenfactSubsystemDefinition.MASTER_ORGANIZATION_NAME.getName()).isDefined()) {
            return;
        }

        OpenfactSubsystemDefinition.MASTER_ORGANIZATION_NAME.marshallAsElement(context.getModelNode(), writer);
    }
    
    private void writeScheduledTaskInterval(XMLExtendedStreamWriter writer, SubsystemMarshallingContext context) throws XMLStreamException {
        if (!context.getModelNode().get(OpenfactSubsystemDefinition.SCHEDULED_TASK_INTERVAL.getName()).isDefined()) {
            return;
        }

        OpenfactSubsystemDefinition.SCHEDULED_TASK_INTERVAL.marshallAsElement(context.getModelNode(), writer);
    }
    
    private void writeList(XMLExtendedStreamWriter writer, ModelNode context, AttributeDefinition def, String elementName) throws XMLStreamException {
        if (!context.get(def.getName()).isDefined()) {
            return;
        }

        writer.writeStartElement(def.getXmlName());
        ModelNode modules = context.get(def.getName());
        for (ModelNode module : modules.asList()) {
            writer.writeStartElement(elementName);
            writer.writeCharacters(module.asString());
            writer.writeEndElement();
        }
        writer.writeEndElement();
    }
    
}