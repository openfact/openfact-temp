package org.openfact.representations.idm.ubl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.CodeRepresentation;
import org.openfact.representations.idm.ubl.type.IdentifierRepresentation;
import org.openfact.representations.idm.ubl.type.LineStatusCodeRepresentation;
import org.openfact.representations.idm.ubl.type.QuantityRepresentation;
import org.openfact.representations.idm.ubl.type.TextRepresentation;

/**
 * A class to describe a line item.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:15:55 a. m.
 */
public class LineItemRepresentation {

    /**
     * The buyer's accounting cost centre for this line item, expressed as text.
     */
    private TextRepresentation accountingCost;
    /**
     * The buyer's accounting cost centre for this line item, expressed as a
     * code.
     */
    private CodeRepresentation accountingCostCode;
    /**
     * An indicator that back order is allowed (true) or not (false).
     */
    private boolean backOrderAllowedIndicator;
    /**
     * An identifier for this line item, assigned by the buyer.
     */
    private IdentifierRepresentation ID;
    /**
     * A code signifying the inspection requirements for the item associated
     * with this line item.
     */
    private CodeRepresentation inspectionMethodCode;
    /**
     * The total amount for this line item, including allowance charges but net
     * of taxes.
     */
    private BigDecimal lineExtensionAmount;
    /**
     * A code signifying the status of this line item with respect to its
     * original state.
     */
    private LineStatusCodeRepresentation lineStatusCode;
    /**
     * The maximum back order quantity of the item associated with this line
     * (where back order is allowed).
     */
    private QuantityRepresentation maximumBackorderQuantity;
    /**
     * The maximum quantity of the item associated with this line.
     */
    private QuantityRepresentation maximumQuantity;
    /**
     * The minimum back order quantity of the item associated with this line
     * (where back order is allowed).
     */
    private QuantityRepresentation minimumBackorderQuantity;
    /**
     * The minimum quantity of the item associated with this line.
     */
    private QuantityRepresentation minimumQuantity;
    /**
     * Free-form text conveying information that is not contained explicitly in
     * other structures.
     */
    private TextRepresentation note;
    /**
     * An indicator that a partial delivery is allowed (true) or not (false).
     */
    private boolean partialDeliveryIndicator;
    /**
     * The quantity of items associated with this line item.
     */
    private QuantityRepresentation quantity;
    /**
     * An identifier for this line item, assigned by the seller.
     */
    private IdentifierRepresentation salesOrderID;
    /**
     * The total tax amount for this line item.
     */
    private BigDecimal totalTaxAmount;
    /**
     * A universally unique identifier for this line item.
     */
    private IdentifierRepresentation UUID;
    /**
     * Text describing a warranty (provided by WarrantyParty) for the good or
     * service described in this line item.
     */
    private TextRepresentation warrantyInformation;
    private List<AllowanceChargeRepresentation> allowanceCharges = new ArrayList<>();
    private List<DeliveryRepresentation> deliveries = new ArrayList<>();
    private List<DeliveryTermsRepresentation> deliveriesTerms = new ArrayList<>();
    private List<ItemRepresentation> items = new ArrayList<>();
    private LineItemRepresentation subLineItem;
    private List<LineReferenceRepresentation> lineReferences = new ArrayList<>();
    private PartyRepresentation originatorParty;
    private PartyRepresentation warrantyParty;
    private PeriodRepresentation warrantyValidityPeriod;
    private List<OrderedShipmentRepresentation> orderedShipments = new ArrayList<>();
    private List<PriceRepresentation> prices = new ArrayList<>();
    private PriceExtensionRepresentation itemPriceExtension;
    private List<PricingReferenceRepresentation> pricingReferences = new ArrayList<>();
    private List<TaxTotalRepresentation> taxTotals = new ArrayList<>();

}
