package org.openfact.models.jpa.entities.ubl;


/**
 * A document used to indicate detailed acceptance or rejection of an Order or to
 * make a counter-offer.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:20:59 a. m.
 */
public class OrderResponse {

	/**
	 * An accounting cost code applied to the order as a whole, expressed as text.
	 */
	private String AccountingCost;
	/**
	 * An accounting cost code applied to the order as a whole.
	 */
	private String AccountingCostCode;
	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private boolean CopyIndicator;
	/**
	 * A supplementary reference assigned by the buyer, e.g., the CRI in a purchasing
	 * card transaction.
	 */
	private String CustomerReference;
	/**
	 * Identifies a user-defined customization of UBL.
	 */
	private String CustomizationID;
	/**
	 * A code signifying the default currency for this document.
	 */
	private Currency_ String DocumentCurrencyCode;
	/**
	 * The total volume of the goods in the Order Response including packaging.
	 */
	private Measure. Type GrossVolumeMeasure;
	/**
	 * The total gross weight for the Order Response (goods + packaging + transport
	 * equipment).
	 */
	private Measure. Type GrossWeightMeasure;
	/**
	 * An identifier for this document, assigned by the sender.
	 */
	private String ID;
	/**
	 * The date, assigned by the sender, on which this document was issued.
	 */
	private LocalDate IssueDate;
	/**
	 * The time, assigned by the sender, at which this document was issued.
	 */
	private LocalTime IssueTime;
	/**
	 * The number of Order Lines in this document.
	 */
	private BigDecimal LineCountNumeric;
	/**
	 * The total net weight of the goods in the Order Response excluding packaging.
	 */
	private Measure. Type NetNetWeightMeasure;
	/**
	 * The total volume of the goods in the Order Response excluding packaging.
	 */
	private Measure. Type NetVolumeMeasure;
	/**
	 * The total net weight for the Order Response (goods + packaging).
	 */
	private Measure. Type NetWeightMeasure;
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private String Note;
	/**
	 * A code signifying the type of response for this Order.
	 */
	private String OrderResponseCode;
	/**
	 * A code signifying the currency that is used for all prices in the Order
	 * Response.
	 */
	private Currency_ String PricingCurrencyCode;
	/**
	 * Identifies an instance of executing a profile, to associate all transactions in
	 * a collaboration.
	 */
	private String ProfileExecutionID;
	/**
	 * Identifies a user-defined profile of the customization of UBL being used.
	 */
	private String ProfileID;
	/**
	 * An identifier for the Order, issued by the Seller.
	 */
	private String SalesOrderID;
	/**
	 * A code signifying the currency that is used for all tax amounts in the Order
	 * Response.
	 */
	private Currency_ String TaxCurrencyCode;
	/**
	 * The total number of packages contained in the Order Response.
	 */
	private BigDecimal TotalPackagesQuantity;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private String UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private String UUID;
	private Allowance Charge m_Allowance Charge;
	private Contract m_Contract;
	private Country Destination Country;
	private Customer Party Originator Customer Party;
	private Customer Party Accounting Customer Party;
	private Customer Party Buyer Customer Party;
	private Delivery m_Delivery;
	private Delivery Terms m_Delivery Terms;
	private Document Reference Additional Document Reference;
	private Document Reference Originator Document Reference;
	private Document Reference Order Document Reference;
	private Exchange Rate Tax Exchange Rate;
	private Exchange Rate Pricing Exchange Rate;
	private Exchange Rate Payment Exchange Rate;
	private Monetary Total Legal Monetary Total;
	private Order Line m_Order Line;
	private Order Reference m_Order Reference;
	private Party Freight Forwarder Party;
	private Payment Means m_Payment Means;
	private Payment Terms m_Payment Terms;
	private Period Validity Period;
	private Signature m_Signature;
	private Supplier Party Seller Supplier Party;
	private Supplier Party Accounting Supplier Party;
	private Tax Total m_Tax Total;
	private Transaction Conditions m_Transaction Conditions;

