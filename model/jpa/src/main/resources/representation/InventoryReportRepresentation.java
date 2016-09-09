package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A report on the quantities of each item that are, or will be, in stock. This
 * document is sent by a Buyer (for example a retailer) to a Seller (for example a
 * producer).
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:20:48 a. m.
 */
public class InventoryReportRepresentation{

	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private IndicatorType copyIndicator; 
	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private IdentifierType customizationID; 
	/**
	 * A code signifying the currency in which the Document is presented. This may be
	 * the same currency as the pricing or as the tax.
	 */
	private CurrencyCodeType codeTypeDocumentCurrencyCode; 
	/**
	 * An identifier for the InventoryReport, assigned by the Issuer.
	 */
	private IdentifierType ID; 
	/**
	 * The date, assigned by the sender, on which this document was issued.
	 */
	private DateType issueDate; 
	/**
	 * The time at which the InventoryReportRepresentation was issued.
	 */
	private TimeType issueTime; 
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private TextType note; 
	/**
	 * Identifies an instance of executing a profile, to associate all transactions in
	 * a collaboration.
	 */
	private IdentifierType profileExecutionID; 
	/**
	 * Identifies a user-defined profile of the customization of UBL being used.
	 */
	private IdentifierType profileID; 
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private IdentifierType UBLVersionID; 
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private IdentifierType UUID; 
	private CustomerPartyRepresentation retailerCustomerParty; 
	private List<DocumentReferenceRepresentation> documentReferences = new ArrayList<>(); 
	private List<InventoryReportLineRepresentation> inventoryReportLines = new ArrayList<>(); 
	private PartyRepresentation inventoryReportingParty; 
	private PeriodRepresentation inventoryPeriod; 
	private List<SignatureRepresentation> signatures = new ArrayList<>(); 
	private SupplierPartyRepresentation sellerSupplierParty; 

}