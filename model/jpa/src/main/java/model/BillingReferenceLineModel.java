package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to define a reference to a transaction line in a billing document.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:13:09 a. m.
 */
public class BillingReferenceLineModel{

	/**
	 * The monetary amount of the transaction line, including any allowances and
	 * charges but excluding taxes.
	 */
	private AmountType Amount;
	/**
	 * An identifier for this transaction line in a billing document.
	 */
	private IdentifierType ID;
	private List<AllowanceChargeModel> AllowanceCharges = new ArrayList<>();

}
