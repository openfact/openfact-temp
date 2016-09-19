//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "CUSTOMERPARTY")
public class CustomerPartyEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "CUSTOMER_ASSIGNED_ACCOUNTID")
    protected String customerAssignedAccountID;

    @Column(name = "SUPPLIER_ASSIGNED_ACCOUNTID")
    protected String supplierAssignedAccountID;

    @ElementCollection
    @Column(name = "VALUE")
    @CollectionTable(name = "ADDITIONALACCOUNTID_CUSTOMERPARTY", joinColumns = {
            @JoinColumn(name = "CUSTOMERPARTY_ID") })
    protected List<String> additionalAccountID;

    @ManyToOne(targetEntity = PartyType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PARTY_CUSTOMERPARTYTYPE_ID")
    protected PartyType party;

    @ManyToOne(targetEntity = ContactEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DELIVERYCONTACT_CUSTOMERPARTY")
    protected ContactEntity deliveryContact;

    @ManyToOne(targetEntity = ContactEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ACCOUNTINGCONTACT_CUSTOMERPARTY")
    protected ContactEntity accountingContact;

    @ManyToOne(targetEntity = ContactEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BUYERCONTACT_CUSTOMERPARTY")
    protected ContactEntity buyerContact;

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
     * @return the customerAssignedAccountID
     */
    public String getCustomerAssignedAccountID() {
        return customerAssignedAccountID;
    }

    /**
     * @param customerAssignedAccountID
     *            the customerAssignedAccountID to set
     */
    public void setCustomerAssignedAccountID(String customerAssignedAccountID) {
        this.customerAssignedAccountID = customerAssignedAccountID;
    }

    /**
     * @return the supplierAssignedAccountID
     */
    public String getSupplierAssignedAccountID() {
        return supplierAssignedAccountID;
    }

    /**
     * @param supplierAssignedAccountID
     *            the supplierAssignedAccountID to set
     */
    public void setSupplierAssignedAccountID(String supplierAssignedAccountID) {
        this.supplierAssignedAccountID = supplierAssignedAccountID;
    }

    /**
     * @return the additionalAccountID
     */
    public List<String> getAdditionalAccountID() {
        if (this.additionalAccountID == null) {
            this.additionalAccountID = new ArrayList<>();
        }
        return additionalAccountID;
    }

    /**
     * @param additionalAccountID
     *            the additionalAccountID to set
     */
    public void setAdditionalAccountID(List<String> additionalAccountID) {
        this.additionalAccountID = additionalAccountID;
    }

    /**
     * @return the party
     */
    public PartyType getParty() {
        if (this.party == null) {
            this.party = new PartyType();
        }
        return party;
    }

    /**
     * @param party
     *            the party to set
     */
    public void setParty(PartyType party) {
        this.party = party;
    }

    /**
     * @return the deliveryContact
     */
    public ContactEntity getDeliveryContact() {
        if (this.deliveryContact == null) {
            this.deliveryContact = new ContactEntity();
        }
        return deliveryContact;
    }

    /**
     * @param deliveryContact
     *            the deliveryContact to set
     */
    public void setDeliveryContact(ContactEntity deliveryContact) {
        this.deliveryContact = deliveryContact;
    }

    /**
     * @return the accountingContact
     */
    public ContactEntity getAccountingContact() {
        if (this.accountingContact == null) {
            this.accountingContact = new ContactEntity();
        }
        return accountingContact;
    }

    /**
     * @param accountingContact
     *            the accountingContact to set
     */
    public void setAccountingContact(ContactEntity accountingContact) {
        this.accountingContact = accountingContact;
    }

    /**
     * @return the buyerContact
     */
    public ContactEntity getBuyerContact() {
        if (this.buyerContact == null) {
            this.buyerContact = new ContactEntity();
        }
        return buyerContact;
    }

    /**
     * @param buyerContact
     *            the buyerContact to set
     */
    public void setBuyerContact(ContactEntity buyerContact) {
        this.buyerContact = buyerContact;
    }

}