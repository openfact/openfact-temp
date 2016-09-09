package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe information related to an item in a sales context
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:37 a. m.
 */
public class SalesItem{

	/**
	 * The quantity the given information are related to
	 */
	private QuantityType Quantity;
	private List<ActivityProperty> ActivityProperties = new ArrayList<>();
	private List<Item> Items = new ArrayList<>();
	private Price TaxExclusivePrice;
	private Price TaxInclusivePrice;

}
