package adapter;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe the awarding of a tender in a tendering process.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:19 a. m.
 */
public class TenderResultAdapter{

	/**
	 * The monetary value of the advertisement for this tendering process. 
	 */
	private AmountType AdvertisementAmount;
	/**
	 * The date on which this result was formalized.
	 */
	private DateType AwardDate;
	/**
	 * The time at which this result was formalized.
	 */
	private TimeType AwardTime;
	/**
	 * Text describing the result of the tendering process.
	 */
	private TextType Description;
	/**
	 * The most expensive tender received in this tendering process.
	 */
	private AmountType HigherTenderAmount;
	/**
	 * The least expensive tender received in the tendering process.
	 */
	private AmountType LowerTenderAmount;
	/**
	 * The number of electronic tenders received.
	 */
	private QuantityType ReceivedElectronicTenderQuantity;
	/**
	 * The number of foreing tenders received.
	 */
	private QuantityType ReceivedForeignTenderQuantity;
	/**
	 * The total number of tenders received in this tendering process.
	 */
	private QuantityType ReceivedTenderQuantity;
	/**
	 * The date on which the awarded contract begins.
	 */
	private DateType StartDate;
	/**
	 * A code signifying the result of the tendering process.
	 */
	private CodeType TenderResultCode;
	private List<ContractAdapter> Contracts = new ArrayList<>();
	private PeriodAdapter ContractFormalizationPeriod;
	private List<SubcontractTermsAdapter> SubcontractTermses = new ArrayList<>();
	private TenderedProjectAdapter AwardedTenderedProject;
	private List<WinningPartyAdapter> WinningParties = new ArrayList<>();

}
