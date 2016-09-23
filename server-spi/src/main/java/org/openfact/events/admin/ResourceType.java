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
package org.openfact.events.admin;

/**
 * Represents Openfact resource types for which {@link AdminEvent AdminEvent's} can be triggered.
 *
 * @author <a href="mailto:thomas.darimont@gmail.com">Thomas Darimont</a>
 */
public enum ResourceType {

    /**
     *
     */
    ORGANIZATION

    /**
     *
     */
    , ORGANIZATION_ROLE

    /**
     *
     */
    , ORGANIZATION_ROLE_MAPPING

    /**
     *
     */
    , ORGANIZATION_SCOPE_MAPPING

    /**
     *
     */
    , AUTH_FLOW

    /**
     *
     */
    , AUTH_EXECUTION_FLOW

    /**
     *
     */
    , AUTH_EXECUTION

    /**
     *
     */
    , AUTHENTICATOR_CONFIG

    /**
     *
     */
    , REQUIRED_ACTION

    /**
     *
     */
    , IDENTITY_PROVIDER

    /**
     *
     */
    , IDENTITY_PROVIDER_MAPPER

    /**
     *
     */
    , PROTOCOL_MAPPER

    /**
     *
     */
    , USER

    /**
     *
     */
    , USER_LOGIN_FAILURE

    /**
     *
     */
    , USER_SESSION

    /**
     *
     */
    , USER_FEDERATION_PROVIDER

    /**
     *
     */
    , USER_FEDERATION_MAPPER

    /**
     *
     */
    , GROUP

    /**
     *
     */
    , GROUP_MEMBERSHIP

    /**
     *
     */
    , CLIENT

    /**
     *
     */
    , CLIENT_INITIAL_ACCESS_MODEL

    /**
     *
     */
    , CLIENT_REGISTRATION_TRUSTED_HOST_MODEL

    /**
     *
     */
    , CLIENT_ROLE

    /**
     *
     */
    , CLIENT_ROLE_MAPPING

    /**
     *
     */
    , CLIENT_TEMPLATE

    /**
     *
     */
    , CLIENT_SCOPE_MAPPING

    /**
     *
     */
    , CLUSTER_NODE;
}
