package org.openfact.models.jpa.entities.ubl;


/**
 * Defines the response for an awarding criterion from the tendering party.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:12:53 a. m.
 */
public class AwardingCriterionResponse {

	/**
	 * Specifies the monetary amount tendered for this awarding criterion.
	 */
	private BigDecimal Amount;
	/**
	 * Describes the awarding criterion.
	 */
	private String AwardingCriterionDescription;
	/**
	 * An identifer of the awarding criterion being referred to.
	 */
	private String AwardingCriterionID;
	/**
	 * Describes the awarding criterion response.
	 */
	private String Description;
	/**
	 * An identification of this awarding criterion response.
	 */
	private String ID;
	/**
	 * Specifies the quantity tendered for this awarding criterion.
	 */
	private BigDecimal Quantity;
	private Awarding Criterion Response Subordinate Awarding Criterion Response;

	public Awarding Criterion Response(){

	}

	public void finalize() throws Throwable {

	}
	public BigDecimal getAmount(){
		return Amount;
	}

	public String getAwardingCriterionDescription(){
		return AwardingCriterionDescription;
	}

	public String getAwardingCriterionID(){
		return AwardingCriterionID;
	}

	public String getDescription(){
		return Description;
	}

	public String getID(){
		return ID;
	}

	public BigDecimal getQuantity(){
		return Quantity;
	}

	public Awarding Criterion Response getSubordinate Awarding Criterion Response(){
		return Subordinate Awarding Criterion Response;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAmount(BigDecimal newVal){
		Amount = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAwardingCriterionDescription(String newVal){
		AwardingCriterionDescription = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAwardingCriterionID(String newVal){
		AwardingCriterionID = newVal;
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
	public void setQuantity(BigDecimal newVal){
		Quantity = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSubordinate Awarding Criterion Response(Awarding Criterion Response newVal){
		Subordinate Awarding Criterion Response = newVal;
	}
}//end Awarding Criterion Response