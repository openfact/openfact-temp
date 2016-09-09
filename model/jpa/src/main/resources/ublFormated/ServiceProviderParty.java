package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a party contracting to provide services, such as
 * transportation, finance, etc.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:41 a. m.
 */
public class ServiceProviderParty{

	/**
	 * An identifier for this service provider.
	 */
	private IdentifierType ID;
	/**
	 * The type of service provided, expressed as text.
	 */
	private TextType ServiceType;
	/**
	 * The type of service provided, expressed as a code.
	 */
	private CodeType ServiceTypeCode;
	private Contact SellerContact;
	private List<Party> Parties = new ArrayList<>();

}
