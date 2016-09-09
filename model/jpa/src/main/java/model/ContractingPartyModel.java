package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe an individual, a group, or a body having a procurement role
 * in a tendering process.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:14:06 a. m.
 */
public class ContractingPartyModel{

	/**
	 * The buyer profile is typically located on a web site where the contracting
	 * party publishes its procurement opportunities
	 */
	private IdentifierType BuyerProfileURIID;
	private List<ContractingActivityModel> ContractingActivities = new ArrayList<>();
	private List<ContractingPartyModel> TypeContractingPartyTypes = new ArrayList<>();
	private List<PartyModel> Parties = new ArrayList<>();

}