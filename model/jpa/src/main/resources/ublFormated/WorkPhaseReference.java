package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class that refers to a phase of work. Used for instance to specify what part
 * of the contract the billing is referring to.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:19:01 a. m.
 */
public class WorkPhaseReference{

	/**
	 * The date on which this phase of work ends.
	 */
	private DateType EndDate;
	/**
	 * An identifier for this phase of work.
	 */
	private IdentifierType ID;
	/**
	 * The progress percentage of the work phase.
	 */
	private PercentType ProgressPercent;
	/**
	 * The date on which this phase of work begins.
	 */
	private DateType StartDate;
	/**
	 * Text describing this phase of work.
	 */
	private TextType WorkPhase;
	/**
	 * A code signifying this phase of work.
	 */
	private CodeType WorkPhaseCode;
	private DocumentReference WorkOrderDocumentReference;

}
