package org.openfact.models.jpa.entities.ubl;


/**
 * A document issued by the party who acts as an agent for a transportation
 * carrier or other agents to the party who gives instructions for the
 * transportation services (shipper, consignor, etc.) stating the details of the
 * transportation, charges, and terms a
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:19:12 a. m.
 */
public class BillOfLading {

	/**
	 * A term used in commerce in reference to certain duties, called ad valorem
	 * duties, which are levied on commodities at certain rates per centum on their
	 * value.
	 */
	private boolean AdValoremIndicator;
	/**
	 * Reference number (such as a booking reference number) assigned by a carrier or
	 * its agent to identify a specific shipment when cargo space is reserved prior to
	 * loading.
	 */
	private String CarrierAssignedID;
	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private String CustomizationID;
	/**
	 * Value declared by the shipper or his agent solely for the purpose of varying
	 * the carrier's level of liability from that provided in the contract of carriage
	 * in case of loss or damage to goods or delayed delivery.
	 */
	private BigDecimal DeclaredCarriageValueAmount;
	/**
	 * Textual description of the document instance.
	 */
	private String Description;
	/**
	 * A code signifying the status of the Bill Of Lading (revision, replacement, etc.
	 * ).
	 */
	private Document Status_ String DocumentStatusCode;
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
	 * Text, assigned by the sender, that identifies this document to business users.
	 */
	private String Name;
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private String Note;
	/**
	 * Other free-text instructions to the forwarders or carriers related to the
	 * shipment. This element should only be used where such information cannot be
	 * represented in other structured information entities within the document.
	 */
	private String OtherInstruction;
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
	 * Reference number to identify a Shipping Order or Forwarding Instruction.
	 */
	private String ShippingOrderID;
	/**
	 * Indicates whether the transport document is consigned to order.
	 */
	private boolean ToOrderIndicator;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private String UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private String UUID;
	private Document Distribution m_Document Distribution;
	private Document Reference m_Document Reference;
	private Exchange Rate m_Exchange Rate;
	private Party Consignor Party;
	private Party Carrier Party;
	private Party Freight Forwarder Party;
	private Shipment m_Shipment;
	private Signature m_Signature;

	public Bill Of Lading(){

	}

	public void finalize() throws Throwable {

	}
	public boolean getAdValoremIndicator(){
		return AdValoremIndicator;
	}

	public Party getCarrier Party(){
		return Carrier Party;
	}

	public String getCarrierAssignedID(){
		return CarrierAssignedID;
	}

	public Party getConsignor Party(){
		return Consignor Party;
	}

	public String getCustomizationID(){
		return CustomizationID;
	}

	public BigDecimal getDeclaredCarriageValueAmount(){
		return DeclaredCarriageValueAmount;
	}

	public String getDescription(){
		return Description;
	}

	public Document Distribution getDocument Distribution(){
		return m_Document Distribution;
	}

	public Document Reference getDocument Reference(){
		return m_Document Reference;
	}

	public Document Status_ String getDocumentStatusCode(){
		return DocumentStatusCode;
	}

	public Exchange Rate getExchange Rate(){
		return m_Exchange Rate;
	}

	public Party getFreight Forwarder Party(){
		return Freight Forwarder Party;
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

	public String getName(){
		return Name;
	}

	public String getNote(){
		return Note;
	}

	public String getOtherInstruction(){
		return OtherInstruction;
	}

	public String getProfileExecutionID(){
		return ProfileExecutionID;
	}

	public String getProfileID(){
		return ProfileID;
	}

	public Shipment getShipment(){
		return m_Shipment;
	}

	public String getShippingOrderID(){
		return ShippingOrderID;
	}

	public Signature getSignature(){
		return m_Signature;
	}

	public boolean getToOrderIndicator(){
		return ToOrderIndicator;
	}

	public String getUBLVersionID(){
		return UBLVersionID;
	}

	public String getUUID(){
		return UUID;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAdValoremIndicator(boolean newVal){
		AdValoremIndicator = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCarrier Party(Party newVal){
		Carrier Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCarrierAssignedID(String newVal){
		CarrierAssignedID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setConsignor Party(Party newVal){
		Consignor Party = newVal;
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
	public void setDeclaredCarriageValueAmount(BigDecimal newVal){
		DeclaredCarriageValueAmount = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDescription(String newVal){
		Description = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDocument Distribution(Document Distribution newVal){
		m_Document Distribution = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDocument Reference(Document Reference newVal){
		m_Document Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDocumentStatusCode(Document Status_ String newVal){
		DocumentStatusCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setExchange Rate(Exchange Rate newVal){
		m_Exchange Rate = newVal;
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
	public void setName(String newVal){
		Name = newVal;
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
	public void setOtherInstruction(String newVal){
		OtherInstruction = newVal;
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
	public void setShipment(Shipment newVal){
		m_Shipment = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setShippingOrderID(String newVal){
		ShippingOrderID = newVal;
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
	public void setToOrderIndicator(boolean newVal){
		ToOrderIndicator = newVal;
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
}//end Bill Of Lading