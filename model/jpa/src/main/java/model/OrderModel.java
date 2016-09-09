package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A document used to order goods and services.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:20:53 a. m.
 */
public class OrderModel{

	/**
	 * The buyer's accounting cost centre, applied to the OrderModel as a whole, expressed
	 * as text.
	 */
	private TextType AccountingCost;
	/**
	 * The buyer's accounting code, applied to the OrderModel as a whole.
	 */
	private CodeType AccountingCostCode;
	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private IndicatorType CopyIndicator;
	/**
	 * A supplementary reference for the Order.
	 */
	private TextType CustomerReference;
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
	 * The date, assigned by the sender, on which this document was issued.
	 */
	private DateType IssueDate;
	/**
	 * The time, assigned by the sender, at which this document was issued.
	 */
	private TimeType IssueTime;
	/**
	 * The number of OrderLines in the document.
	 */
	private NumericType LineCountNumeric;
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private TextType Note;
	/**
	 * A code signifying the type of Order.
	 */
	private CodeType OrderTypeCode;
	/**
	 * A code signifying the currency used for all prices in the Order.
	 */
	private CurrencyCodeType CodeTypePricingCurrencyCode;
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
	 * A code signifying the currency requested for amount totals in Invoices related
	 * to this Order.
	 */
	private CurrencyCodeType CodeTypeRequestedInvoiceCurrencyCode;
	/**
	 * An identifier for the Order, assigned by the seller.
	 */
	private IdentifierType SalesOrderID;
	/**
	 * A code signifying the currency requested for tax amounts in Invoices related to
	 * this Order.
	 */
	private CurrencyCodeType CodeTypeTaxCurrencyCode;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private IdentifierType UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private IdentifierType UUID;
	private List<AllowanceChargeModel> AllowanceCharges = new ArrayList<>();
	private List<CatalogueReferenceModel> CatalogueReferences = new ArrayList<>();
	private List<ContractModel> Contracts = new ArrayList<>();
	private CountryModel DestinationCountry;
	private CustomerPartyModel OriginatorCustomerParty;
	private CustomerPartyModel AccountingCustomerParty;
	private CustomerPartyModel BuyerCustomerParty;
	private List<DeliveryModel> Deliveries = new ArrayList<>();
	private List<DeliveryTermsModel> DeliveriesTerms = new ArrayList<>();
	private DocumentReferenceModel OrderDocumentReference;
	private DocumentReferenceModel AdditionalDocumentReference;
	private DocumentReferenceModel OriginatorDocumentReference;
	private DocumentReferenceModel QuotationDocumentReference;
	private ExchangeRateModel PaymentExchangeRate;
	private ExchangeRateModel PricingExchangeRate;
	private ExchangeRateModel TaxExchangeRate;
	private MonetaryTotalModel AnticipatedMonetaryTotal;
	private List<OrderLineModel> OrderLines = new ArrayList<>();
	private PartyModel FreightForwarderParty;
	private List<PaymentMeansModel> PaymentMeanses = new ArrayList<>();
	private List<PaymentTermsModel> PaymentTermses = new ArrayList<>();
	private PeriodModel ValidityPeriod;
	private List<ProjectReferenceModel> ProjectReferences = new ArrayList<>();
	private List<SignatureModel> Signatures = new ArrayList<>();
	private SupplierPartyModel SellerSupplierParty;
	private List<TaxTotalModel> TaxTotals = new ArrayList<>();
	private List<TransactionConditionsModel> TransactionConditionses = new ArrayList<>();

}
