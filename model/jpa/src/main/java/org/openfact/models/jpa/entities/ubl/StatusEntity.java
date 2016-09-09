package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.models.jpa.entities.ublType.CodeType;
import org.openfact.models.jpa.entities.ublType.DateType;
import org.openfact.models.jpa.entities.ublType.IdentifierType;
import org.openfact.models.jpa.entities.ublType.IndicatorType;
import org.openfact.models.jpa.entities.ublType.PercentType;
import org.openfact.models.jpa.entities.ublType.TextType;
import org.openfact.models.jpa.entities.ublType.TimeType;

/**
 * A class to describe the condition or position of an object.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:17:51 a. m.
 */
public class StatusEntity {

    /**
     * Provides any textual information related to this status.
     */
    // private TextType ;

    /**
     * Specifies the status condition of the related object.
     */
    private CodeType ConditionCode;
    /**
     * Text describing this status.
     */
    private TextType Description;
    /**
     * Specifies an indicator relevant to a specific status.
     */
    private IndicatorType IndicationIndicator;
    /**
     * A percentage meaningful in the context of this status.
     */
    private PercentType Percent;
    /**
     * The reference date for this status.
     */
    private DateType ReferenceDate;
    /**
     * The reference time for this status.
     */
    private TimeType ReferenceTime;
    /**
     * The reliability of this status, expressed as a percentage.
     */
    private PercentType ReliabilityPercent;
    /**
     * A sequence identifier for this status.
     */
    private IdentifierType SequenceID;
    /**
     * The reason for this status condition or position, expressed as text.
     */
    private TextType StatusReason;
    /**
     * The reason for this status condition or position, expressed as a code.
     */
    private CodeType StatusReasonCode;
    private List<ConditionEntity> Conditions = new ArrayList<>();

}
