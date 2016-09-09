package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A credit note created by the debtor in a self billing arrangement with a
 * creditor; SelfBilledCreditNoteModel replaces DebitNoteModel in such arrangements.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:21:22 a. m.
 */
public class SelfBilledCreditNoteModel{

	/**
	 * The buyer's accounting code, applied to the SelfBilledCreditNoteModel as a whole,
	 * expressed as text.
	 */
	private TextType accountingCost; 
	/**
	 * The buyer's accounting code, applied to the SelfBilledCreditNoteModel as a whole.
	 */
	private CodeType accountingCostCode; 
	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private IndicatorType copyIndicator; 
	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private IdentifierType customizationID; 
	/**
	 * A code signifying the default currency for this document.
	 */
	private CurrencyCodeType codeTypeDocumentCurrencyCode; 
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
	 * The number of SelfBilledCreditNoteModel Lines in this document.
	 */
	private NumericType lineCountNumeric; 
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private TextType note; 
	/**
	 * A code signifying the alternative currency used for payment in the Self Billed
	 * CreditNote.
	 */
	private CurrencyCodeType codeTypePaymentAlternativeCurrencyCode; 
	/**
	 * A code signifying the currency used for payment in the SelfBilledCreditNote.
	 */
	private CurrencyCodeType codeTypePaymentCurrencyCode; 
	/**
	 * A code signifying the currency used for prices in the SelfBilledCreditNote.
	 */
	private CurrencyCodeType codeTypePricingCurrencyCode; 
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
	 * A code signifying the currency used for tax amounts in the Self Billed Credit
	 * Note.
	 */
	private CurrencyCodeType codeTypeTaxCurrencyCode; 
	/**
	 * The date of the SelfBilledCreditNote, used to indicate the point at which
	 * tax becomes applicable.
	 */
	private DateType taxPointDate; 
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private IdentifierType UBLVersionID; 
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private IdentifierType UUID; 
	private List<AllowanceChargeModel> allowanceCharges = new ArrayList<>(); 
	private List<BillingReferenceModel> billingReferences = new ArrayList<>(); 
	private List<CreditNoteLineModel> creditNoteLines = new ArrayList<>(); 
	private CustomerPartyModel accountingCustomerParty; 
	private CustomerPartyModel buyerCustomerParty; 
	private List<DeliveryModel> deliveries = new ArrayList<>(); 
	private List<DeliveryTermsModel> deliveriesTerms = new ArrayList<>(); 
	private DocumentReferenceModel contractDocumentReference; 
	private DocumentReferenceModel originatorDocumentReference; 
	private DocumentReferenceModel statementDocumentReference; 
	private DocumentReferenceModel despatchDocumentReference; 
	private DocumentReferenceModel receiptDocumentReference; 
	private DocumentReferenceModel additionalDocumentReference; 
	private ExchangeRateModel pricingExchangeRate; 
	private ExchangeRateModel paymentAlternativeExchangeRate; 
	private ExchangeRateModel paymentExchangeRate; 
	private ExchangeRateModel taxExchangeRate; 
	private MonetaryTotalModel legalMonetaryTotal; 
	private List<OrderReferenceModel> orderReferences = new ArrayList<>(); 
	private PartyModel taxRepresentativeParty; 
	private PartyModel payeeParty; 
	private List<PaymentMeansModel> paymentMeanses = new ArrayList<>(); 
	private List<PaymentTermsModel> paymentTermses = new ArrayList<>(); 
	private PeriodModel invoicePeriod; 
	private ResponseModel discrepancyResponse; 
	private List<SignatureModel> signatures = new ArrayList<>(); 
	private SupplierPartyModel sellerSupplierParty; 
	private SupplierPartyModel accountingSupplierParty; 
	private List<TaxTotalModel> taxTotals = new ArrayList<>(); 

}