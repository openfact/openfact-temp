package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A document sent by a contracting party to an economic operator acknowledging
 * receipt of a Tender.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:21:30 a. m.
 */
public class TenderReceiptRepresentation{

	/**
	 * An identifier, assigned by the sender, for the process file (i.e., record) to
	 * which this document belongs.
	 */
	private IdentifierType ContractFolderID;
	/**
	 * Short title of a contract associated with this Tender.
	 */
	private TextType ContractName;
	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private IndicatorType CopyIndicator;
	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private IdentifierType CustomizationID;
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
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private TextType Note;
	/**
	 * Identifies an instance of executing a profile, to associate all transactions in
	 * a collaboration.
	 */
	private IdentifierType ProfileExecutionID;
	/**
	 * Identifies a user-defined profile of the customization of UBL being used.
	 */
	private IdentifierType ProfileID;
	/**
	 * The date, assigned by the sender, on which the TenderReceiptRepresentation was created.
	 */
	private DateType RegisteredDate;
	/**
	 * The time, assigned by the sender, at which the TenderReceiptRepresentation was created.
	 */
	private TimeType RegisteredTime;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private IdentifierType UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private IdentifierType UUID;
	private DocumentReferenceRepresentation TenderDocumentReference;
	private PartyRepresentation SenderParty;
	private PartyRepresentation ReceiverParty;
	private List<SignatureRepresentation> Signatures = new ArrayList<>();

}
