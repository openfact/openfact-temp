//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PARTY_TAX_SCHEME")
public class PartyTaxSchemeEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "REGISTRATION_NAME")
    protected String registrationName;

    @Column(name = "COMPANY_ID")
    protected String companyID;

    @Column(name = "TAX_LEVEL_CODE")
    protected String taxLevelCode;

    @Column(name = "EXEMPTION_REASON_CODE")
    protected String exemptionReasonCode;

    @Column(name = "EXEMPTION_REASON")
    protected String exemptionReason;

    @ManyToOne(targetEntity = AddressEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "REGISTRATIONADDRESS")
    protected AddressEntity registrationAddress = new AddressEntity();

    @ManyToOne(targetEntity = TaxSchemeEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TAXSCHEME_PARTY")
    protected TaxSchemeEntity taxScheme = new TaxSchemeEntity();

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the registrationName
     */
    public String getRegistrationName() {
        return registrationName;
    }

    /**
     * @param registrationName
     *            the registrationName to set
     */
    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    /**
     * @return the companyID
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * @param companyID
     *            the companyID to set
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    /**
     * @return the taxLevelCode
     */
    public String getTaxLevelCode() {
        return taxLevelCode;
    }

    /**
     * @param taxLevelCode
     *            the taxLevelCode to set
     */
    public void setTaxLevelCode(String taxLevelCode) {
        this.taxLevelCode = taxLevelCode;
    }

    /**
     * @return the exemptionReasonCode
     */
    public String getExemptionReasonCode() {
        return exemptionReasonCode;
    }

    /**
     * @param exemptionReasonCode
     *            the exemptionReasonCode to set
     */
    public void setExemptionReasonCode(String exemptionReasonCode) {
        this.exemptionReasonCode = exemptionReasonCode;
    }

    /**
     * @return the exemptionReason
     */
    public String getExemptionReason() {
        return exemptionReason;
    }

    /**
     * @param exemptionReason
     *            the exemptionReason to set
     */
    public void setExemptionReason(String exemptionReason) {
        this.exemptionReason = exemptionReason;
    }

    /**
     * @return the registrationAddress
     */
    public AddressEntity getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * @param registrationAddress
     *            the registrationAddress to set
     */
    public void setRegistrationAddress(AddressEntity registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    /**
     * @return the taxScheme
     */
    public TaxSchemeEntity getTaxScheme() {
        return taxScheme;
    }

    /**
     * @param taxScheme
     *            the taxScheme to set
     */
    public void setTaxScheme(TaxSchemeEntity taxScheme) {
        this.taxScheme = taxScheme;
    }

}
