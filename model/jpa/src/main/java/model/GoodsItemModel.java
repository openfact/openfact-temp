package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a separately identifiable quantity of goods of a single
 * product type.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:15:24 a. m.
 */
public class GoodsItemModel{

	/**
	 * The number of units in the goods item to which charges apply.
	 */
	private QuantityType ChargeableQuantity;
	/**
	 * The weight on which a charge is to be based.
	 */
	private MeasureType ChargeableWeightMeasure;
	/**
	 * An indicator that this goods item has been classified for import by customs
	 * (true) or not (false).
	 */
	private IndicatorType CustomsImportClassifiedIndicator;
	/**
	 * A code assigned by customs to signify the status of this goods item.
	 */
	private CodeType CustomsStatusCode;
	/**
	 * Quantity of the units in this goods item as required by customs for tariff,
	 * statistical, or fiscal purposes.
	 */
	private QuantityType CustomsTariffQuantity;
	/**
	 * The total declared value for customs purposes of the goods item.
	 */
	private AmountType DeclaredCustomsValueAmount;
	/**
	 * The value of this goods item, declared by the shipper or his agent solely for
	 * the purpose of varying the carrier's level of liability from that provided in
	 * the contract of carriage, in case of loss or damage to goods or delayed
	 * delivery.
	 */
	private AmountType DeclaredForCarriageValueAmount;
	/**
	 * The total declared value of all the goods items in the same consignment with
	 * this goods item that have the same statistical heading.
	 */
	private AmountType DeclaredStatisticsValueAmount;
	/**
	 * Text describing this goods item to identify it for customs, statistical, or
	 * transport purposes.
	 */
	private TextType Description;
	/**
	 * The monetary amount that has to be or has been paid as calculated under the
	 * applicable trade delivery.
	 */
	private AmountType FreeOnBoardValueAmount;
	/**
	 * The volume of this goods item, normally calculated by multiplying its maximum
	 * length, width, and height.
	 */
	private MeasureType GrossVolumeMeasure;
	/**
	 * The weight of this goods item, including packing and packaging but excluding
	 * the carrier's equipment.
	 */
	private MeasureType GrossWeightMeasure;
	/**
	 * An indication that the transported goods item is subject to an international
	 * regulation concerning the carriage of dangerous goods (true) or not (false).
	 */
	private IndicatorType HazardousRiskIndicator;
	/**
	 * An identifier for this goods item.
	 */
	private IdentifierType ID;
	/**
	 * The amount covered by insurance for this goods item.
	 */
	private AmountType InsuranceValueAmount;
	/**
	 * The total weight of this goods item, excluding all packing and packaging.
	 */
	private MeasureType NetNetWeightMeasure;
	/**
	 * The volume contained by a goods item, excluding the volume of any packaging
	 * material.
	 */
	private MeasureType NetVolumeMeasure;
	/**
	 * The weight of this goods item, excluding packing but including packaging that
	 * normally accompanies the goods.
	 */
	private MeasureType NetWeightMeasure;
	/**
	 * A code signifying the treatment preference for this goods item according to
	 * international trading agreements.
	 */
	private CodeType PreferenceCriterionCode;
	/**
	 * The number of units making up this goods item.
	 */
	private QuantityType Quantity;
	/**
	 * An identifier for a set of tariff codes required to specify a type of goods for
	 * customs, transport, statistical, or other regulatory purposes.
	 */
	private IdentifierType RequiredCustomsID;
	/**
	 * The number of units in the goods item that may be returned.
	 */
	private QuantityType ReturnableQuantity;
	/**
	 * A sequence number differentiating a specific goods item within a consignment.
	 */
	private IdentifierType SequenceNumberID;
	/**
	 * An identifier for use in tracing this goods item, such as the EPC number used
	 * in RFID.
	 */
	private IdentifierType TraceID;
	/**
	 * The amount on which a duty, tax, or fee will be assessed.
	 */
	private AmountType ValueAmount;
	private AddressModel OriginAddress;
	private AllowanceChargeModel FreightAllowanceCharge;
	private List<DeliveryModel> Deliveries = new ArrayList<>();
	private List<DespatchModel> Despatches = new ArrayList<>();
	private DimensionModel MeasurementDimension;
	private DocumentReferenceModel ShipmentDocumentReference;
	private List<InvoiceLineModel> InvoiceLines = new ArrayList<>();
	private GoodsItemModel ContainedGoodsItem;
	private List<GoodsItemContainerModel> GoodsItemContainers = new ArrayList<>();
	private List<ItemModel> Items = new ArrayList<>();
	private PackageModel ContainingPackage;
	private List<PickupModel> Pickups = new ArrayList<>();
	private List<TemperatureModel> Temperatures = new ArrayList<>();
	private List<TemperatureModel> MaximumTemperature = new ArrayList<>();
	private List<TemperatureModel> MinimumTemperature = new ArrayList<>();

}
