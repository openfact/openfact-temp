package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.models.jpa.entities.ublType.CodeType;
import org.openfact.models.jpa.entities.ublType.QuantityType;
import org.openfact.models.jpa.entities.ublType.TextType;

/**
 * A class to describe a meter and its readings.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:16:06 a. m.
 */
public class MeterEntity {

    /**
     * The factor by which readings of this meter must be multiplied to
     * calculate consumption, expressed as text.
     */
    private TextType MeterConstant;
    /**
     * A code signifying the formula to be used in applying the meter constant.
     */
    private CodeType MeterConstantCode;
    /**
     * The name of this meter, which serves as an identifier to distinguish a
     * main meter from a submeter.
     */
    private TextType MeterName;
    /**
     * The meter number, expressed as text.
     */
    private TextType MeterNumber;
    /**
     * The quantity delivered; the total quantity consumed as calculated from
     * the meter readings.
     */
    private QuantityType TotalDeliveredQuantity;
    private List<MeterPropertyEntity> MeterProperties = new ArrayList<>();
    private List<MeterReadingEntity> MeterReadings = new ArrayList<>();

}
