package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.models.jpa.entities.ublType.CodeType;
import org.openfact.models.jpa.entities.ublType.IdentifierType;
import org.openfact.models.jpa.entities.ublType.NumericType;
import org.openfact.models.jpa.entities.ublType.QuantityType;
import org.openfact.models.jpa.entities.ublType.TextType;

/**
 * A class to describe the consumption of a utility product.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:56 a. m.
 */
public class UtilityItemEntity {

    /**
     * The type of product consumed, expressed as text.
     */
    private TextType ConsumptionType;
    /**
     * The type of product consumed, expressed as a code.
     */
    private CodeType ConsumptionTypeCode;
    /**
     * Information of the actual payments type for the utility Item
     */
    private TextType CurrentChargeType;
    /**
     * Information of the actual payments type code expressed as a code
     */
    private CodeType CurrentChargeTypeCode;
    /**
     * Text describing the consumption product.
     */
    private TextType Description;
    /**
     * An identifier for this utility item.
     */
    private IdentifierType ID;
    /**
     * Information about the one-time payment type in case everything is paid
     * One time
     */
    private TextType OneTimeChargeType;
    /**
     * Information about the one-time payment type code
     */
    private CodeType OneTimeChargeTypeCode;
    /**
     * The unit packaging quantity.
     */
    private QuantityType PackQuantity;
    /**
     * The number of items in a pack.
     */
    private NumericType PackSizeNumeric;
    /**
     * An identifier for the subscriber to the utility.
     */
    private IdentifierType SubscriberID;
    /**
     * Identification of the subscriber type, expressed as text..
     */
    private TextType SubscriberType;
    /**
     * The code identifying for the service type.
     */
    private CodeType SubscriberTypeCode;
    private List<ContractEntity> Contracts = new ArrayList<>();
    private List<TaxCategoryEntity> TaxCategories = new ArrayList<>();

}
