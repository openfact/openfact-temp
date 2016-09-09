package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a shareholder party.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:42 a. m.
 */
public class ShareholderPartyModel{

	/**
	 * The shareholder participation, expressed as a percentage.
	 */
	private PercentType PartecipationPercent;
	private List<PartyModel> Parties = new ArrayList<>();

}
