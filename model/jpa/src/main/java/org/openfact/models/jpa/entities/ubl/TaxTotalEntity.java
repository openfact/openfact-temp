package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.models.jpa.entities.ublType.AmountType;
import org.openfact.models.jpa.entities.ublType.IndicatorType;

/**
 * A class to describe the total tax for a particular taxation scheme.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:18:07 a. m.
 */
public class TaxTotalEntity {

    /**
     * The rounding amount (positive or negative) added to the calculated tax
     * total to produce the rounded TaxAmount.
     */
    private AmountType RoundingAmount;
    /**
     * The total tax amount for a particular taxation scheme, e.g., VAT; the sum
     * of the tax subtotals for each tax category within the taxation scheme.
     */
    private AmountType TaxAmount;
    /**
     * An indicator that this total is recognized as legal evidence for taxation
     * purposes (true) or not (false).
     */
    private IndicatorType TaxEvidenceIndicator;
    /**
     * An indicator that tax is included in the calculation (true) or not
     * (false).
     */
    private IndicatorType TaxIncludedIndicator;
    private List<TaxSubtotalEntity> TaxSubtotals = new ArrayList<>();

}