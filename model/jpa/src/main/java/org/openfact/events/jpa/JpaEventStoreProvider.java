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

package org.openfact.events.jpa;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jboss.logging.Logger;
import org.openfact.events.Event;
import org.openfact.events.EventQuery;
import org.openfact.events.EventStoreProvider;
import org.openfact.events.EventType;
import org.openfact.events.admin.AdminEvent;
import org.openfact.events.admin.AdminEventQuery;
import org.openfact.events.admin.AuthDetails;
import org.openfact.events.admin.OperationType;
import org.openfact.events.admin.ResourceType;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class JpaEventStoreProvider implements EventStoreProvider {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final TypeReference<Map<String, String>> mapType = new TypeReference<Map<String, String>>() {
    };
    private static final Logger logger = Logger.getLogger(JpaEventStoreProvider.class);

    private EntityManager em;

    public JpaEventStoreProvider(EntityManager em) {
        this.em = em;
    }

    @Override
    public EventQuery createQuery() {
        return new JpaEventQuery(em);
    }

    @Override
    public void clear() {
        em.createQuery("delete from EventEntity").executeUpdate();
    }

    @Override
    public void clear(String organizationId) {
        em.createQuery("delete from EventEntity where organizationId = :organizationId").setParameter("organizationId", organizationId).executeUpdate();
    }

    @Override
    public void clear(String organizationId, long olderThan) {
        em.createQuery("delete from EventEntity where organizationId = :organizationId and time < :time").setParameter("organizationId", organizationId).setParameter("time", olderThan).executeUpdate();
    }

    @Override
    public void onEvent(Event event) {
        em.persist(convertEvent(event));
    }

    @Override
    public AdminEventQuery createAdminQuery() {
        return new JpaAdminEventQuery(em);
    }

    @Override
    public void clearAdmin() {
        em.createQuery("delete from AdminEventEntity").executeUpdate();
    }

    @Override
    public void clearAdmin(String organizationId) {
        em.createQuery("delete from AdminEventEntity where organizationId = :organizationId").setParameter("organizationId", organizationId).executeUpdate();
    }

    @Override
    public void clearAdmin(String organizationId, long olderThan) {
        em.createQuery("delete from AdminEventEntity where organizationId = :organizationId and time < :time").setParameter("organizationId", organizationId).setParameter("time", olderThan).executeUpdate();
    }

    @Override
    public void onEvent(AdminEvent event, boolean includeRepresentation) {
        em.persist(convertAdminEvent(event, includeRepresentation));
    }

    @Override
    public void close() {
    }

    static EventEntity convertEvent(Event event) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setId(UUID.randomUUID().toString());
        eventEntity.setTime(event.getTime());
        eventEntity.setType(event.getType().toString());
        eventEntity.setOrganizationId(event.getOrganizationId());
        eventEntity.setUserId(event.getUserId());
        eventEntity.setIpAddress(event.getIpAddress());
        eventEntity.setError(event.getError());
        try {
            eventEntity.setDetailsJson(mapper.writeValueAsString(event.getDetails()));
        } catch (IOException ex) {
            logger.error("Failed to write log details", ex);
        }
        return eventEntity;
    }

    static Event convertEvent(EventEntity eventEntity) {
        Event event = new Event();
        event.setTime(eventEntity.getTime());
        event.setType(EventType.valueOf(eventEntity.getType()));
        event.setOrganizationId(eventEntity.getOrganizationId());
        event.setUserId(eventEntity.getUserId());
        event.setIpAddress(eventEntity.getIpAddress());
        event.setError(eventEntity.getError());
        try {
            Map<String, String> details = mapper.readValue(eventEntity.getDetailsJson(), mapType);
            event.setDetails(details);
        } catch (IOException ex) {
            logger.error("Failed to read log details", ex);
        }
        return event;
    }
    
    static AdminEventEntity convertAdminEvent(AdminEvent adminEvent, boolean includeRepresentation) {
        AdminEventEntity adminEventEntity = new AdminEventEntity();
        adminEventEntity.setId(UUID.randomUUID().toString());
        adminEventEntity.setTime(adminEvent.getTime());
        adminEventEntity.setOrganizationId(adminEvent.getOrganizationId());
        setAuthDetails(adminEventEntity, adminEvent.getAuthDetails());
        adminEventEntity.setOperationType(adminEvent.getOperationType().toString());

        if (adminEvent.getResourceType() != null) {
            adminEventEntity.setResourceType(adminEvent.getResourceType().toString());
        }

        adminEventEntity.setResourcePath(adminEvent.getResourcePath());
        adminEventEntity.setError(adminEvent.getError());
        
        if(includeRepresentation) {
            adminEventEntity.setRepresentation(adminEvent.getRepresentation());
        }
        return adminEventEntity;
    }

    static AdminEvent convertAdminEvent(AdminEventEntity adminEventEntity) {
        AdminEvent adminEvent = new AdminEvent();
        adminEvent.setTime(adminEventEntity.getTime());
        adminEvent.setOrganizationId(adminEventEntity.getOrganizationId());
        setAuthDetails(adminEvent, adminEventEntity);
        adminEvent.setOperationType(OperationType.valueOf(adminEventEntity.getOperationType()));

        if (adminEventEntity.getResourceType() != null) {
            adminEvent.setResourceType(ResourceType.valueOf(adminEventEntity.getResourceType()));
        }

        adminEvent.setResourcePath(adminEventEntity.getResourcePath());
        adminEvent.setError(adminEventEntity.getError());
        
        if(adminEventEntity.getRepresentation() != null) {
            adminEvent.setRepresentation(adminEventEntity.getRepresentation());
        }
        return adminEvent;
    }
    
    private static void setAuthDetails(AdminEventEntity adminEventEntity, AuthDetails authDetails) {
        adminEventEntity.setAuthOrganizationId(authDetails.getOrganizationId());
        adminEventEntity.setAuthUserId(authDetails.getUserId());
        adminEventEntity.setAuthIpAddress(authDetails.getIpAddress());
    }
    
    private static void setAuthDetails(AdminEvent adminEvent, AdminEventEntity adminEventEntity) {
        AuthDetails authDetails = new AuthDetails();
        authDetails.setOrganizationId(adminEventEntity.getAuthOrganizationId());
        authDetails.setUserId(adminEventEntity.getAuthUserId());
        authDetails.setIpAddress(adminEventEntity.getAuthIpAddress());
        adminEvent.setAuthDetails(authDetails);
    }

}
