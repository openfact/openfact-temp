

/**
 * A class to describe a promotional event as a set of item locations that share a
 * set of promotional tactics.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:11 a. m.
 */
public class Promotional Specification {

	/**
	 * An identifier for this promotional specification.
	 */
	private Identifier. Type SpecificationID;
	private Event Tactic m_Event Tactic;
	private Promotional Event Line Item m_Promotional Event Line Item;

	public Promotional Specification(){

	}

	public void finalize() throws Throwable {

	}
	public Event Tactic getEvent Tactic(){
		return m_Event Tactic;
	}

	public Promotional Event Line Item getPromotional Event Line Item(){
		return m_Promotional Event Line Item;
	}

	public Identifier. Type getSpecificationID(){
		return SpecificationID;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setEvent Tactic(Event Tactic newVal){
		m_Event Tactic = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPromotional Event Line Item(Promotional Event Line Item newVal){
		m_Promotional Event Line Item = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSpecificationID(Identifier. Type newVal){
		SpecificationID = newVal;
	}
}//end Promotional Specification