	public Order Response(){

	}

	public void finalize() throws Throwable {

	}
	public Customer Party getAccounting Customer Party(){
		return Accounting Customer Party;
	}

	public Supplier Party getAccounting Supplier Party(){
		return Accounting Supplier Party;
	}

	public String getAccountingCost(){
		return AccountingCost;
	}

	public String getAccountingCostCode(){
		return AccountingCostCode;
	}

	public Document Reference getAdditional Document Reference(){
		return Additional Document Reference;
	}

	public Allowance Charge getAllowance Charge(){
		return m_Allowance Charge;
	}

	public Customer Party getBuyer Customer Party(){
		return Buyer Customer Party;
	}

	public Contract getContract(){
		return m_Contract;
	}

	public boolean getCopyIndicator(){
		return CopyIndicator;
	}

	public String getCustomerReference(){
		return CustomerReference;
	}

	public String getCustomizationID(){
		return CustomizationID;
	}

	public Delivery getDelivery(){
		return m_Delivery;
	}

	public Delivery Terms getDelivery Terms(){
		return m_Delivery Terms;
	}

	public Country getDestination Country(){
		return Destination Country;
	}

	public Currency_ String getDocumentCurrencyCode(){
		return DocumentCurrencyCode;
	}

	public Party getFreight Forwarder Party(){
		return Freight Forwarder Party;
	}

	public Measure. Type getGrossVolumeMeasure(){
		return GrossVolumeMeasure;
	}

	public Measure. Type getGrossWeightMeasure(){
		return GrossWeightMeasure;
	}

	public String getID(){
		return ID;
	}

	public LocalDate getIssueDate(){
		return IssueDate;
	}

	public LocalTime getIssueTime(){
		return IssueTime;
	}

	public Monetary Total getLegal Monetary Total(){
		return Legal Monetary Total;
	}

	public BigDecimal getLineCountNumeric(){
		return LineCountNumeric;
	}

	public Measure. Type getNetNetWeightMeasure(){
		return NetNetWeightMeasure;
	}

	public Measure. Type getNetVolumeMeasure(){
		return NetVolumeMeasure;
	}

	public Measure. Type getNetWeightMeasure(){
		return NetWeightMeasure;
	}

	public String getNote(){
		return Note;
	}

	public Document Reference getOrder Document Reference(){
		return Order Document Reference;
	}

	public Order Line getOrder Line(){
		return m_Order Line;
	}

	public Order Reference getOrder Reference(){
		return m_Order Reference;
	}

	public String getOrderResponseCode(){
		return OrderResponseCode;
	}

	public Customer Party getOriginator Customer Party(){
		return Originator Customer Party;
	}

	public Document Reference getOriginator Document Reference(){
		return Originator Document Reference;
	}

	public Exchange Rate getPayment Exchange Rate(){
		return Payment Exchange Rate;
	}

	public Payment Means getPayment Means(){
		return m_Payment Means;
	}

	public Payment Terms getPayment Terms(){
		return m_Payment Terms;
	}

	public Exchange Rate getPricing Exchange Rate(){
		return Pricing Exchange Rate;
	}

	public Currency_ String getPricingCurrencyCode(){
		return PricingCurrencyCode;
	}

	public String getProfileExecutionID(){
		return ProfileExecutionID;
	}

	public String getProfileID(){
		return ProfileID;
	}

	public String getSalesOrderID(){
		return SalesOrderID;
	}

	public Supplier Party getSeller Supplier Party(){
		return Seller Supplier Party;
	}

	public Signature getSignature(){
		return m_Signature;
	}

	public Exchange Rate getTax Exchange Rate(){
		return Tax Exchange Rate;
	}

	public Tax Total getTax Total(){
		return m_Tax Total;
	}

	public Currency_ String getTaxCurrencyCode(){
		return TaxCurrencyCode;
	}

