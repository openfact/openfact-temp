package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A template for a required document in a tendering process.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:17 a. m.
 */
public class TenderRequirementRepresentation{

	/**
	 * Text describing this tender requirement.
	 */
	private TextType Description;
	/**
	 * A name of this tender requirement.
	 */
	private NameType Name;
	private DocumentReferenceRepresentation TemplateDocumentReference;

}