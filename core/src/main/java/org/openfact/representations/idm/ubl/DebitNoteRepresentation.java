package org.openfact.representations.idm.ubl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.openfact.representations.idm.ubl.common.BillingReferenceRepresentation;
import org.openfact.representations.idm.ubl.common.CustomerPartyRepresentation;
import org.openfact.representations.idm.ubl.common.DebitNoteLineRepresentation;
import org.openfact.representations.idm.ubl.common.DocumentReferenceRepresentation;
import org.openfact.representations.idm.ubl.common.ExchangeRateRepresentation;
import org.openfact.representations.idm.ubl.common.MonetaryTotalRepresentation;
import org.openfact.representations.idm.ubl.common.OrderReferenceRepresentation;
import org.openfact.representations.idm.ubl.common.PartyRepresentation;
import org.openfact.representations.idm.ubl.common.PaymentRepresentation;
import org.openfact.representations.idm.ubl.common.PeriodRepresentation;
import org.openfact.representations.idm.ubl.common.ResponseRepresentation;
import org.openfact.representations.idm.ubl.common.SignatureRepresentation;
import org.openfact.representations.idm.ubl.common.SupplierPartyRepresentation;
import org.openfact.representations.idm.ubl.common.TaxTotalRepresentation;
import org.openfact.representations.idm.ubl.common.UBLExtensionsRepresentation;

public class DebitNoteRepresentation {
    private UBLExtensionsRepresentation UBLExtensions;
    private String UBLVersionID;
    private String customizationID;
    private String profileID;
    private String ID;
    private boolean copyIndicator;
    private String UUID;
    private LocalDate issueDate;
    private LocalTime issueTime;
    private List<String> note;
    private LocalDate taxPointDate;
    private String documentCurrencyCode;
    private String taxCurrencyCode;
    private String pricingCurrencyCode;
    private String paymentCurrencyCode;
    private String paymentAlternativeCurrencyCode;
    private String accountingCostCode;
    private String accountingCost;
    private BigDecimal lineCountNumeric;
    private List<PeriodRepresentation> invoicePeriod;
    private List<ResponseRepresentation> discrepancyResponse;
    private OrderReferenceRepresentation orderReference;
    private List<BillingReferenceRepresentation> billingReference;
    private List<DocumentReferenceRepresentation> despatchDocumentReference;
    private List<DocumentReferenceRepresentation> receiptDocumentReference;
    private List<DocumentReferenceRepresentation> contractDocumentReference;
    private List<DocumentReferenceRepresentation> additionalDocumentReference;
    private List<SignatureRepresentation> signature;
    private SupplierPartyRepresentation accountingSupplierParty;
    private CustomerPartyRepresentation accountingCustomerParty;
    private PartyRepresentation payeeParty;
    private PartyRepresentation taxRepresentativeParty;
    private List<PaymentRepresentation> prepaidPayment;
    private ExchangeRateRepresentation taxExchangeRate;
    private ExchangeRateRepresentation pricingExchangeRate;
    private ExchangeRateRepresentation paymentExchangeRate;
    private ExchangeRateRepresentation paymentAlternativeExchangeRate;
    private List<TaxTotalRepresentation> taxTotal;
    private MonetaryTotalRepresentation requestedMonetaryTotal;
    private List<DebitNoteLineRepresentation> debitNoteLine;
    private String id;
}