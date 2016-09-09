package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a delivery.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:14:22 a. m.
 */
public class DeliveryRepresentation{

	/**
	 * The actual date of delivery.
	 */
	private DateType actualDeliveryDate; 
	/**
	 * The actual time of delivery.
	 */
	private TimeType actualDeliveryTime; 
	/**
	 * An identifier for this delivery.
	 */
	private IdentifierType ID; 
	/**
	 * The latest date of delivery allowed by the buyer.
	 */
	private DateType latestDeliveryDate; 
	/**
	 * The latest time of delivery allowed by the buyer.
	 */
	private TimeType latestDeliveryTime; 
	/**
	 * The maximum quantity of items, child consignments, shipments in this delivery.
	 */
	private QuantityType maximumQuantity; 
	/**
	 * The minimum quantity of items, child consignments, shipments in this delivery.
	 */
	private QuantityType minimumQuantity; 
	/**
	 * The quantity of items, child consignments, shipments in this delivery.
	 */
	private QuantityType quantity; 
	/**
	 * An identifier used for approval of access to delivery locations (e.g., port
	 * terminals).
	 */
	private IdentifierType releaseID; 
	/**
	 * The delivery Tracking ID (for transport tracking).
	 */
	private IdentifierType trackingID; 
	private AddressRepresentation deliveryAddress; 
	private DeliveryUnitRepresentation maximumDeliveryUnit; 
	private DeliveryUnitRepresentation minimumDeliveryUnit; 
	private List<DespatchRepresentation> despatches = new ArrayList<>(); 
	private PeriodRepresentation estimatedDeliveryPeriod; 
	private PeriodRepresentation promisedDeliveryPeriod; 
	private PeriodRepresentation requestedDeliveryPeriod; 
	private LocationRepresentation deliveryLocation; 
	private LocationRepresentation alternativeDeliveryLocation; 
	private PartyRepresentation notifyParty; 
	private PartyRepresentation carrierParty; 
	private PartyRepresentation deliveryParty; 
	private List<ShipmentRepresentation> shipments = new ArrayList<>(); 
	private List<DeliveryTermsRepresentation> deliveryTermses = new ArrayList<>(); 

}