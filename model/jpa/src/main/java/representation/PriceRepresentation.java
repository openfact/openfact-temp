package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a price, expressed in a data structure containing multiple
 * properties (compare with UnstructuredPrice).
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:16:52 a. m.
 */
public class PriceRepresentation{

	/**
	 * The quantity at which this price applies.
	 */
	private QuantityType BaseQuantity;
	/**
	 * The factor by which the base price unit can be converted to the orderable unit.
	 */
	private RateType OrderableUnitFactorRate;
	/**
	 * The amount of the price.
	 */
	private AmountType PriceAmount;
	/**
	 * A reason for a price change.
	 */
	private TextType PriceChangeReason;
	/**
	 * The type of price, expressed as text.
	 */
	private TextType PriceType;
	/**
	 * The type of price, expressed as a code.
	 */
	private CodeType PriceTypeCode;
	private List<AllowanceChargeRepresentation> AllowanceCharges = new ArrayList<>();
	private ExchangeRateRepresentation PricingExchangeRate;
	private PeriodRepresentation ValidityPeriod;
	private List<PriceListRepresentation> PriceLists = new ArrayList<>();

}