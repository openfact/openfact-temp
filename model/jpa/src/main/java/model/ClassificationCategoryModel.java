package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to define a category within a classification scheme.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:13:31 a. m.
 */
public class ClassificationCategoryModel{

	/**
	 * The value of a code used to identify this category within the classification
	 * scheme.
	 */
	private TextType CodeValue;
	/**
	 * Text describing this category.
	 */
	private TextType Description;
	/**
	 * The name of this category within the classification scheme.
	 */
	private NameType Name;
	private ClassificationCategoryModel CategorizesClassificationCategory;

}
