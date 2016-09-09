package adapter;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a promotional event as a set of item locations that share a
 * set of promotional tactics.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:11 a. m.
 */
public class PromotionalSpecificationAdapter{

	/**
	 * An identifier for this promotional specification.
	 */
	private IdentifierType SpecificationID;
	private List<EventTacticAdapter> EventTactics = new ArrayList<>();
	private List<PromotionalEventAdapter> LineItemPromotionalEventLineItems = new ArrayList<>();

}