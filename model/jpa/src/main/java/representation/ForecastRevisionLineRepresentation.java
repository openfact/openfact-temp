package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to define a line in a ForecastRevisionRepresentation describing a revision to a line
 * in a Forecast.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:15:21 a. m.
 */
public class ForecastRevisionLineRepresentation{

	/**
	 * A code signifying the reason for the adjustment specified in this forecast
	 * revision line.
	 */
	private CodeType AdjustmentReasonCode;
	/**
	 * Text describing the revision to this line.
	 */
	private TextType Description;
	/**
	 * An identifier for this forecast revision line.
	 */
	private IdentifierType ID;
	/**
	 * Free-form text conveying information that is not contained explicitly in other
	 * structures.
	 */
	private TextType Note;
	/**
	 * An identifier for the revised forecast line.
	 */
	private IdentifierType RevisedForecastLineID;
	/**
	 * The date on which the forecast modified by this revision was generated or
	 * created.
	 */
	private DateType SourceForecastIssueDate;
	/**
	 * The time at which the forecast modified by this revision was generated or
	 * created.
	 */
	private TimeType SourceForecastIssueTime;
	private PeriodRepresentation ForecastPeriod;
	private List<SalesItemRepresentation> SalesItems = new ArrayList<>();

}