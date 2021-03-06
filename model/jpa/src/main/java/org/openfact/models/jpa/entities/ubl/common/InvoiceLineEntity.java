//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "INVOICELINE")
public class InvoiceLineEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "ID_UBL")
    protected String ID;

    @Column(name = "UUID")
    protected String uuid;

    @Column(name = "NOTE")
    protected String note;

    @ManyToOne(targetEntity = QuantityEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "INVOICEDQUANTITY_INVOICELINE")
    protected QuantityEntity invoicedQuantity = new QuantityEntity();

    @Column(name = "LINE_EXTENSION_AMOUNT")
    protected BigDecimal lineExtensionAmount;

    @Column(name = "TAX_POINT_DATE")
    @Type(type = "org.hibernate.type.LocalDateType")
    protected LocalDate taxPointDate;

    @Column(name = "ACCOUNTING_COST_CODE")
    protected String accountingCostCode;

    @Column(name = "ACCOUNTING_COST")
    protected String accountingCost;

    @Column(name = "FREE_OF_CHARGE_INDICATOR")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    protected boolean freeOfChargeIndicator;

    @OneToMany(targetEntity = OrderLineReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ORDERLINEREFERENCE")
    protected List<OrderLineReferenceEntity> orderLineReference = new ArrayList<>();

    @OneToMany(targetEntity = LineReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DESPATCHLINEREFERENCE")
    protected List<LineReferenceEntity> despatchLineReference = new ArrayList<>();

    @OneToMany(targetEntity = LineReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "RECEIPTLINEREFERENCE")
    protected List<LineReferenceEntity> receiptLineReference = new ArrayList<>();

    @OneToMany(targetEntity = BillingReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BILLINGREFERENCE")
    protected List<BillingReferenceEntity> billingReference = new ArrayList<>();

    @OneToMany(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DOCUMENTREFERENCE")
    protected List<DocumentReferenceEntity> documentReference = new ArrayList<>();

    @ManyToOne(targetEntity = PricingReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PRICINGREFERENCE")
    protected PricingReferenceEntity pricingReference = new PricingReferenceEntity();

    @ManyToOne(targetEntity = PartyEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ORIGINATORPARTY")
    protected PartyEntity originatorParty = new PartyEntity();

    @OneToMany(targetEntity = DeliveryEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DELIVERY")
    protected List<DeliveryEntity> delivery = new ArrayList<>();

    @OneToMany(targetEntity = PaymentTermsEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PAYMENTTERMS")
    protected List<PaymentTermsEntity> paymentTerms = new ArrayList<>();

    @OneToMany(targetEntity = AllowanceChargeEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ALLOWANCECHARGE")
    protected List<AllowanceChargeEntity> allowanceCharge = new ArrayList<>();

    @OneToMany(targetEntity = TaxTotalEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TAXTOTAL")
    protected List<TaxTotalEntity> taxTotal = new ArrayList<>();

    @ManyToOne(targetEntity = ItemEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ITEM")
    protected ItemEntity item = new ItemEntity();

    @ManyToOne(targetEntity = PriceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PRICE")
    protected PriceEntity price = new PriceEntity();

    @ManyToOne(targetEntity = DeliveryTermsEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DELIVERYTERMS")
    protected DeliveryTermsEntity deliveryTerms = new DeliveryTermsEntity();

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
     * @return the iD
     */
    public String getID() {
        return ID;
    }

    /**
     * @param iD
     *            the iD to set
     */
    public void setID(String iD) {
        ID = iD;
    }

    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     *            the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     *            the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the invoicedQuantity
     */
    public QuantityEntity getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * @param invoicedQuantity
     *            the invoicedQuantity to set
     */
    public void setInvoicedQuantity(QuantityEntity invoicedQuantity) {
        this.invoicedQuantity = invoicedQuantity;
    }

    /**
     * @return the lineExtensionAmount
     */
    public BigDecimal getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * @param lineExtensionAmount
     *            the lineExtensionAmount to set
     */
    public void setLineExtensionAmount(BigDecimal lineExtensionAmount) {
        this.lineExtensionAmount = lineExtensionAmount;
    }

    /**
     * @return the taxPointDate
     */
    public LocalDate getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * @param taxPointDate
     *            the taxPointDate to set
     */
    public void setTaxPointDate(LocalDate taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    /**
     * @return the accountingCostCode
     */
    public String getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * @param accountingCostCode
     *            the accountingCostCode to set
     */
    public void setAccountingCostCode(String accountingCostCode) {
        this.accountingCostCode = accountingCostCode;
    }

    /**
     * @return the accountingCost
     */
    public String getAccountingCost() {
        return accountingCost;
    }

    /**
     * @param accountingCost
     *            the accountingCost to set
     */
    public void setAccountingCost(String accountingCost) {
        this.accountingCost = accountingCost;
    }

    /**
     * @return the freeOfChargeIndicator
     */
    public boolean isFreeOfChargeIndicator() {
        return freeOfChargeIndicator;
    }

    /**
     * @param freeOfChargeIndicator
     *            the freeOfChargeIndicator to set
     */
    public void setFreeOfChargeIndicator(boolean freeOfChargeIndicator) {
        this.freeOfChargeIndicator = freeOfChargeIndicator;
    }

    /**
     * @return the orderLineReference
     */
    public List<OrderLineReferenceEntity> getOrderLineReference() {
        return orderLineReference;
    }

    /**
     * @param orderLineReference
     *            the orderLineReference to set
     */
    public void setOrderLineReference(List<OrderLineReferenceEntity> orderLineReference) {
        this.orderLineReference = orderLineReference;
    }

    /**
     * @return the despatchLineReference
     */
    public List<LineReferenceEntity> getDespatchLineReference() {
        return despatchLineReference;
    }

    /**
     * @param despatchLineReference
     *            the despatchLineReference to set
     */
    public void setDespatchLineReference(List<LineReferenceEntity> despatchLineReference) {
        this.despatchLineReference = despatchLineReference;
    }

    /**
     * @return the receiptLineReference
     */
    public List<LineReferenceEntity> getReceiptLineReference() {
        return receiptLineReference;
    }

    /**
     * @param receiptLineReference
     *            the receiptLineReference to set
     */
    public void setReceiptLineReference(List<LineReferenceEntity> receiptLineReference) {
        this.receiptLineReference = receiptLineReference;
    }

    /**
     * @return the billingReference
     */
    public List<BillingReferenceEntity> getBillingReference() {
        return billingReference;
    }

    /**
     * @param billingReference
     *            the billingReference to set
     */
    public void setBillingReference(List<BillingReferenceEntity> billingReference) {
        this.billingReference = billingReference;
    }

    /**
     * @return the documentReference
     */
    public List<DocumentReferenceEntity> getDocumentReference() {
        return documentReference;
    }

    /**
     * @param documentReference
     *            the documentReference to set
     */
    public void setDocumentReference(List<DocumentReferenceEntity> documentReference) {
        this.documentReference = documentReference;
    }

    /**
     * @return the pricingReference
     */
    public PricingReferenceEntity getPricingReference() {
        return pricingReference;
    }

    /**
     * @param pricingReference
     *            the pricingReference to set
     */
    public void setPricingReference(PricingReferenceEntity pricingReference) {
        this.pricingReference = pricingReference;
    }

    /**
     * @return the originatorParty
     */
    public PartyEntity getOriginatorParty() {
        return originatorParty;
    }

    /**
     * @param originatorParty
     *            the originatorParty to set
     */
    public void setOriginatorParty(PartyEntity originatorParty) {
        this.originatorParty = originatorParty;
    }

    /**
     * @return the delivery
     */
    public List<DeliveryEntity> getDelivery() {
        return delivery;
    }

    /**
     * @param delivery
     *            the delivery to set
     */
    public void setDelivery(List<DeliveryEntity> delivery) {
        this.delivery = delivery;
    }

    /**
     * @return the paymentTerms
     */
    public List<PaymentTermsEntity> getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * @param paymentTerms
     *            the paymentTerms to set
     */
    public void setPaymentTerms(List<PaymentTermsEntity> paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    /**
     * @return the allowanceCharge
     */
    public List<AllowanceChargeEntity> getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * @param allowanceCharge
     *            the allowanceCharge to set
     */
    public void setAllowanceCharge(List<AllowanceChargeEntity> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    /**
     * @return the taxTotal
     */
    public List<TaxTotalEntity> getTaxTotal() {
        return taxTotal;
    }

    /**
     * @param taxTotal
     *            the taxTotal to set
     */
    public void setTaxTotal(List<TaxTotalEntity> taxTotal) {
        this.taxTotal = taxTotal;
    }

    /**
     * @return the item
     */
    public ItemEntity getItem() {
        return item;
    }

    /**
     * @param item
     *            the item to set
     */
    public void setItem(ItemEntity item) {
        this.item = item;
    }

    /**
     * @return the price
     */
    public PriceEntity getPrice() {
        return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public void setPrice(PriceEntity price) {
        this.price = price;
    }

    /**
     * @return the deliveryTerms
     */
    public DeliveryTermsEntity getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * @param deliveryTerms
     *            the deliveryTerms to set
     */
    public void setDeliveryTerms(DeliveryTermsEntity deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

}
