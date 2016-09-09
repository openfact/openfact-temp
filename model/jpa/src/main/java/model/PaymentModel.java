package model;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to describe a payment.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:16:33 a. m.
 */
public class PaymentModel{

	/**
	 * An identifier for this payment.
	 */
	private IdentifierType ID;
	/**
	 * An identifier for the payment instruction.
	 */
	private IdentifierType InstructionID;
	/**
	 * The amount of this payment.
	 */
	private AmountType PaidAmount;
	/**
	 * The date on which this payment was made.
	 */
	private DateType PaidDate;
	/**
	 * The time at which this payment was made.
	 */
	private TimeType PaidTime;
	/**
	 * The date on which this payment was received.
	 */
	private DateType ReceivedDate;

}
