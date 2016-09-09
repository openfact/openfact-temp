package adapter;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to define a line describing the transaction that updates the
 * specification of an item in a catalogue.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:13:18 a. m.
 */
public class CatalogueItemSpecificationUpdateLineAdapter{

	/**
	 * An identifier for the line to be updated in a catalogue.
	 */
	private IdentifierType ID;
	private CustomerPartyAdapter ContractorCustomerParty;
	private List<ItemAdapter> Items = new ArrayList<>();
	private SupplierPartyAdapter SellerSupplierParty;

}
