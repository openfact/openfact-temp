package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.models.jpa.entities.ublType.AmountType;

/**
 * A class to describe a price extension, calculated by multiplying the price
 * per unit by the quantity of items.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:16:54 a. m.
 */
public class PriceExtensionEntity {

    /**
     * The amount of this price extension.
     */
    private AmountType Amount;
    private List<TaxTotalEntity> TaxTotals = new ArrayList<>();

}