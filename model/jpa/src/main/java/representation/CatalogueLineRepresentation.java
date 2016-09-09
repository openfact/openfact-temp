package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to define a line in a CatalogueRepresentation describing a purchasable item.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:13:19 a. m.
 */
public class CatalogueLineRepresentation{

	/**
	 * A code signifying the action required to synchronize this catalogue line.
	 * Recommend codes (delete, update, add)
	 */
	private CodeType ActionCode;
	/**
	 * The numeric quantity of the ordering unit (and units of measure) of the
	 * catalogue line.
	 */
	private QuantityType ContentUnitQuantity;
	/**
	 * A subdivision of a contract or tender covering this catalogue line.
	 */
	private TextType ContractSubdivision;
	/**
	 * An identifier for the line in the catalogue.
	 */
	private IdentifierType ID;
	/**
	 * A code signifying the life cycle status of this catalogue line. Examples are
	 * pre-order, end of production
	 */
	private CodeType LifeCycleStatusCode;
	/**
	 * The maximum amount of the item described in this catalogue line that can be
	 * ordered.
	 */
	private QuantityType MaximumOrderQuantity;
	/**
	 * The minimum amount of the item described in this catalogue line that can be
	 * ordered.
	 */
	private QuantityType MinimumOrderQuantity;
	/**
	 * Free-form text conveying information that is not contained explicitly in other
	 * structures.
	 */
	private TextType Note;
	/**
	 * An indicator that this catalogue line describes an orderable item (true) or is
	 * included for reference purposes only (false).
	 */
	private IndicatorType OrderableIndicator;
	/**
	 * A textual description of the units in which the item described in this
	 * catalogue line can be ordered.
	 */
	private TextType OrderableUnit;
	/**
	 * The number of items that can set the order quantity increments.
	 */
	private NumericType OrderQuantityIncrementNumeric;
	/**
	 * A mutually agreed code signifying the level of packaging associated with the
	 * item described in this catalogue line.
	 */
	private CodeType PackLevelCode;
	/**
	 * Text about a warranty (provided by WarrantyParty) for the good or service
	 * described in this catalogue line.
	 */
	private TextType WarrantyInformation;
	private CustomerPartyRepresentation ContractorCustomerParty;
	private List<DocumentReferenceRepresentation> CallForTendersDocumentReference = new ArrayList<>();
	private List<DocumentReferenceRepresentation> DocumentReferences = new ArrayList<>();
	private List<ItemRepresentation> Items = new ArrayList<>();
	private List<ItemComparisonRepresentation> ItemsComparison = new ArrayList<>();
	private ItemLocationQuantityRepresentation RequiredItemLocationQuantity;
	private ItemPropertyRepresentation KeywordItemProperty;
	private LineReferenceRepresentation CallForTendersLineReference;
	private PartyRepresentation WarrantyParty;
	private PeriodRepresentation WarrantyValidityPeriod;
	private PeriodRepresentation LineValidityPeriod;
	private RelatedItemRepresentation ComponentRelatedItem;
	private RelatedItemRepresentation ReplacedRelatedItem;
	private RelatedItemRepresentation ComplementaryRelatedItem;
	private RelatedItemRepresentation ReplacementRelatedItem;
	private RelatedItemRepresentation AccessoryRelatedItem;
	private RelatedItemRepresentation RequiredRelatedItem;
	private SupplierPartyRepresentation SellerSupplierParty;

}