package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe the qualifications of a tenderer party.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:22 a. m.
 */
public class TendererPartyQualificationRepresentation{

	private ProcurementProjectLotRepresentation InterestedProcurementProjectLot;
	private QualifyingPartyRepresentation MainQualifyingParty;
	private QualifyingPartyRepresentation AdditionalQualifyingParty;

}
