package org.openfact.models.jpa.entities.ubl;


/**
 * A document used to update information about prices in an existing Catalogue.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:19:49 a. m.
 */
public class CataloguePricingUpdate {

	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private String CustomizationID;
	/**
	 * Describes the Catalogue Revision.
	 */
	private String Description;
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
	 * The number of lines in the document.
	 */
	private BigDecimal LineCountNumeric;
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
	 * Identifies an instance of executing a profile, to associate all transactions in
	 * a collaboration.
	 */
	private String ProfileExecutionID;
	/**
	 * Identifies a user-defined profile of the subset of UBL being used.
	 */
	private String ProfileID;
	/**
	 * The date, assigned by the seller, on which the Catalogue was revised.
	 */
	private LocalDate RevisionDate;
	/**
	 * The time, assigned by the seller, at which the Catalogue was revised.
	 */
	private LocalTime RevisionTime;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private String UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private String UUID;
	/**
	 * Indicates the current version of the catalogue.
	 */
	private String VersionID;
	private Catalogue Pricing Update Line m_Catalogue Pricing Update Line;
	private Catalogue Reference Related Catalogue Reference;
	private Contract Referenced Contract;
	private CustomerParty Contractor CustomerParty;
	private Language Default Language;
	private Party Provider Party;
	private Party Receiver Party;
	private Period Validity Period;
	private Signature m_Signature;
	private Supplier Party Seller Supplier Party;
	private Trading Terms m_Trading Terms;

	public Catalogue Pricing Update(){

	}

	public void finalize() throws Throwable {

	}
	public Catalogue Pricing Update Line getCatalogue Pricing Update Line(){
		return m_Catalogue Pricing Update Line;
	}

	public CustomerParty getContractor CustomerParty(){
		return Contractor CustomerParty;
	}

	public String getCustomizationID(){
		return CustomizationID;
	}

	public Language getDefault Language(){
		return Default Language;
	}

	public String getDescription(){
		return Description;
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

	public BigDecimal getLineCountNumeric(){
		return LineCountNumeric;
	}

	public String getName(){
		return Name;
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

	public Party getProvider Party(){
		return Provider Party;
	}

	public Party getReceiver Party(){
		return Receiver Party;
	}

	public Contract getReferenced Contract(){
		return Referenced Contract;
	}

	public Catalogue Reference getRelated Catalogue Reference(){
		return Related Catalogue Reference;
	}

	public LocalDate getRevisionDate(){
		return RevisionDate;
	}

	public LocalTime getRevisionTime(){
		return RevisionTime;
	}

	public Supplier Party getSeller Supplier Party(){
		return Seller Supplier Party;
	}

	public Signature getSignature(){
		return m_Signature;
	}

	public Trading Terms getTrading Terms(){
		return m_Trading Terms;
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

	public String getVersionID(){
		return VersionID;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCatalogue Pricing Update Line(Catalogue Pricing Update Line newVal){
		m_Catalogue Pricing Update Line = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setContractor CustomerParty(CustomerParty newVal){
		Contractor CustomerParty = newVal;
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
	public void setDefault Language(Language newVal){
		Default Language = newVal;
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
	public void setLineCountNumeric(BigDecimal newVal){
		LineCountNumeric = newVal;
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
	public void setProvider Party(Party newVal){
		Provider Party = newVal;
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
	public void setReferenced Contract(Contract newVal){
		Referenced Contract = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setRelated Catalogue Reference(Catalogue Reference newVal){
		Related Catalogue Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setRevisionDate(LocalDate newVal){
		RevisionDate = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setRevisionTime(LocalTime newVal){
		RevisionTime = newVal;
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
	public void setTrading Terms(Trading Terms newVal){
		m_Trading Terms = newVal;
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

	/**
	 * 
	 * @param newVal
	 */
	public void setVersionID(String newVal){
		VersionID = newVal;
	}
}//end Catalogue Pricing Update