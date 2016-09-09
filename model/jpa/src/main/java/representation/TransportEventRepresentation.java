package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a significant occurrence or happening related to the
 * transportation of goods.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:18:42 a. m.
 */
public class TransportEventRepresentation{

	/**
	 * An indicator that this transport event has been completed (true) or not (false).
	 */
	private IndicatorType CompletionIndicator;
	/**
	 * Text describing this transport event.
	 */
	private TextType Description;
	/**
	 * An identifier for this transport event within an agreed event identification
	 * scheme.
	 */
	private IdentifierType IdentificationID;
	/**
	 * The date of this transport event.
	 */
	private DateType OccurrenceDate;
	/**
	 * The time of this transport event.
	 */
	private TimeType OccurrenceTime;
	/**
	 * A code signifying the type of this transport event.
	 */
	private CodeType TransportEventTypeCode;
	private List<ContactRepresentation> Contacts = new ArrayList<>();
	private List<LocationRepresentation> Locations = new ArrayList<>();
	private List<PeriodRepresentation> Periods = new ArrayList<>();
	private ShipmentRepresentation ReportedShipment;
	private StatusRepresentation CurrentStatus;
	private List<SignatureRepresentation> Signatures = new ArrayList<>();

}
