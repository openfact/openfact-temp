package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to define a budget account line.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:13:13 a. m.
 */
public class BudgetAccountLineModel{

	/**
	 * An identifier for this budget account line.
	 */
	private IdentifierType ID;
	/**
	 * The total monetary amount for this budget account line.
	 */
	private AmountType TotalAmount;
	private List<BudgetAccountModel> BudgetAccounts = new ArrayList<>();

}