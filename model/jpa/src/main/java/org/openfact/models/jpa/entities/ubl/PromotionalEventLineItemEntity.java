package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.models.jpa.entities.ublType.AmountType;

/**
 * A class to describe a line item associated with a promotional event.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:10 a. m.
 */
public class PromotionalEventLineItemEntity {

    /**
     * The amount associated with this promotional event line item.
     */
    private AmountType Amount;
    private List<EventEntity> LineItemEventLineItems = new ArrayList<>();

}
