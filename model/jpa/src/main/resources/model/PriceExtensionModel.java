package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a price extension, calculated by multiplying the price per
 * unit by the quantity of items.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:16:54 a. m.
 */
public class PriceExtensionModel{

	/**
	 * The amount of this price extension.
	 */
	private AmountType amount; 
	private List<TaxTotalModel> taxTotals = new ArrayList<>(); 

}