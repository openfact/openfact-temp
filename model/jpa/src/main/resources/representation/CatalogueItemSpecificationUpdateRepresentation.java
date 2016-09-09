package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A document used to update information (e.g., technical descriptions and
 * properties) about Items in an existing Catalogue.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:19:36 a. m.
 */
public class CatalogueItemSpecificationUpdateRepresentation{

	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private IdentifierType customizationID; 
	/**
	 * Textual description of the document instance.
	 */
	private TextType description; 
	/**
	 * An identifier for this document, assigned by the sender.
	 */
	private IdentifierType ID; 
	/**
	 * The date, assigned by the sender, on which this document was issued.
	 */
	private DateType issueDate; 
	/**
	 * The time, assigned by the sender, at which this document was issued.
	 */
	private TimeType issueTime; 
	/**
	 * The number of catalogueItemSpecificationUpdateLines in this document.
	 */
	private NumericType lineCountNumeric; 
	/**
	 * Text, assigned by the sender, that identifies this document to business users.
	 */
	private NameType name; 
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
	 * Identifies a user-defined profile of the subset of UBL being used.
	 */
	private IdentifierType profileID; 
	/**
	 * The date, assigned by the seller, on which the CatalogueRepresentation was revised.
	 */
	private DateType revisionDate; 
	/**
	 * The time, assigned by the seller, at which the CatalogueRepresentation was revised.
	 */
	private TimeType revisionTime; 
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private IdentifierType UBLVersionID; 
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private IdentifierType UUID; 
	/**
	 * Identifies the current version of the Catalogue.
	 */
	private IdentifierType versionID; 
	private List<CatalogueItemSpecificationUpdateLineRepresentation> catalogueItemSpecificationUpdateLines = new ArrayList<>(); 
	private CatalogueReferenceRepresentation relatedCatalogueReference; 
	private ContractRepresentation referencedContract; 
	private CustomerPartyRepresentation contractorCustomerParty; 
	private LanguageRepresentation defaultLanguage; 
	private PartyRepresentation providerParty; 
	private PartyRepresentation receiverParty; 
	private PeriodRepresentation validityPeriod; 
	private List<SignatureRepresentation> signatures = new ArrayList<>(); 
	private SupplierPartyRepresentation sellerSupplierParty; 
	private List<TradingTermsRepresentation> tradingTermses = new ArrayList<>(); 

}