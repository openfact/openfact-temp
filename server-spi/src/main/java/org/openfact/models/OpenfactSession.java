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

package org.openfact.models;

import org.openfact.component.ComponentModel;
import org.openfact.models.catalog.CodeCatalogProvider;
import org.openfact.models.catalog.CountryCatalogProvider;
import org.openfact.models.catalog.CurrencyCatalogProvider;
import org.openfact.models.catalog.UnitCatalogProvider;
import org.openfact.models.ubl.provider.CreditNoteProvider;
import org.openfact.models.ubl.provider.DebitNoteProvider;
import org.openfact.models.ubl.provider.InvoiceProvider;
import org.openfact.models.ubl.provider.JobReportProvider;
import org.openfact.models.ubl.provider.SendEventProvider;
import org.openfact.models.ubl.provider.pe.PerceptionProvider;
import org.openfact.models.ubl.provider.pe.RetentionProvider;
import org.openfact.models.ubl.provider.pe.SummaryDocumentsProvider;
import org.openfact.models.ubl.provider.pe.VoidedDocumentsProvider;
import org.openfact.provider.Provider;
import org.openfact.scripting.ScriptingProvider;

import java.util.Set;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface OpenfactSession {

	OpenfactContext getContext();

	OpenfactTransactionManager getTransactionManager();

	/**
	 * Get dedicated provider instance of provider type clazz that was created
	 * for this session. If one hasn't been created yet, find the factory and
	 * allocate by calling ProviderFactory.create(OpenfactSession). The provider
	 * to use is determined by the "provider" config entry in openfact-server
	 * boot configuration. (openfact-server.json)
	 *
	 *
	 *
	 * @param clazz
	 * @param <T>
	 * @return
	 */
	<T extends Provider> T getProvider(Class<T> clazz);

	/**
	 * Get dedicated provider instance for a specific provider factory of id of
	 * provider type clazz that was created for this session. If one hasn't been
	 * created yet, find the factory and allocate by calling
	 * ProviderFactory.create(OpenfactSession).
	 * 
	 * @param clazz
	 * @param id
	 * @param <T>
	 * @return
	 */
	<T extends Provider> T getProvider(Class<T> clazz, String id);

	<T extends Provider> T getProvider(Class<T> clazz, ComponentModel componentModel);

	/**
	 * Get all provider factories that manage provider instances of class.
	 *
	 * @param clazz
	 * @param <T>
	 * @return
	 */
	<T extends Provider> Set<String> listProviderIds(Class<T> clazz);

	<T extends Provider> Set<T> getAllProviders(Class<T> clazz);

	Class<? extends Provider> getProviderClass(String providerClassName);

	Object getAttribute(String attribute);

	Object removeAttribute(String attribute);

	void setAttribute(String name, Object value);

	void enlistForClose(Provider provider);

	OpenfactSessionFactory getOpenfactSessionFactory();

	/**
	 * Returns a managed provider instance. Will start a provider transaction.
	 * This transaction is managed by the OpenfactSession transaction.
	 *
	 * @return
	 * @throws IllegalStateException
	 *             if transaction is not active
	 */
	OrganizationProvider organizations();

	InvoiceProvider invoices();

	CreditNoteProvider creditNotes();

	DebitNoteProvider debitNotes();

	PerceptionProvider perception();

	RetentionProvider retention();

	SummaryDocumentsProvider summaryDocuments();

	VoidedDocumentsProvider voidedDocuments();

	CodeCatalogProvider codesCatalog();

	CountryCatalogProvider countriesCatalog();

	CurrencyCatalogProvider currenciesCatalog();

	UnitCatalogProvider unitsCatalog();

	public JobReportProvider jobReport();

	public SendEventProvider sendEvent();

	void close();

	/**
	 * Key manager
	 *
	 * @return
	 */
	KeyManager keys();

	/**
	 * Openfact scripting support.
	 */
	ScriptingProvider scripting();
}
