package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A document that specifies details of an actual payment.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:21:17 a. m.
 */
public class RemittanceAdviceModel{

	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private IndicatorType CopyIndicator;
	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private IdentifierType CustomizationID;
	/**
	 * A code signifying the default currency for this document.
	 */
	private CurrencyCodeType CodeTypeDocumentCurrencyCode;
	/**
	 * An identifier for this document, assigned by the sender.
	 */
	private IdentifierType ID;
	/**
	 * An internal reference to the order for payment by the invoicing party. This may
	 * have been requested of the payer by the payee to accompany the payer's
	 * remittance.
	 */
	private TextType InvoicingPartyReference;
	/**
	 * The date, assigned by the sender, on which this document was issued.
	 */
	private DateType IssueDate;
	/**
	 * The time, assigned by the sender, at which this document was issued.
	 */
	private TimeType IssueTime;
	/**
	 * The number of RemittanceAdviceLines in the document.
	 */
	private NumericType LineCountNumeric;
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private TextType Note;
	/**
	 * An internal reference to the payer's order for payment.
	 */
	private TextType PayerReference;
	/**
	 * An internal reference to the order for payment from the payer to the payer's
	 * bank.
	 */
	private TextType PaymentOrderReference;
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
	 * The totals of all credit amounts for the RemittanceAdvice.
	 */
	private AmountType TotalCreditAmount;
	/**
	 * The totals of all debit amounts for the RemittanceAdvice.
	 */
	private AmountType TotalDebitAmount;
	/**
	 * The total payable amount for the RemittanceAdviceModel (must be positive).
	 */
	private AmountType TotalPaymentAmount;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private IdentifierType UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private IdentifierType UUID;
	private List<BillingReferenceModel> BillingReferences = new ArrayList<>();
	private CustomerPartyModel AccountingCustomerParty;
	private DocumentReferenceModel AdditionalDocumentReference;
	private PartyModel PayeeParty;
	private List<PaymentMeansModel> PaymentMeanses = new ArrayList<>();
	private PeriodModel InvoicePeriod;
	private List<RemittanceAdviceLineModel> RemittanceAdviceLines = new ArrayList<>();
	private List<SignatureModel> Signatures = new ArrayList<>();
	private SupplierPartyModel AccountingSupplierParty;
	private List<TaxTotalModel> TaxTotals = new ArrayList<>();

}