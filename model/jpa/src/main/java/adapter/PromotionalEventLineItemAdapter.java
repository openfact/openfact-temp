package adapter;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a line item associated with a promotional event.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:10 a. m.
 */
public class PromotionalEventLineItemAdapter{

	/**
	 * The amount associated with this promotional event line item.
	 */
	private AmountType Amount;
	private List<EventAdapter> LineItemEventLineItems = new ArrayList<>();

}