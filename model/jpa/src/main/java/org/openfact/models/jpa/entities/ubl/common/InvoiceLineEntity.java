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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "InvoiceLineType")
@Table(name = "INVOICELINETYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class InvoiceLineEntity {

	protected String ID;
	protected String uuid;
	protected String note;
	protected QuantityEntity invoicedQuantity;
	protected BigDecimal lineExtensionAmount;
	protected LocalDate taxPointDate;
	protected String accountingCostCode;
	protected String accountingCost;
	protected boolean freeOfChargeIndicator;
	protected List<OrderLineReferenceEntity> orderLineReference;
	protected List<LineReferenceEntity> despatchLineReference;
	protected List<LineReferenceEntity> receiptLineReference;
	protected List<BillingReferenceEntity> billingReference;
	protected List<DocumentReferenceEntity> documentReference;
	protected PricingReferenceEntity pricingReference;
	protected PartyEntity originatorParty;
	protected List<DeliveryEntity> delivery;
	protected List<PaymentTermsEntity> paymentTerms;
	protected List<AllowanceChargeEntity> allowanceCharge;
	protected List<TaxTotalEntity> taxTotal;
	protected ItemEntity item;
	protected PriceEntity price;
	protected DeliveryTermsEntity deliveryTerms;
	protected String id;

	@Column(name = "ID")
	public String getID() {
		return ID;
	}

	public void setID(String value) {
		this.ID = value;
	}

	@Column(name = "UUID_INVOICELINETYPE_OFID")
	public String getUUID() {
		return uuid;
	}

	public void setUUID(String value) {
		this.uuid = value;
	}

	@Column(name = "NOTE")
	public String getNote() {
		return note;
	}

	public void setNote(String value) {
		this.note = value;
	}

	@ManyToOne(targetEntity = QuantityEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "INVOICEDQUANTITY_INVOICELINE_0")
	public QuantityEntity getInvoicedQuantity() {
		return invoicedQuantity;
	}

	public void setInvoicedQuantity(QuantityEntity value) {
		this.invoicedQuantity = value;
	}

	@Column(name = "LINE_EXTENSION_AMOUNT")
	public BigDecimal getLineExtensionAmount() {
		return lineExtensionAmount;
	}

	public void setLineExtensionAmount(BigDecimal value) {
		this.lineExtensionAmount = value;
	}

	@Column(name = "TAX_POINT_DATE")
	public LocalDate getTaxPointDate() {
		return taxPointDate;
	}

	public void setTaxPointDate(LocalDate value) {
		this.taxPointDate = value;
	}

	@Column(name = "ACCOUNTING_COST_CODE")
	public String getAccountingCostCode() {
		return accountingCostCode;
	}

	public void setAccountingCostCode(String value) {
		this.accountingCostCode = value;
	}

	@Column(name = "ACCOUNTING_COST")
	public String getAccountingCost() {
		return accountingCost;
	}

	public void setAccountingCost(String value) {
		this.accountingCost = value;
	}

	@Column(name = "FREE_OF_CHARGE_INDICATOR_")
	public boolean getFreeOfChargeIndicator() {
		return freeOfChargeIndicator;
	}

	public void setFreeOfChargeIndicator(boolean value) {
		this.freeOfChargeIndicator = value;
	}

	@OneToMany(targetEntity = OrderLineReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ORDERLINEREFERENCE")
	public List<OrderLineReferenceEntity> getOrderLineReference() {
		if (orderLineReference == null) {
			orderLineReference = new ArrayList<OrderLineReferenceEntity>();
		}
		return this.orderLineReference;
	}

	public void setOrderLineReference(List<OrderLineReferenceEntity> orderLineReference) {
		this.orderLineReference = orderLineReference;
	}

	@OneToMany(targetEntity = LineReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "DESPATCHLINEREFERENCE")
	public List<LineReferenceEntity> getDespatchLineReference() {
		if (despatchLineReference == null) {
			despatchLineReference = new ArrayList<LineReferenceEntity>();
		}
		return this.despatchLineReference;
	}

	public void setDespatchLineReference(List<LineReferenceEntity> despatchLineReference) {
		this.despatchLineReference = despatchLineReference;
	}

	@OneToMany(targetEntity = LineReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "RECEIPTLINEREFERENCE")
	public List<LineReferenceEntity> getReceiptLineReference() {
		if (receiptLineReference == null) {
			receiptLineReference = new ArrayList<LineReferenceEntity>();
		}
		return this.receiptLineReference;
	}

	public void setReceiptLineReference(List<LineReferenceEntity> receiptLineReference) {
		this.receiptLineReference = receiptLineReference;
	}

	@OneToMany(targetEntity = BillingReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "BILLINGREFERENCE")
	public List<BillingReferenceEntity> getBillingReference() {
		if (billingReference == null) {
			billingReference = new ArrayList<BillingReferenceEntity>();
		}
		return this.billingReference;
	}

	public void setBillingReference(List<BillingReferenceEntity> billingReference) {
		this.billingReference = billingReference;
	}

	@OneToMany(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "DOCUMENTREFERENCE")
	public List<DocumentReferenceEntity> getDocumentReference() {
		if (documentReference == null) {
			documentReference = new ArrayList<DocumentReferenceEntity>();
		}
		return this.documentReference;
	}

	public void setDocumentReference(List<DocumentReferenceEntity> documentReference) {
		this.documentReference = documentReference;
	}

	@ManyToOne(targetEntity = PricingReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "PRICINGREFERENCE")
	public PricingReferenceEntity getPricingReference() {
		return pricingReference;
	}

	public void setPricingReference(PricingReferenceEntity value) {
		this.pricingReference = value;
	}

	@ManyToOne(targetEntity = PartyEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ORIGINATORPARTY")
	public PartyEntity getOriginatorParty() {
		return originatorParty;
	}

	public void setOriginatorParty(PartyEntity value) {
		this.originatorParty = value;
	}

	@OneToMany(targetEntity = DeliveryEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "DELIVERY")
	public List<DeliveryEntity> getDelivery() {
		if (delivery == null) {
			delivery = new ArrayList<DeliveryEntity>();
		}
		return this.delivery;
	}

	public void setDelivery(List<DeliveryEntity> delivery) {
		this.delivery = delivery;
	}

	@OneToMany(targetEntity = PaymentTermsEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "PAYMENTTERMS")
	public List<PaymentTermsEntity> getPaymentTerms() {
		if (paymentTerms == null) {
			paymentTerms = new ArrayList<PaymentTermsEntity>();
		}
		return this.paymentTerms;
	}

	public void setPaymentTerms(List<PaymentTermsEntity> paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	@OneToMany(targetEntity = AllowanceChargeEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ALLOWANCECHARGE")
	public List<AllowanceChargeEntity> getAllowanceCharge() {
		if (allowanceCharge == null) {
			allowanceCharge = new ArrayList<AllowanceChargeEntity>();
		}
		return this.allowanceCharge;
	}

	public void setAllowanceCharge(List<AllowanceChargeEntity> allowanceCharge) {
		this.allowanceCharge = allowanceCharge;
	}

	@OneToMany(targetEntity = TaxTotalEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "TAXTOTAL")
	public List<TaxTotalEntity> getTaxTotal() {
		if (taxTotal == null) {
			taxTotal = new ArrayList<TaxTotalEntity>();
		}
		return this.taxTotal;
	}

	public void setTaxTotal(List<TaxTotalEntity> taxTotal) {
		this.taxTotal = taxTotal;
	}

	@ManyToOne(targetEntity = ItemEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ITEM")
	public ItemEntity getItem() {
		return item;
	}

	public void setItem(ItemEntity value) {
		this.item = value;
	}

	@ManyToOne(targetEntity = PriceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "PRICE")
	public PriceEntity getPrice() {
		return price;
	}

	public void setPrice(PriceEntity value) {
		this.price = value;
	}

	@ManyToOne(targetEntity = DeliveryTermsEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "DELIVERYTERMS")
	public DeliveryTermsEntity getDeliveryTerms() {
		return deliveryTerms;
	}

	public void setDeliveryTerms(DeliveryTermsEntity value) {
		this.deliveryTerms = value;
	}

	@Id
	@Column(name = "ID_OFID")
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Access(AccessType.PROPERTY)
	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
	}

}
