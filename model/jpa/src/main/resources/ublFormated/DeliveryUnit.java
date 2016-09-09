package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a delivery unit.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:14:25 a. m.
 */
public class DeliveryUnit{

	/**
	 * The quantity of ordered Items that constitutes a batch for delivery purposes.
	 */
	private QuantityType BatchQuantity;
	/**
	 * The quantity of units in the DeliveryUnit expressed in the units used by the
	 * consumer.
	 */
	private QuantityType ConsumerUnitQuantity;
	/**
	 * An indication that the transported goods are subject to an international
	 * regulation concerning the carriage of dangerous goods (true) or not (false).
	 */
	private IndicatorType HazardousRiskIndicator;

}
