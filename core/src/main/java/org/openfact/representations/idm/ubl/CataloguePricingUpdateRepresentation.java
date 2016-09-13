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
 * A document used to update information about prices in an existing Catalogue.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:19:49 a. m.
 */
public class CataloguePricingUpdateRepresentation {

    /**
     * Identifies a user-defined customization of UBL for a specific use.
     */
    private IdentifierRepresentation customizationID;
    /**
     * Describes the CatalogueRepresentation Revision.
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
     * The number of lines in the document.
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
     * Identifies an instance of executing a profile, to associate all
     * transactions in a collaboration.
     */
    private IdentifierRepresentation profileExecutionID;
    /**
     * Identifies a user-defined profile of the subset of UBL being used.
     */
    private IdentifierRepresentation profileID;
    /**
     * The date, assigned by the seller, on which the CatalogueRepresentation
     * was revised.
     */
    private LocalDate revisionDate;
    /**
     * The time, assigned by the seller, at which the CatalogueRepresentation
     * was revised.
     */
    private LocalTime revisionTime;
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
    /**
     * Indicates the current version of the catalogue.
     */
    private IdentifierRepresentation versionID;
    private List<CataloguePricingUpdateLineRepresentation> cataloguePricingUpdateLines = new ArrayList<>();
    private CatalogueReferenceRepresentation relatedCatalogueReference;
    private ContractRepresentation referencedContract;
    private CustomerPartyRepresentation contractorCustomerParty;
    private LanguageRepresentation defaultLanguage;
    private PartyRepresentation providerParty;
    private PartyRepresentation receiverParty;
    private PeriodRepresentation validityPeriod;
    private List<SignatureRepresentation> signatures = new ArrayList<>();
    private SupplierPartyRepresentation sellerSupplierParty;
    private List<TradingTermsRepresentation> tradingTermses = new ArrayList<>();

}
