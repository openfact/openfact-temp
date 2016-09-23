package org.openfact.representations.idm.ubl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.common.AllowanceChargeRepresentation;
import org.openfact.representations.idm.ubl.common.BillingReferenceRepresentation;
import org.openfact.representations.idm.ubl.common.CreditNoteLineRepresentation;
import org.openfact.representations.idm.ubl.common.CustomerPartyRepresentation;
import org.openfact.representations.idm.ubl.common.DocumentReferenceRepresentation;
import org.openfact.representations.idm.ubl.common.ExchangeRateRepresentation;
import org.openfact.representations.idm.ubl.common.MonetaryTotalRepresentation;
import org.openfact.representations.idm.ubl.common.OrderReferenceRepresentation;
import org.openfact.representations.idm.ubl.common.PartyRepresentation;
import org.openfact.representations.idm.ubl.common.PeriodRepresentation;
import org.openfact.representations.idm.ubl.common.ResponseRepresentation;
import org.openfact.representations.idm.ubl.common.SignatureRepresentation;
import org.openfact.representations.idm.ubl.common.SupplierPartyRepresentation;
import org.openfact.representations.idm.ubl.common.TaxTotalRepresentation;
import org.openfact.representations.idm.ubl.common.UBLExtensionsRepresentation;

public class CreditNoteRepresentation {
    private UBLExtensionsRepresentation UBLExtensions;
    private String UBLVersionID;
    private String customizationID;
    private String profileID;
    private String idUbl;
    private boolean copyIndicator;
    private String UUID;
    private LocalDate issueDate;
    private LocalTime issueTime;
    private LocalDate taxPointDate;
    private List<String> note;
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
    private ExchangeRateRepresentation taxExchangeRate;
    private ExchangeRateRepresentation pricingExchangeRate;
    private ExchangeRateRepresentation paymentExchangeRate;
    private ExchangeRateRepresentation paymentAlternativeExchangeRate;
    private List<AllowanceChargeRepresentation> allowanceCharge;
    private List<TaxTotalRepresentation> taxTotal;
    private MonetaryTotalRepresentation legalMonetaryTotal;
    private List<CreditNoteLineRepresentation> creditNoteLine;
    private String id;

    /**/
    public void addDiscrepancyResponse(ResponseRepresentation representation) {
        if (discrepancyResponse == null) {
            discrepancyResponse = new ArrayList<>();
        }
        discrepancyResponse.add(representation);
    }

    public void addCreditNoteLine(CreditNoteLineRepresentation representation) {
        if (creditNoteLine == null) {
            creditNoteLine = new ArrayList<>();
        }
        creditNoteLine.add(representation);
    }

    public void addTaxTotal(TaxTotalRepresentation representation) {
        if (taxTotal == null) {
            taxTotal = new ArrayList<>();
        }
        taxTotal.add(representation);
    }

    public void addBillingReference(BillingReferenceRepresentation representation) {
        if (billingReference == null) {
            billingReference = new ArrayList<>();
        }
        billingReference.add(representation);
    }

    public void addDespatchDocumentReference(DocumentReferenceRepresentation representation) {
        if (despatchDocumentReference == null) {
            despatchDocumentReference = new ArrayList<>();
        }
        despatchDocumentReference.add(representation);
    }
    /**/

    public LocalDate getTaxPointDate() {
        return this.taxPointDate;
    }

