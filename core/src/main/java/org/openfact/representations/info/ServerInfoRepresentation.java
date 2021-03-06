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

package org.openfact.representations.info;

import java.util.List;
import java.util.Map;

import org.openfact.representations.idm.ComponentTypeRepresentation;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class ServerInfoRepresentation {

    private SystemInfoRepresentation systemInfo;
    private MemoryInfoRepresentation memoryInfo;
    private ProfileInfoRepresentation profileInfo;

    private Map<String, List<ThemeInfoRepresentation>> themes;
    
    private List<Map<String, String>> identityProviders;
    
    private Map<String, List<ComponentTypeRepresentation>> componentTypes;

    private Map<String, SpiInfoRepresentation> providers;

    private Map<String, List<String>> enums;

    public SystemInfoRepresentation getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(SystemInfoRepresentation systemInfo) {
        this.systemInfo = systemInfo;
    }

    public MemoryInfoRepresentation getMemoryInfo() {
        return memoryInfo;
    }

    public void setMemoryInfo(MemoryInfoRepresentation memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    public ProfileInfoRepresentation getProfileInfo() {
        return profileInfo;
    }

    public void setProfileInfo(ProfileInfoRepresentation profileInfo) {
        this.profileInfo = profileInfo;
    }

    public Map<String, List<ThemeInfoRepresentation>> getThemes() {
        return themes;
    }

    public void setThemes(Map<String, List<ThemeInfoRepresentation>> themes) {
        this.themes = themes;
    }

    public List<Map<String, String>> getIdentityProviders() {
        return identityProviders;
    }

    public void setIdentityProviders(List<Map<String, String>> identityProviders) {
        this.identityProviders = identityProviders;
    }

    public Map<String, SpiInfoRepresentation> getProviders() {
        return providers;
    }

    public void setProviders(Map<String, SpiInfoRepresentation> providers) {
        this.providers = providers;
    }    

    public Map<String, List<String>> getEnums() {
        return enums;
    }

    public void setEnums(Map<String, List<String>> enums) {
        this.enums = enums;
    }

    public Map<String, List<ComponentTypeRepresentation>> getComponentTypes() {
        return componentTypes;
    }

    public void setComponentTypes(Map<String, List<ComponentTypeRepresentation>> componentTypes) {
        this.componentTypes = componentTypes;
    }
    
}
