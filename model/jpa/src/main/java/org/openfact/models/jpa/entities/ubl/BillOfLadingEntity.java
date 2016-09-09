package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.models.jpa.entities.ublType.AmountType;
import org.openfact.models.jpa.entities.ublType.DateType;
import org.openfact.models.jpa.entities.ublType.DocumentStatusCodeType;
import org.openfact.models.jpa.entities.ublType.IdentifierType;
import org.openfact.models.jpa.entities.ublType.IndicatorType;
import org.openfact.models.jpa.entities.ublType.NameType;
import org.openfact.models.jpa.entities.ublType.TextType;
import org.openfact.models.jpa.entities.ublType.TimeType;

/**
 * A document issued by the party who acts as an agent for a transportation
 * carrier or other agents to the party who gives instructions for the
 * transportation services (shipper, consignor, etc.) stating the details of the
 * transportation, charges, and terms a
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:19:12 a. m.
 */
public class BillOfLadingEntity {

    /**
     * A term used in commerce in reference to certain duties, called ad valorem
     * duties, which are levied on commodities at certain rates per centum on
     * their value.
     */
    private IndicatorType AdValoremIndicator;
    /**
     * Reference number (such as a booking reference number) assigned by a
     * carrier or its agent to identify a specific shipment when cargo space is
     * reserved prior to loading.
     */
    private IdentifierType CarrierAssignedID;
    /**
     * Identifies a user-defined customization of UBL for a specific use.
     */
    private IdentifierType CustomizationID;
    /**
     * Value declared by the shipper or his agent solely for the purpose of
     * varying the carrier's level of liability from that provided in the
     * contract of carriage in case of loss or damage to goods or delayed
     * delivery.
     */
    private AmountType DeclaredCarriageValueAmount;
    /**
     * Textual description of the document instance.
     */
    private TextType Description;
    /**
     * A code signifying the status of the BillOfLadingEntity (revision,
     * replacement, etc. ).
     */
    private DocumentStatusCodeType CodeTypeDocumentStatusCode;
    /**
     * An identifier for this document, assigned by the sender.
     */
    private IdentifierType ID;
    /**
     * The date, assigned by the sender, on which this document was issued.
     */
    private DateType IssueDate;
    /**
     * The time, assigned by the sender, at which this document was issued.
     */
    private TimeType IssueTime;
    /**
     * Text, assigned by the sender, that identifies this document to business
     * users.
     */
    private NameType Name;
    /**
     * Free-form text pertinent to this document, conveying information that is
     * not contained explicitly in other structures.
     */
    private TextType Note;
    /**
     * Other free-text instructions to the forwarders or carriers related to the
     * shipment. This element should only be used where such information cannot
     * be represented in other structured information entities within the
     * document.
     */
    private TextType OtherInstruction;
    /**
     * Identifies an instance of executing a profile, to associate all
     * transactions in a collaboration.
     */
    private IdentifierType ProfileExecutionID;
    /**
     * Identifies a user-defined profile of the customization of UBL being used.
     */
    private IdentifierType ProfileID;
    /**
     * Reference number to identify a Shipping OrderEntity or Forwarding
     * Instruction.
     */
    private IdentifierType ShippingOrderID;
    /**
     * Indicates whether the transport document is consigned to order.
     */
    private IndicatorType ToOrderIndicator;
    /**
     * Identifies the earliest version of the UBL 2 schema for this document
     * type that defines all of the elements that might be encountered in the
     * current instance.
     */
    private IdentifierType UBLVersionID;
    /**
     * A universally unique identifier for an instance of this document.
     */
    private IdentifierType UUID;
    private List<DocumentDistributionEntity> DocumentDistributions = new ArrayList<>();
    private List<DocumentReferenceEntity> DocumentReferences = new ArrayList<>();
    private List<ExchangeRateEntity> ExchangeRates = new ArrayList<>();
    private PartyEntity ConsignorParty;
    private PartyEntity CarrierParty;
    private PartyEntity FreightForwarderParty;
    private List<ShipmentEntity> Shipments = new ArrayList<>();
    private List<SignatureEntity> Signatures = new ArrayList<>();

}