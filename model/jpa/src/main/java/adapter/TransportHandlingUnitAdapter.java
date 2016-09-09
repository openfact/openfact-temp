package adapter;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a uniquely identifiable unit consisting of one or more
 * packages, goods items, or pieces of transport equipment.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:18:46 a. m.
 */
public class TransportHandlingUnitAdapter{

	/**
	 * Text describing damage associated with this transport handling unit.
	 */
	private TextType DamageRemarks;
	/**
	 * The handling required for this transport handling unit, expressed as a code.
	 */
	private CodeType HandlingCode;
	/**
	 * The handling required for this transport handling unit, expressed as text.
	 */
	private TextType HandlingInstructions;
	/**
	 * An indicator that the materials contained in this transport handling unit are
	 * subject to an international regulation concerning the carriage of dangerous
	 * goods (true) or not (false).
	 */
	private IndicatorType HazardousRiskIndicator;
	/**
	 * An identifier for this transport handling unit.
	 */
	private IdentifierType ID;
	/**
	 * Text describing the marks and numbers on this transport handling unit.
	 */
	private TextType ShippingMarks;
	/**
	 * The total number of goods items in this transport handling unit.
	 */
	private QuantityType TotalGoodsItemQuantity;
	/**
	 * The total number of packages in this transport handling unit.
	 */
	private QuantityType TotalPackageQuantity;
	/**
	 * An identifier for use in tracing this transport handling unit, such as the EPC
	 * number used in RFID.
	 */
	private IdentifierType TraceID;
	/**
	 * A code signifying the type of this transport handling unit.
	 */
	private CodeType TransportHandlingUnitTypeCode;
	private List<CustomsDeclarationAdapter> CustomsDeclarations = new ArrayList<>();
	private DespatchLineAdapter HandlingUnitDespatchLine;
	private DimensionAdapter FloorSpaceMeasurementDimension;
	private DimensionAdapter PalletSpaceMeasurementDimension;
	private DimensionAdapter MeasurementDimension;
	private DocumentReferenceAdapter ShipmentDocumentReference;
	private List<GoodsItemAdapter> GoodsItems = new ArrayList<>();
	private List<HazardousGoodsTransitAdapter> HazardousGoodsTransits = new ArrayList<>();
	private List<PackageAdapter> Packages = new ArrayList<>();
	private List<PackageAdapter> ActualPackage = new ArrayList<>();
	private ReceiptLineAdapter ReceivedHandlingUnitReceiptLine;
	private ShipmentAdapter ReferencedShipment;
	private List<StatusAdapter> Statuses = new ArrayList<>();
	private TemperatureAdapter MinimumTemperature;
	private TemperatureAdapter MaximumTemperature;
	private List<TransportEquipmentAdapter> TransportEquipments = new ArrayList<>();
	private List<TransportMeansAdapter> TransportMeanses = new ArrayList<>();

}