    public void setTaxPointDate(LocalDate taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public String getIdUbl() {
        return this.idUbl;
    }

    public void setIdUbl(String idUbl) {
        this.idUbl = idUbl;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<DocumentReferenceRepresentation> getAdditionalDocumentReference() {
        return this.additionalDocumentReference;
    }

    public void setAdditionalDocumentReference(
            List<DocumentReferenceRepresentation> additionalDocumentReference) {
        this.additionalDocumentReference = additionalDocumentReference;
    }

    public List<DocumentReferenceRepresentation> getContractDocumentReference() {
        return this.contractDocumentReference;
    }

    public void setContractDocumentReference(
            List<DocumentReferenceRepresentation> contractDocumentReference) {
        this.contractDocumentReference = contractDocumentReference;
    }

    public List<String> getNote() {
        return this.note;
    }

    public void setNote(List<String> note) {
        this.note = note;
    }

    public PartyRepresentation getPayeeParty() {
        return this.payeeParty;
    }

    public void setPayeeParty(PartyRepresentation payeeParty) {
        this.payeeParty = payeeParty;
    }

    public String getPricingCurrencyCode() {
        return this.pricingCurrencyCode;
    }

    public void setPricingCurrencyCode(String pricingCurrencyCode) {
        this.pricingCurrencyCode = pricingCurrencyCode;
    }

    public List<DocumentReferenceRepresentation> getDespatchDocumentReference() {
        return this.despatchDocumentReference;
    }

    public void setDespatchDocumentReference(
            List<DocumentReferenceRepresentation> despatchDocumentReference) {
        this.despatchDocumentReference = despatchDocumentReference;
    }

    public String getDocumentCurrencyCode() {
        return this.documentCurrencyCode;
    }

    public void setDocumentCurrencyCode(String documentCurrencyCode) {
        this.documentCurrencyCode = documentCurrencyCode;
    }

    public String getTaxCurrencyCode() {
        return this.taxCurrencyCode;
    }

    public void setTaxCurrencyCode(String taxCurrencyCode) {
        this.taxCurrencyCode = taxCurrencyCode;
    }

    public String getPaymentCurrencyCode() {
        return this.paymentCurrencyCode;
    }

    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }

    public MonetaryTotalRepresentation getLegalMonetaryTotal() {
        return this.legalMonetaryTotal;
    }

    public void setLegalMonetaryTotal(MonetaryTotalRepresentation legalMonetaryTotal) {
        this.legalMonetaryTotal = legalMonetaryTotal;
    }

    public String getAccountingCostCode() {
        return this.accountingCostCode;
    }

    public void setAccountingCostCode(String accountingCostCode) {
        this.accountingCostCode = accountingCostCode;
    }

    public ExchangeRateRepresentation getPricingExchangeRate() {
        return this.pricingExchangeRate;
    }

    public void setPricingExchangeRate(ExchangeRateRepresentation pricingExchangeRate) {
        this.pricingExchangeRate = pricingExchangeRate;
    }

    public String getAccountingCost() {
        return this.accountingCost;
    }

    public void setAccountingCost(String accountingCost) {
        this.accountingCost = accountingCost;
    }

    public List<BillingReferenceRepresentation> getBillingReference() {
        return this.billingReference;
    }

    public void setBillingReference(List<BillingReferenceRepresentation> billingReference) {
        this.billingReference = billingReference;
    }

    public List<AllowanceChargeRepresentation> getAllowanceCharge() {
        return this.allowanceCharge;
    }

    public void setAllowanceCharge(List<AllowanceChargeRepresentation> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    public LocalTime getIssueTime() {
        return this.issueTime;
    }

    public void setIssueTime(LocalTime issueTime) {
        this.issueTime = issueTime;
    }

    public OrderReferenceRepresentation getOrderReference() {
        return this.orderReference;
    }

    public void setOrderReference(OrderReferenceRepresentation orderReference) {
        this.orderReference = orderReference;
    }

    public ExchangeRateRepresentation getPaymentExchangeRate() {
        return this.paymentExchangeRate;
    }

    public void setPaymentExchangeRate(ExchangeRateRepresentation paymentExchangeRate) {
        this.paymentExchangeRate = paymentExchangeRate;
    }

    public PartyRepresentation getTaxRepresentativeParty() {
        return this.taxRepresentativeParty;
    }

    public void setTaxRepresentativeParty(PartyRepresentation taxRepresentativeParty) {
        this.taxRepresentativeParty = taxRepresentativeParty;
    }

    public ExchangeRateRepresentation getTaxExchangeRate() {
        return this.taxExchangeRate;
    }

    public void setTaxExchangeRate(ExchangeRateRepresentation taxExchangeRate) {
        this.taxExchangeRate = taxExchangeRate;
    }

    public String getUBLVersionID() {
        return this.UBLVersionID;
    }

    public void setUBLVersionID(String UBLVersionID) {
        this.UBLVersionID = UBLVersionID;
    }

    public List<TaxTotalRepresentation> getTaxTotal() {
        return this.taxTotal;
    }

    public void setTaxTotal(List<TaxTotalRepresentation> taxTotal) {
        this.taxTotal = taxTotal;
    }

    public List<PeriodRepresentation> getInvoicePeriod() {
        return this.invoicePeriod;
    }

    public void setInvoicePeriod(List<PeriodRepresentation> invoicePeriod) {
        this.invoicePeriod = invoicePeriod;
    }

    public List<CreditNoteLineRepresentation> getCreditNoteLine() {
        return this.creditNoteLine;
    }

    public void setCreditNoteLine(List<CreditNoteLineRepresentation> creditNoteLine) {
        this.creditNoteLine = creditNoteLine;
    }

    public BigDecimal getLineCountNumeric() {
        return this.lineCountNumeric;
    }

    public void setLineCountNumeric(BigDecimal lineCountNumeric) {
        this.lineCountNumeric = lineCountNumeric;
    }

    public String getPaymentAlternativeCurrencyCode() {
        return this.paymentAlternativeCurrencyCode;
    }

    public void setPaymentAlternativeCurrencyCode(String paymentAlternativeCurrencyCode) {
        this.paymentAlternativeCurrencyCode = paymentAlternativeCurrencyCode;
    }

    public List<ResponseRepresentation> getDiscrepancyResponse() {
        return this.discrepancyResponse;
    }

    public void setDiscrepancyResponse(List<ResponseRepresentation> discrepancyResponse) {
        this.discrepancyResponse = discrepancyResponse;
    }

    public UBLExtensionsRepresentation getUBLExtensions() {
        return this.UBLExtensions;
    }

    public void setUBLExtensions(UBLExtensionsRepresentation UBLExtensions) {
        this.UBLExtensions = UBLExtensions;
    }

    public String getProfileID() {
        return this.profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public ExchangeRateRepresentation getPaymentAlternativeExchangeRate() {
        return this.paymentAlternativeExchangeRate;
    }

    public void setPaymentAlternativeExchangeRate(ExchangeRateRepresentation paymentAlternativeExchangeRate) {
        this.paymentAlternativeExchangeRate = paymentAlternativeExchangeRate;
    }

    public CustomerPartyRepresentation getAccountingCustomerParty() {
        return this.accountingCustomerParty;
    }

    public void setAccountingCustomerParty(CustomerPartyRepresentation accountingCustomerParty) {
        this.accountingCustomerParty = accountingCustomerParty;
    }

    public String getUUID() {
        return this.UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public SupplierPartyRepresentation getAccountingSupplierParty() {
        return this.accountingSupplierParty;
    }

    public void setAccountingSupplierParty(SupplierPartyRepresentation accountingSupplierParty) {
        this.accountingSupplierParty = accountingSupplierParty;
    }

    public List<SignatureRepresentation> getSignature() {
        return this.signature;
    }

    public void setSignature(List<SignatureRepresentation> signature) {
        this.signature = signature;
    }

    public LocalDate getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getCustomizationID() {
        return this.customizationID;
    }

    public void setCustomizationID(String customizationID) {
        this.customizationID = customizationID;
    }

    public boolean getCopyIndicator() {
        return this.copyIndicator;
    }

    public void setCopyIndicator(boolean copyIndicator) {
        this.copyIndicator = copyIndicator;
    }

    public List<DocumentReferenceRepresentation> getReceiptDocumentReference() {
        return this.receiptDocumentReference;
    }

    public void setReceiptDocumentReference(List<DocumentReferenceRepresentation> receiptDocumentReference) {
        this.receiptDocumentReference = receiptDocumentReference;
    }
}