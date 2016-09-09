package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe terms applying to a transport execution plan.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:44 a. m.
 */
public class TransportExecutionTermsModel{

	/**
	 * Text describing conditions applying to a change of these transport execution
	 * terms.
	 */
	private TextType ChangeConditions;
	/**
	 * Text describing special terms specified by the transport service provider.
	 */
	private TextType TransportServiceProviderSpecialTerms;
	/**
	 * Text describing special terms specified by the transport user.
	 */
	private TextType TransportUserSpecialTerms;
	private List<DeliveryTermsModel> DeliveryTermses = new ArrayList<>();
	private List<EnvironmentalEmissionModel> EnvironmentalEmissions = new ArrayList<>();
	private List<NotificationRequirementModel> NotificationRequirements = new ArrayList<>();
	private List<PaymentTermsModel> BonusPaymentTerms = new ArrayList<>();
	private List<PaymentTermsModel> CommissionPaymentTerms = new ArrayList<>();
	private List<PaymentTermsModel> PenaltyPaymentTerms = new ArrayList<>();
	private List<PaymentTermsModel> ServiceChargePaymentTerms = new ArrayList<>();
	private List<PaymentTermsModel> PaymentTermses = new ArrayList<>();

}
