package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a specific capability of an organization.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:13:15 a. m.
 */
public class CapabilityRepresentation{

	/**
	 * This class can be used as Financial or Technical capabilities. For instance,
	 * "Turnover" or "Qualified Engineers" are two possible codes.
	 */
	private CodeType CapabilityTypeCode;
	/**
	 * Text describing this capability.
	 */
	private TextType Description;
	/**
	 * A monetary amount as a measure of this capability.
	 */
	private AmountType ValueAmount;
	/**
	 * A quantity as a measure of this capability.
	 */
	private QuantityType ValueQuantity;
	private List<EvidenceSuppliedRepresentation> EvidenceSupplieds = new ArrayList<>();
	private PeriodRepresentation ValidityPeriod;

}