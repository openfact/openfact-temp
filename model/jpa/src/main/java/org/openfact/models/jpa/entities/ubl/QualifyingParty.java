package org.openfact.models.jpa.entities.ubl;


/**
 * A class to describe the distinctive features or characteristics qualifying an
 * economic operator to be a party in a tendering process (e.g., number of
 * employees, number of operating units, type of business, technical and financial
 * capabilities, completed p
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:14 a. m.
 */
public class QualifyingParty {

	/**
	 * An identifier for an item of evidence to support the classification of this
	 * qualifying party.
	 */
	private String BusinessClassificationEvidenceID;
	/**
	 * An identifier for an item of evidence to support the business identity of this
	 * qualifying party.
	 */
	private String BusinessIdentityEvidenceID;
	/**
	 * The number of people employed by this qualifying party.
	 */
	private BigDecimal EmployeeQuantity;
	/**
	 * The number of years that this qualifying party has been in operation.
	 */
	private BigDecimal OperatingYearsQuantity;
	/**
	 * The extent to which this party is expected to participate in the tendering
	 * process, expressed as a percentage.
	 */
	private BigDecimal ParticipationPercent;
	/**
	 * Text describing the personal situation of the qualifying party.
	 */
	private String PersonalSituation;
	/**
	 * A code stating the Tenderer Role.
	 */
	private String TendererRoleCode;
	private Capability Technical Capability;
	private Capability Financial Capability;
	private Classification Scheme Business Classification Scheme;
	private Completed Task m_Completed Task;
	private Declaration m_Declaration;
	private Economic Operator Role m_Economic Operator Role;
	private Party m_Party;

	public Qualifying Party(){

	}

	public void finalize() throws Throwable {

	}
	public Classification Scheme getBusiness Classification Scheme(){
		return Business Classification Scheme;
	}

	public String getBusinessClassificationEvidenceID(){
		return BusinessClassificationEvidenceID;
	}

	public String getBusinessIdentityEvidenceID(){
		return BusinessIdentityEvidenceID;
	}

	public Completed Task getCompleted Task(){
		return m_Completed Task;
	}

	public Declaration getDeclaration(){
		return m_Declaration;
	}

	public Economic Operator Role getEconomic Operator Role(){
		return m_Economic Operator Role;
	}

	public BigDecimal getEmployeeQuantity(){
		return EmployeeQuantity;
	}

	public Capability getFinancial Capability(){
		return Financial Capability;
	}

	public BigDecimal getOperatingYearsQuantity(){
		return OperatingYearsQuantity;
	}

	public BigDecimal getParticipationPercent(){
		return ParticipationPercent;
	}

	public Party getParty(){
		return m_Party;
	}

	public String getPersonalSituation(){
		return PersonalSituation;
	}

	public Capability getTechnical Capability(){
		return Technical Capability;
	}

	public String getTendererRoleCode(){
		return TendererRoleCode;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBusiness Classification Scheme(Classification Scheme newVal){
		Business Classification Scheme = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBusinessClassificationEvidenceID(String newVal){
		BusinessClassificationEvidenceID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBusinessIdentityEvidenceID(String newVal){
		BusinessIdentityEvidenceID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCompleted Task(Completed Task newVal){
		m_Completed Task = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDeclaration(Declaration newVal){
		m_Declaration = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setEconomic Operator Role(Economic Operator Role newVal){
		m_Economic Operator Role = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setEmployeeQuantity(BigDecimal newVal){
		EmployeeQuantity = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFinancial Capability(Capability newVal){
		Financial Capability = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOperatingYearsQuantity(BigDecimal newVal){
		OperatingYearsQuantity = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setParticipationPercent(BigDecimal newVal){
		ParticipationPercent = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setParty(Party newVal){
		m_Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPersonalSituation(String newVal){
		PersonalSituation = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTechnical Capability(Capability newVal){
		Technical Capability = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTendererRoleCode(String newVal){
		TendererRoleCode = newVal;
	}
}//end Qualifying Party