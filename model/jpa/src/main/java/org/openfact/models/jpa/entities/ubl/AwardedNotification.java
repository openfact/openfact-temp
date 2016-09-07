package org.openfact.models.jpa.entities.ubl;


/**
 * The document used to communicate a contract award to the winner.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:19:10 a. m.
 */
public class AwardedNotification {

	/**
	 * An identifier, assigned by the sender, for the process file (i.e., record) to
	 * which this document belongs.
	 */
	private String ContractFolderID;
	/**
	 * The name, expressed as text, of this procurement project.
	 */
	private String ContractName;
	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private boolean CopyIndicator;
	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private String CustomizationID;
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
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private String Note;
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
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private String UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private String UUID;
	private Document Reference Minutes Document Reference;
	private Document Reference Additional Document Reference;
	private Financial Guarantee Final Financial Guarantee;
	private Party Receiver Party;
	private Party Sender Party;
	private Signature m_Signature;
	private Tender Result m_Tender Result;

	public Awarded Notification(){

	}

	public void finalize() throws Throwable {

	}
	public Document Reference getAdditional Document Reference(){
		return Additional Document Reference;
	}

	public String getContractFolderID(){
		return ContractFolderID;
	}

	public String getContractName(){
		return ContractName;
	}

	public boolean getCopyIndicator(){
		return CopyIndicator;
	}

	public String getCustomizationID(){
		return CustomizationID;
	}

	public Financial Guarantee getFinal Financial Guarantee(){
		return Final Financial Guarantee;
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

	public Document Reference getMinutes Document Reference(){
		return Minutes Document Reference;
	}

	public String getNote(){
		return Note;
	}

	public String getProfileExecutionID(){
		return ProfileExecutionID;
	}

	public String getProfileID(){
		return ProfileID;
	}

	public Party getReceiver Party(){
		return Receiver Party;
	}

	public Party getSender Party(){
		return Sender Party;
	}

	public Signature getSignature(){
		return m_Signature;
	}

	public Tender Result getTender Result(){
		return m_Tender Result;
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
	public void setAdditional Document Reference(Document Reference newVal){
		Additional Document Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setContractFolderID(String newVal){
		ContractFolderID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setContractName(String newVal){
		ContractName = newVal;
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
	public void setCustomizationID(String newVal){
		CustomizationID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFinal Financial Guarantee(Financial Guarantee newVal){
		Final Financial Guarantee = newVal;
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
	public void setMinutes Document Reference(Document Reference newVal){
		Minutes Document Reference = newVal;
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
	public void setReceiver Party(Party newVal){
		Receiver Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSender Party(Party newVal){
		Sender Party = newVal;
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
	public void setTender Result(Tender Result newVal){
		m_Tender Result = newVal;
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
}//end Awarded Notification