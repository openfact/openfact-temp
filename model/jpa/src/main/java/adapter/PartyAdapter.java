package adapter;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe an organization, sub-organization, or individual fulfilling
 * a role in a business process.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:16:25 a. m.
 */
public class PartyAdapter{

	/**
	 * An identifier for the end point of the routing service (e.g., EAN Location
	 * Number, GLN).
	 */
	private IdentifierType EndpointID;
	/**
	 * This party's Industry Classification Code.
	 */
	private CodeType IndustryClassificationCode;
	/**
	 * An identifier for this party's logo.
	 */
	private IdentifierType LogoReferenceID;
	/**
	 * An indicator that this party is "for the attention of" (FAO) (true) or not
	 * (false).
	 */
	private IndicatorType MarkAttentionIndicator;
	/**
	 * An indicator that this party is "care of" (c/o) (true) or not (false).
	 */
	private IndicatorType MarkCareIndicator;
	/**
	 * The Uniform Resource Identifier (URI) that identifies this party's web site; i.
	 * e., the web site's Uniform Resource Locator (URL).
	 */
	private IdentifierType WebsiteURIID;
	private AddressAdapter PostalAddress;
	private List<ContactAdapter> Contacts = new ArrayList<>();
	private List<FinancialAccountAdapter> FinancialAccounts = new ArrayList<>();
	private List<LanguageAdapter> Languages = new ArrayList<>();
	private LocationAdapter PhysicalLocation;
	private List<PartyAdapter> AgentParty = new ArrayList<>();
	private List<PartyIdentificationAdapter> PartyIdentifications = new ArrayList<>();
	private List<PartyLegalEntityAdapter> PartyLegalEntities = new ArrayList<>();
	private List<PartyNameAdapter> PartyNames = new ArrayList<>();
	private List<PartyAdapter> TaxSchemePartyTaxSchemes = new ArrayList<>();
	private List<PersonAdapter> Persons = new ArrayList<>();
	private List<PowerOfAttorneyAdapter> PowerOfAttorneys = new ArrayList<>();
	private List<ServiceProviderPartyAdapter> ServiceProviderParties = new ArrayList<>();

}