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

package org.openfact.keys;

import org.openfact.provider.ProviderConfigProperty;

import static org.openfact.provider.ProviderConfigProperty.BOOLEAN_TYPE;
import static org.openfact.provider.ProviderConfigProperty.FILE_TYPE;
import static org.openfact.provider.ProviderConfigProperty.STRING_TYPE;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public interface Attributes {

    String PRIORITY_KEY = "priority";
    ProviderConfigProperty PRIORITY_PROPERTY = new ProviderConfigProperty(PRIORITY_KEY, "Priority", "Priority for the provider", STRING_TYPE, "0");

    String ENABLED_KEY = "enabled";
    ProviderConfigProperty ENABLED_PROPERTY = new ProviderConfigProperty(ENABLED_KEY, "Enabled", "Set if the keys are enabled", BOOLEAN_TYPE, "true");

    String ACTIVE_KEY = "active";
    ProviderConfigProperty ACTIVE_PROPERTY = new ProviderConfigProperty(ACTIVE_KEY, "Active", "Set if the keys can be used for signing", BOOLEAN_TYPE, "true");

    String PRIVATE_KEY_KEY = "privateKey";
    ProviderConfigProperty PRIVATE_KEY_PROPERTY = new ProviderConfigProperty(PRIVATE_KEY_KEY, "Private RSA Key", "Private RSA Key encoded in PEM format", FILE_TYPE, null, true);

    String CERTIFICATE_KEY = "certificate";
    ProviderConfigProperty CERTIFICATE_PROPERTY = new ProviderConfigProperty(CERTIFICATE_KEY, "X509 Certificate", "X509 Certificate encoded in PEM format", FILE_TYPE, null);

    String KEY_SIZE_KEY = "keySize";
    ProviderConfigProperty KEY_SIZE_PROPERTY = new ProviderConfigProperty(KEY_SIZE_KEY, "Keysize", "Size for the generated keys (1024, 2048 or 4096)", STRING_TYPE, null);

}
