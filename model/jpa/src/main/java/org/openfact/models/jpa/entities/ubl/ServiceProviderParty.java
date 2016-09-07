package org.openfact.models.jpa.entities.ubl;


/**
 * A class to describe a party contracting to provide services, such as
 * transportation, finance, etc.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:41 a. m.
 */
public class ServiceProviderParty {

	/**
	 * An identifier for this service provider.
	 */
	private String ID;
	/**
	 * The type of service provided, expressed as text.
	 */
	private String ServiceType;
	/**
	 * The type of service provided, expressed as a code.
	 */
	private String ServiceTypeCode;
	private Contact Seller Contact;
	private Party m_Party;

	public Service Provider Party(){

	}

	public void finalize() throws Throwable {

	}
	public String getID(){
		return ID;
	}

	public Party getParty(){
		return m_Party;
	}

	public Contact getSeller Contact(){
		return Seller Contact;
	}

	public String getServiceType(){
		return ServiceType;
	}

	public String getServiceTypeCode(){
		return ServiceTypeCode;
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
	public void setParty(Party newVal){
		m_Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSeller Contact(Contact newVal){
		Seller Contact = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setServiceType(String newVal){
		ServiceType = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setServiceTypeCode(String newVal){
		ServiceTypeCode = newVal;
	}
}//end Service Provider Party