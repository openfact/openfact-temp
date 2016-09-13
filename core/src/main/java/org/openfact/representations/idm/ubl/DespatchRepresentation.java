package org.openfact.representations.idm.ubl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.IdentifierRepresentation;
import org.openfact.representations.idm.ubl.type.TextRepresentation;

/**
 * A class to describe the despatching of goods (their pickup for delivery).
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:14:28 a. m.
 */
public class DespatchRepresentation {

    /**
     * The actual despatch (pickup) date.
     */
    private LocalDate actualDespatchDate;
    /**
     * The actual despatch (pickup) time.
     */
    private LocalTime actualDespatchTime;
    /**
     * The estimated despatch (pickup) date.
     */
    private LocalDate estimatedDespatchDate;
    /**
     * The estimated despatch (pickup) time.
     */
    private LocalTime estimatedDespatchTime;
    /**
     * The date guaranteed for the despatch (pickup).
     */
    private LocalDate guaranteedDespatchDate;
    /**
     * The time guaranteed for the despatch (pickup).
     */
    private LocalTime guaranteedDespatchTime;
    /**
     * An identifier for this despatch event.
     */
    private IdentifierRepresentation ID;
    /**
     * Text describing any special instructions applying to the despatch
     * (pickup).
     */
    private TextRepresentation instructions;
    /**
     * An identifier for the release of the despatch used as security control or
     * cargo control (pick-up).
     */
    private IdentifierRepresentation releaseID;
    /**
     * The despatch (pickup) date requested, normally by the buyer.
     */
    private LocalDate requestedDespatchDate;
    /**
     * The despatch (pickup) time requested, normally by the buyer.
     */
    private LocalTime requestedDespatchTime;
    private AddressRepresentation despatchAddress;
    private List<ContactRepresentation> contacts = new ArrayList<>();
    private LocationRepresentation despatchLocation;
    private PartyRepresentation notifyParty;
    private PartyRepresentation carrierParty;
    private PartyRepresentation despatchParty;
    private PeriodRepresentation requestedDespatchPeriod;
    private PeriodRepresentation estimatedDespatchPeriod;

}
