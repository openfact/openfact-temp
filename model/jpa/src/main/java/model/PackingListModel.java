package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A document describing how goods are packed.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:21:05 a. m.
 */
public class PackingListModel{

	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private IdentifierType CustomizationID;
	/**
	 * Textual description of the document instance.
	 */
	private TextType Description;
	/**
	 * An identifier for this document, assigned by the sender.
	 */
	private IdentifierType ID;
	/**
	 * The date, assigned by the sender, on which this document was issued.
	 */
	private DateType IssueDate;
	/**
	 * The time, assigned by the sender, at which this document was issued.
	 */
	private TimeType IssueTime;
	/**
	 * Text, assigned by the sender, that identifies this document to business users.
	 */
	private NameType Name;
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private TextType Note;
	/**
	 * Contains other free-text-based instructions related to the shipment to the
	 * forwarders or carriers. This should only be used where such information cannot
	 * be represented in other structured information entities within the document.
	 */
	private TextType OtherInstruction;
	/**
	 * Identifies an instance of executing a profile, to associate all transactions in
	 * a collaboration.
	 */
	private IdentifierType ProfileExecutionID;
	/**
	 * Identifies a user-defined profile of the subset of UBL being used.
	 */
	private IdentifierType ProfileID;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private IdentifierType UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document..
	 */
	private IdentifierType UUID;
	/**
	 * Version identifier of a PackingList.
	 */
	private IdentifierType VersionID;
	private List<DocumentDistributionModel> DocumentDistributions = new ArrayList<>();
	private List<DocumentReferenceModel> DocumentReferences = new ArrayList<>();
	private PartyModel ConsignorParty;
	private PartyModel CarrierParty;
	private PartyModel FreightForwarderParty;
	private List<ShipmentModel> Shipments = new ArrayList<>();
	private List<SignatureModel> Signatures = new ArrayList<>();

}