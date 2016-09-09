package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a tendered project or project lot.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:21 a. m.
 */
public class TenderedProjectRepresentation{

	/**
	 * The fee amount for tendered projects.
	 */
	private AmountType FeeAmount;
	/**
	 * Text describing the fee amount for tendered projects.
	 */
	private TextType FeeDescription;
	/**
	 * An identifier for the tender envelope this tendered project belongs to.
	 */
	private IdentifierType TenderEnvelopeID;
	/**
	 * A code signifying the type of tender envelope this tendered project belongs to.
	 */
	private CodeType TenderEnvelopeTypeCode;
	/**
	 * An identifier for this variant of a tendered project.
	 */
	private IdentifierType VariantID;
	private List<AwardingCriterionResponseRepresentation> AwardingCriterionResponses = new ArrayList<>();
	private DocumentReferenceRepresentation EvidenceDocumentReference;
	private MonetaryTotalRepresentation LegalMonetaryTotal;
	private List<ProcurementProjectLotRepresentation> ProcurementProjectLots = new ArrayList<>();
	private List<TaxTotalRepresentation> TaxTotals = new ArrayList<>();
	private List<TenderLineRepresentation> TenderLines = new ArrayList<>();

}