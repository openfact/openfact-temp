package adapter;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to define a classification scheme, such as a taxonomy for classifying
 * goods or services.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:13:33 a. m.
 */
public class ClassificationSchemeAdapter{

	/**
	 * An identifier for the agency that maintains this classification scheme.
	 */
	private IdentifierType AgencyID;
	/**
	 * The name of the agency that maintains the classification scheme.
	 */
	private TextType AgencyName;
	/**
	 * Text describing this classification scheme.
	 */
	private TextType Description;
	/**
	 * An identifier for this classification scheme.
	 */
	private IdentifierType ID;
	/**
	 * An identifier for the language of this classification scheme.
	 */
	private IdentifierType LanguageID;
	/**
	 * The date on which this classification scheme was last revised.
	 */
	private DateType LastRevisionDate;
	/**
	 * The time at which this classification scheme was last revised.
	 */
	private TimeType LastRevisionTime;
	/**
	 * The name of this classification scheme.
	 */
	private NameType Name;
	/**
	 * Free-form text conveying information that is not contained explicitly in other
	 * structures.
	 */
	private TextType Note;
	/**
	 * The Uniform Resource Identifier (URI) of this classification scheme.
	 */
	private IdentifierType SchemeURIID;
	/**
	 * The Uniform Resource Identifier (URI) of the documentation for this
	 * classification scheme.
	 */
	private IdentifierType URIID;
	/**
	 * A universally unique identifier for this classification scheme.
	 */
	private IdentifierType UUID;
	/**
	 * An identifier for the version of this classification scheme.
	 */
	private IdentifierType VersionID;
	private List<ClassificationCategoryAdapter> ClassificationCategories = new ArrayList<>();

}