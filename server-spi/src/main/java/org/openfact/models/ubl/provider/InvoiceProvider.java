package org.openfact.models.ubl.provider;

import java.util.List;
import java.util.Map;

import org.openfact.models.ubl.InvoiceModel;
import org.openfact.models.OrganizationModel;
import org.openfact.models.enums.RequeridActionDocument;
import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

public interface InvoiceProvider extends Provider {

	InvoiceModel addInvoice(OrganizationModel organization, String ID);

	InvoiceModel getInvoiceById(OrganizationModel organization, String id);

	InvoiceModel getInvoiceByID(OrganizationModel organization, String ID);

	boolean removeInvoice(OrganizationModel organization, String id);

	boolean removeInvoice(OrganizationModel organization, InvoiceModel invoice);

	List<InvoiceModel> getInvoices(OrganizationModel organization);

	List<InvoiceModel> getInvoices(OrganizationModel organization, List<RequeridActionDocument> requeridAction,
			boolean intoRequeridAction);

	List<InvoiceModel> getInvoices(OrganizationModel organization, Integer firstResult, Integer maxResults);

	List<InvoiceModel> searchForInvoice(OrganizationModel organization, String filterText);

	List<InvoiceModel> searchForInvoice(OrganizationModel organization, String filterText, Integer firstResult,
			Integer maxResults);

	SearchResultsModel<InvoiceModel> searchForInvoice(OrganizationModel organization, SearchCriteriaModel criteria);

	SearchResultsModel<InvoiceModel> searchForInvoice(OrganizationModel organization, SearchCriteriaModel criteria,
			String filterText);

	int getInvoicesCount(OrganizationModel organization);

	InvoiceModel getLastInvoice(OrganizationModel organization, int IDInvoiceLength, String maskFormater);

}