	public BigDecimal getTotalPackagesQuantity(){
		return TotalPackagesQuantity;
	}

	public Transaction Conditions getTransaction Conditions(){
		return m_Transaction Conditions;
	}

	public String getUBLVersionID(){
		return UBLVersionID;
	}

	public String getUUID(){
		return UUID;
	}

	public Period getValidity Period(){
		return Validity Period;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAccounting Customer Party(Customer Party newVal){
		Accounting Customer Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAccounting Supplier Party(Supplier Party newVal){
		Accounting Supplier Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAccountingCost(String newVal){
		AccountingCost = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAccountingCostCode(String newVal){
		AccountingCostCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAdditional Document Reference(Document Reference newVal){
		Additional Document Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAllowance Charge(Allowance Charge newVal){
		m_Allowance Charge = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBuyer Customer Party(Customer Party newVal){
		Buyer Customer Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setContract(Contract newVal){
		m_Contract = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCopyIndicator(boolean newVal){
		CopyIndicator = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCustomerReference(String newVal){
		CustomerReference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCustomizationID(String newVal){
		CustomizationID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDelivery(Delivery newVal){
		m_Delivery = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDelivery Terms(Delivery Terms newVal){
		m_Delivery Terms = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDestination Country(Country newVal){
		Destination Country = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDocumentCurrencyCode(Currency_ String newVal){
		DocumentCurrencyCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFreight Forwarder Party(Party newVal){
		Freight Forwarder Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setGrossVolumeMeasure(Measure. Type newVal){
		GrossVolumeMeasure = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setGrossWeightMeasure(Measure. Type newVal){
		GrossWeightMeasure = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setID(String newVal){
		ID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIssueDate(LocalDate newVal){
		IssueDate = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIssueTime(LocalTime newVal){
		IssueTime = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLegal Monetary Total(Monetary Total newVal){
		Legal Monetary Total = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLineCountNumeric(BigDecimal newVal){
		LineCountNumeric = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNetNetWeightMeasure(Measure. Type newVal){
		NetNetWeightMeasure = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNetVolumeMeasure(Measure. Type newVal){
		NetVolumeMeasure = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNetWeightMeasure(Measure. Type newVal){
		NetWeightMeasure = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNote(String newVal){
		Note = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOrder Document Reference(Document Reference newVal){
		Order Document Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOrder Line(Order Line newVal){
		m_Order Line = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOrder Reference(Order Reference newVal){
		m_Order Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOrderResponseCode(String newVal){
		OrderResponseCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOriginator Customer Party(Customer Party newVal){
		Originator Customer Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOriginator Document Reference(Document Reference newVal){
		Originator Document Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPayment Exchange Rate(Exchange Rate newVal){
		Payment Exchange Rate = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPayment Means(Payment Means newVal){
		m_Payment Means = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPayment Terms(Payment Terms newVal){
		m_Payment Terms = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPricing Exchange Rate(Exchange Rate newVal){
		Pricing Exchange Rate = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPricingCurrencyCode(Currency_ String newVal){
		PricingCurrencyCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setProfileExecutionID(String newVal){
		ProfileExecutionID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setProfileID(String newVal){
		ProfileID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSalesOrderID(String newVal){
		SalesOrderID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSeller Supplier Party(Supplier Party newVal){
		Seller Supplier Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSignature(Signature newVal){
		m_Signature = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTax Exchange Rate(Exchange Rate newVal){
		Tax Exchange Rate = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTax Total(Tax Total newVal){
		m_Tax Total = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTaxCurrencyCode(Currency_ String newVal){
		TaxCurrencyCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTotalPackagesQuantity(BigDecimal newVal){
		TotalPackagesQuantity = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTransaction Conditions(Transaction Conditions newVal){
		m_Transaction Conditions = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setUBLVersionID(String newVal){
		UBLVersionID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setUUID(String newVal){
		UUID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setValidity Period(Period newVal){
		Validity Period = newVal;
	}
}//end Order Response