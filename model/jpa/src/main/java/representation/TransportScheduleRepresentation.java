package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * Describes the location and schedule relating to a transport means.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:49 a. m.
 */
public class TransportScheduleRepresentation{

	/**
	 * The reference date for the transport schedule status.
	 */
	private DateType ReferenceDate;
	/**
	 * The reference time for the transport schedule status.
	 */
	private TimeType ReferenceTime;
	/**
	 * The reliability of the transport schedule status, expressed as a percentage.
	 */
	private PercentType ReliabilityPercent;
	/**
	 * Remarks related to the transport schedule status.
	 */
	private TextType Remarks;
	/**
	 * A number indicating the order of this status in the sequence in which statuses
	 * are to be presented.
	 */
	private NumericType SequenceNumeric;
	private LocationRepresentation StatusLocation;
	private TransportEventRepresentation ActualDepartureTransportEvent;
	private TransportEventRepresentation EstimatedDepartureTransportEvent;
	private TransportEventRepresentation EstimatedArrivalTransportEvent;
	private TransportEventRepresentation PlannedDepartureTransportEvent;
	private TransportEventRepresentation ActualArrivalTransportEvent;
	private TransportEventRepresentation PlannedArrivalTransportEvent;

}