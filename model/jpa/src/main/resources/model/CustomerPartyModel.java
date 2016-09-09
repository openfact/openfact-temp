package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a customer party.
 * @author Erik
 * @version 1.0
 * @created 07-Set.-2016 9:14:16 a. m.
 */
public class CustomerPartyModel{

	/**
	 * An identifier for the customer's account, assigned by a third party.
	 */
	private IdentifierType additionalAccountID; 
	/**
	 * An identifier for the customer's account, assigned by the customer itself.
	 */
	private IdentifierType customerAssignedAccountID; 
	/**
	 * An identifier for the customer's account, assigned by the supplier.
	 */
	private IdentifierType supplierAssignedAccountID; 
	private ContactModel deliveryContact; 
	private ContactModel accountingContact; 
	private ContactModel buyerContact; 
	private List<PartyModel> parties = new ArrayList<>(); 

}