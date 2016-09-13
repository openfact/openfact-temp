package org.openfact.representations.idm.ubl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.IdentifierRepresentation;
import org.openfact.representations.idm.ubl.type.NameRepresentation;
import org.openfact.representations.idm.ubl.type.TextRepresentation;

/**
 * A document used to request a Catalogue.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:19:53 a. m.
 */
public class CatalogueRequestRepresentation {

    /**
     * Identifies a user-defined customization of UBL for a specific use.
     */
    private IdentifierRepresentation customizationID;
    /**
     * Textual description of the document instance.
     */
    private TextRepresentation description;
    /**
     * An identifier for this document, assigned by the sender.
     */
    private IdentifierRepresentation ID;
    /**
     * The date, assigned by the sender, on which this document was issued.
     */
    private LocalDate issueDate;
    /**
     * The time, assigned by the sender, at which this document was issued.
     */
    private LocalTime issueTime;
    /**
     * Indicates a request for an update of the item specifications.
     */
    private boolean itemUpdateRequestIndicator;
    /**
     * The number of CatalogueLines in this document.
     */
    private BigDecimal lineCountNumeric;
    /**
     * Text, assigned by the sender, that identifies this document to business
     * users.
     */
    private NameRepresentation name;
    /**
     * Free-form text pertinent to this document, conveying information that is
     * not contained explicitly in other structures.
     */
    private TextRepresentation note;
    /**
     * Indicates a request for a pricing update.
     */
    private boolean pricingUpdateRequestIndicator;
    /**
     * Identifies an instance of executing a profile, to associate all
     * transactions in a collaboration.
     */
    private IdentifierRepresentation profileExecutionID;
    /**
     * Identifies a user-defined profile of the customization of UBL being used.
     */
    private IdentifierRepresentation profileID;
    /**
     * Identifies the earliest version of the UBL 2 schema for this document
     * type that defines all of the elements that might be encountered in the
     * current instance.
     */
    private IdentifierRepresentation UBLVersionID;
    /**
     * A universally unique identifier for an instance of this document.
     */
    private IdentifierRepresentation UUID;
    private AddressRepresentation applicableTerritoryAddress;
    private CatalogueReferenceRepresentation requestedCatalogueReference;
    private List<CatalogueRequestRepresentation> lineCatalogueRequestLines = new ArrayList<>();
    private ClassificationSchemeRepresentation requestedClassificationScheme;
    private ContractRepresentation referencedContract;
    private CustomerPartyRepresentation contractorCustomerParty;
    private List<DocumentReferenceRepresentation> documentReferences = new ArrayList<>();
    private LanguageRepresentation requestedLanguage;
    private PartyRepresentation receiverParty;
    private PartyRepresentation providerParty;
    private PeriodRepresentation validityPeriod;
    private List<SignatureRepresentation> signatures = new ArrayList<>();
    private SupplierPartyRepresentation sellerSupplierParty;
    private List<TradingTermsRepresentation> tradingTermses = new ArrayList<>();

}
