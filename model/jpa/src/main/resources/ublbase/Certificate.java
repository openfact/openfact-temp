

/**
 * A class to define a certificate applied to the item. Certificated can be a
 * requirement to sell goods or services in a jurisdiction.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:13:28 a. m.
 */
public class Certificate {

	/**
	 * The type of this certificate, expressed as a code. The type specifies what
	 * array it belongs to, e.g.. Environmental, security, health improvement etc.
	 */
	private Text. Type CertificateType;
	/**
	 * The type of this certificate, expressed as a code. The type specifies what
	 * array it belongs to, e.g.. Environmental, security, health improvement etc.
	 */
	private Code. Type CertificateTypeCode;
	/**
	 * An identifier for this certificate.
	 */
	private Identifier. Type ID;
	/**
	 * Remarks by the applicant for this certificate.
	 */
	private Text. Type Remarks;
	private Document Reference m_Document Reference;
	private Party Issuer Party;
	private Signature m_Signature;

	public Certificate(){

	}

	public void finalize() throws Throwable {

	}
	public Text. Type getCertificateType(){
		return CertificateType;
	}

	public Code. Type getCertificateTypeCode(){
		return CertificateTypeCode;
	}

	public Document Reference getDocument Reference(){
		return m_Document Reference;
	}

	public Identifier. Type getID(){
		return ID;
	}

	public Party getIssuer Party(){
		return Issuer Party;
	}

	public Text. Type getRemarks(){
		return Remarks;
	}

	public Signature getSignature(){
		return m_Signature;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCertificateType(Text. Type newVal){
		CertificateType = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCertificateTypeCode(Code. Type newVal){
		CertificateTypeCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDocument Reference(Document Reference newVal){
		m_Document Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setID(Identifier. Type newVal){
		ID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIssuer Party(Party newVal){
		Issuer Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setRemarks(Text. Type newVal){
		Remarks = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSignature(Signature newVal){
		m_Signature = newVal;
	}
}//end Certificate