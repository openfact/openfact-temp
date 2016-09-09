package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.models.jpa.entities.ublType.IdentifierType;
import org.openfact.models.jpa.entities.ublType.LineStatusCodeType;
import org.openfact.models.jpa.entities.ublType.QuantityType;
import org.openfact.models.jpa.entities.ublType.TextType;

/**
 * A class to define a line in a DespatchAdvice.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:14:29 a. m.
 */
public class DespatchLineEntity {

    /**
     * The quantity on back order at the supplier.
     */
    private QuantityType BackorderQuantity;
    /**
     * The reason for the back order.
     */
    private TextType BackorderReason;
    /**
     * The quantity despatched (picked up).
     */
    private QuantityType DeliveredQuantity;
    /**
     * An identifier for this despatch line.
     */
    private IdentifierType ID;
    /**
     * A code signifying the status of this despatch line with respect to its
     * original state.
     */
    private LineStatusCodeType LineStatusCode;
    /**
     * Free-form text conveying information that is not contained explicitly in
     * other structures.
     */
    private TextType Note;
    /**
     * The quantity outstanding (which will follow in a later despatch).
     */
    private QuantityType OutstandingQuantity;
    /**
     * The reason for the outstanding quantity.
     */
    private TextType OutstandingReason;
    /**
     * The quantity over-supplied, i.e., the quantity over and above that
     * ordered.
     */
    private QuantityType OversupplyQuantity;
    /**
     * A universally unique identifier for this despatch line.
     */
    private IdentifierType UUID;
    private List<DocumentReferenceEntity> DocumentReferences = new ArrayList<>();
    private List<ItemEntity> Items = new ArrayList<>();
    private List<OrderLineReferenceEntity> OrderLineReferences = new ArrayList<>();
    private List<ShipmentEntity> Shipments = new ArrayList<>();

}