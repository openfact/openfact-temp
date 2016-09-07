package org.openfact.models.jpa.entities.ubl;


/**
 * A class to describe a customer party.
 * @author Erik
 * @version 1.0
 * @created 07-Set.-2016 9:14:16 a. m.
 */
public class CustomerParty {

	/**
	 * An identifier for the customer's account, assigned by a third party.
	 */
	private String AdditionalAccountID;
	/**
	 * An identifier for the customer's account, assigned by the customer itself.
	 */
	private String CustomerAssignedAccountID;
	/**
	 * An identifier for the customer's account, assigned by the supplier.
	 */
	private String SupplierAssignedAccountID;
	private Contact Delivery Contact;
	private Contact Accounting Contact;
	private Contact Buyer Contact;
	private Party m_Party;

	public CustomerParty(){

	}

	public void finalize() throws Throwable {

	}
	public Contact getAccounting Contact(){
		return Accounting Contact;
	}

	public String getAdditionalAccountID(){
		return AdditionalAccountID;
	}

	public Contact getBuyer Contact(){
		return Buyer Contact;
	}

	public String getCustomerAssignedAccountID(){
		return CustomerAssignedAccountID;
	}

	public Contact getDelivery Contact(){
		return Delivery Contact;
	}

	public Party getParty(){
		return m_Party;
	}

	public String getSupplierAssignedAccountID(){
		return SupplierAssignedAccountID;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAccounting Contact(Contact newVal){
		Accounting Contact = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAdditionalAccountID(String newVal){
		AdditionalAccountID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBuyer Contact(Contact newVal){
		Buyer Contact = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCustomerAssignedAccountID(String newVal){
		CustomerAssignedAccountID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDelivery Contact(Contact newVal){
		Delivery Contact = newVal;
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
	public void setSupplierAssignedAccountID(String newVal){
		SupplierAssignedAccountID = newVal;
	}
}//end CustomerParty