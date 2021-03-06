//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.math.BigDecimal;

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
@Table(name = "TAXSUBTOTAL")
public class TaxSubtotalEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "TAXABLE_AMOUNT")
    protected BigDecimal taxableAmount;

    @Column(name = "TAX_AMOUNT")
    protected BigDecimal taxAmount;

    @Column(name = "CALCULATION_SEQUENCE_NUMERIC")
    protected BigDecimal calculationSequenceNumeric;

    @Column(name = "TRANSACTION_CURRENCY_TAX_AMOUNT")
    protected BigDecimal transactionCurrencyTaxAmount;

    @Column(name = "PERCENT_TAX_SUBTOTAL")
    protected BigDecimal percent;

    @ManyToOne(targetEntity = MeasureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BASEUNITMEASURE_TAXSUBTOTAL_ID")
    protected MeasureEntity baseUnitMeasure = new MeasureEntity();

    @Column(name = "PER_UNIT_AMOUNT")
    protected BigDecimal perUnitAmount;

    @Column(name = "TIER_RANGE")
    protected String tierRange;

    @Column(name = "TIER_RATE_PERCENT")
    protected BigDecimal tierRatePercent;

    @ManyToOne(targetEntity = TaxCategoryEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TAXCATEGORY_TAXSUBTOTAL_ID")
    protected TaxCategoryEntity taxCategory = new TaxCategoryEntity();

    /**
     * @return the taxableAmount
     */
    public BigDecimal getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * @param taxableAmount
     *            the taxableAmount to set
     */
    public void setTaxableAmount(BigDecimal taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    /**
     * @return the taxAmount
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * @param taxAmount
     *            the taxAmount to set
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * @return the calculationSequenceNumeric
     */
    public BigDecimal getCalculationSequenceNumeric() {
        return calculationSequenceNumeric;
    }

    /**
     * @param calculationSequenceNumeric
     *            the calculationSequenceNumeric to set
     */
    public void setCalculationSequenceNumeric(BigDecimal calculationSequenceNumeric) {
        this.calculationSequenceNumeric = calculationSequenceNumeric;
    }

    /**
     * @return the transactionCurrencyTaxAmount
     */
    public BigDecimal getTransactionCurrencyTaxAmount() {
        return transactionCurrencyTaxAmount;
    }

    /**
     * @param transactionCurrencyTaxAmount
     *            the transactionCurrencyTaxAmount to set
     */
    public void setTransactionCurrencyTaxAmount(BigDecimal transactionCurrencyTaxAmount) {
        this.transactionCurrencyTaxAmount = transactionCurrencyTaxAmount;
    }

    /**
     * @return the percent
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * @param percent
     *            the percent to set
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /**
     * @return the baseUnitMeasure
     */
    public MeasureEntity getBaseUnitMeasure() {
        return baseUnitMeasure;
    }

    /**
     * @param baseUnitMeasure
     *            the baseUnitMeasure to set
     */
    public void setBaseUnitMeasure(MeasureEntity baseUnitMeasure) {
        this.baseUnitMeasure = baseUnitMeasure;
    }

    /**
     * @return the perUnitAmount
     */
    public BigDecimal getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * @param perUnitAmount
     *            the perUnitAmount to set
     */
    public void setPerUnitAmount(BigDecimal perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
    }

    /**
     * @return the tierRange
     */
    public String getTierRange() {
        return tierRange;
    }

    /**
     * @param tierRange
     *            the tierRange to set
     */
    public void setTierRange(String tierRange) {
        this.tierRange = tierRange;
    }

    /**
     * @return the tierRatePercent
     */
    public BigDecimal getTierRatePercent() {
        return tierRatePercent;
    }

    /**
     * @param tierRatePercent
     *            the tierRatePercent to set
     */
    public void setTierRatePercent(BigDecimal tierRatePercent) {
        this.tierRatePercent = tierRatePercent;
    }

    /**
     * @return the taxCategory
     */
    public TaxCategoryEntity getTaxCategory() {
        return taxCategory;
    }

    /**
     * @param taxCategory
     *            the taxCategory to set
     */
    public void setTaxCategory(TaxCategoryEntity taxCategory) {
        this.taxCategory = taxCategory;
    }

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

}
