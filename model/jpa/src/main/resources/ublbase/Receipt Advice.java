

/**
 * A document used to describe the receipt of goods and services.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:21:12 a. m.
 */
public class Receipt Advice {

	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private Indicator. Type CopyIndicator;
	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private Identifier. Type CustomizationID;
	/**
	 * A code signifying the status of the Receipt Advice with respect to its original
	 * state. This code may be used if the document precedes the event and is
	 * subsequently found to be incorrect and in need of cancellation or revision.
	 */
	private Document Status_ Code. Type DocumentStatusCode;
	/**
	 * An identifier for this document, assigned by the sender.
	 */
	private Identifier. Type ID;
	/**
	 * The date, assigned by the sender, on which this document was issued.
	 */
	private Date. Type IssueDate;
	/**
	 * The time, assigned by the sender, at which this document was issued.
	 */
	private Time. Type IssueTime;
	/**
	 * The number of Receipt Lines in this document.
	 */
	private Numeric. Type LineCountNumeric;
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private Text. Type Note;
	/**
	 * Identifies an instance of executing a profile, to associate all transactions in
	 * a collaboration.
	 */
	private Identifier. Type ProfileExecutionID;
	/**
	 * Identifies a user-defined profile of the subset of UBL being used.
	 */
	private Identifier. Type ProfileID;
	/**
	 * A code signifying the type of the Receipt Advice.
	 */
	private Receipt Advice Type_ Code. Type ReceiptAdviceTypeCode;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private Identifier. Type UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private Identifier. Type UUID;
	private Customer Party Delivery Customer Party;
	private Customer Party Buyer Customer Party;
	private Document Reference Additional Document Reference;
	private Document Reference Despatch Document Reference;
	private Order Reference m_Order Reference;
	private Receipt Line m_Receipt Line;
	private Shipment m_Shipment;
	private Signature m_Signature;
	private Supplier Party Despatch Supplier Party;
	private Supplier Party Seller Supplier Party;

	public Receipt Advice(){

	}

	public void finalize() throws Throwable {

	}
	public Document Reference getAdditional Document Reference(){
		return Additional Document Reference;
	}

	public Customer Party getBuyer Customer Party(){
		return Buyer Customer Party;
	}

	public Indicator. Type getCopyIndicator(){
		return CopyIndicator;
	}

	public Identifier. Type getCustomizationID(){
		return CustomizationID;
	}

	public Customer Party getDelivery Customer Party(){
		return Delivery Customer Party;
	}

	public Document Reference getDespatch Document Reference(){
		return Despatch Document Reference;
	}

	public Supplier Party getDespatch Supplier Party(){
		return Despatch Supplier Party;
	}

	public Document Status_ Code. Type getDocumentStatusCode(){
		return DocumentStatusCode;
	}

	public Identifier. Type getID(){
		return ID;
	}

	public Date. Type getIssueDate(){
		return IssueDate;
	}

	public Time. Type getIssueTime(){
		return IssueTime;
	}

	public Numeric. Type getLineCountNumeric(){
		return LineCountNumeric;
	}

	public Text. Type getNote(){
		return Note;
	}

	public Order Reference getOrder Reference(){
		return m_Order Reference;
	}

	public Identifier. Type getProfileExecutionID(){
		return ProfileExecutionID;
	}

	public Identifier. Type getProfileID(){
		return ProfileID;
	}

	public Receipt Line getReceipt Line(){
		return m_Receipt Line;
	}

	public Receipt Advice Type_ Code. Type getReceiptAdviceTypeCode(){
		return ReceiptAdviceTypeCode;
	}

	public Supplier Party getSeller Supplier Party(){
		return Seller Supplier Party;
	}

	public Shipment getShipment(){
		return m_Shipment;
	}

	public Signature getSignature(){
		return m_Signature;
	}

	public Identifier. Type getUBLVersionID(){
		return UBLVersionID;
	}

	public Identifier. Type getUUID(){
		return UUID;
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
	public void setBuyer Customer Party(Customer Party newVal){
		Buyer Customer Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCopyIndicator(Indicator. Type newVal){
		CopyIndicator = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCustomizationID(Identifier. Type newVal){
		CustomizationID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDelivery Customer Party(Customer Party newVal){
		Delivery Customer Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDespatch Document Reference(Document Reference newVal){
		Despatch Document Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDespatch Supplier Party(Supplier Party newVal){
		Despatch Supplier Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDocumentStatusCode(Document Status_ Code. Type newVal){
		DocumentStatusCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setID(Identifier. Type newVal){
		ID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIssueDate(Date. Type newVal){
		IssueDate = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIssueTime(Time. Type newVal){
		IssueTime = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLineCountNumeric(Numeric. Type newVal){
		LineCountNumeric = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNote(Text. Type newVal){
		Note = newVal;
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
	public void setProfileExecutionID(Identifier. Type newVal){
		ProfileExecutionID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setProfileID(Identifier. Type newVal){
		ProfileID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setReceipt Line(Receipt Line newVal){
		m_Receipt Line = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setReceiptAdviceTypeCode(Receipt Advice Type_ Code. Type newVal){
		ReceiptAdviceTypeCode = newVal;
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
	public void setShipment(Shipment newVal){
		m_Shipment = newVal;
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
	public void setUBLVersionID(Identifier. Type newVal){
		UBLVersionID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setUUID(Identifier. Type newVal){
		UUID = newVal;
	}
}//end Receipt Advice