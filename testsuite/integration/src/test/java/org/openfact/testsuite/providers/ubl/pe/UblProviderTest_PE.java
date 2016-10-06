package org.openfact.testsuite.providers.ubl.pe;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import org.w3c.dom.Element;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.transform.dom.DOMResult;

import org.junit.Test;
import org.openfact.models.OrganizationModel;
import org.openfact.models.OrganizationProvider;
import org.openfact.models.ubl.CreditNoteModel;
import org.openfact.models.ubl.DebitNoteModel;
import org.openfact.models.ubl.InvoiceModel;
import org.openfact.models.ubl.common.AddressModel;
import org.openfact.models.ubl.common.AttachmentModel;
import org.openfact.models.ubl.common.CreditNoteLineModel;
import org.openfact.models.ubl.common.CustomerPartyModel;
import org.openfact.models.ubl.common.DebitNoteLineModel;
import org.openfact.models.ubl.common.ExtensionContentModel;
import org.openfact.models.ubl.common.ExternalReferenceModel;
import org.openfact.models.ubl.common.InvoiceLineModel;
import org.openfact.models.ubl.common.ItemIdentificationModel;
import org.openfact.models.ubl.common.ItemModel;
import org.openfact.models.ubl.common.MonetaryTotalModel;
import org.openfact.models.ubl.common.PartyLegalModel;
import org.openfact.models.ubl.common.PartyModel;
import org.openfact.models.ubl.common.PriceModel;
import org.openfact.models.ubl.common.PricingReferenceModel;
import org.openfact.models.ubl.common.QuantityModel;
import org.openfact.models.ubl.common.ResponseModel;
import org.openfact.models.ubl.common.SignatureModel;
import org.openfact.models.ubl.common.SupplierPartyModel;
import org.openfact.models.ubl.common.TaxCategoryModel;
import org.openfact.models.ubl.common.TaxSchemeModel;
import org.openfact.models.ubl.common.TaxSubtotalModel;
import org.openfact.models.ubl.common.TaxTotalModel;
import org.openfact.models.ubl.common.UBLExtensionModel;
import org.openfact.models.ubl.common.UBLExtensionsModel;
import org.openfact.models.utils.UblSignature;
import org.openfact.testsuite.providers.AbstractProviderTest;
import org.openfact.ubl.UblProvider;
import org.openfact.ubl.pe.extensions.AdditionalInformationTypeSunatAgg;
import org.openfact.ubl.pe.extensions.AdditionalMonetaryTotalType;
import org.openfact.ubl.pe.extensions.InvoiceFactory;
import org.w3c.dom.Document;

import com.helger.commons.error.list.IErrorList;
import com.helger.ubl21.UBL21Reader;
import com.helger.ubl21.UBL21Validator;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.PayableAmountType;
import oasis.names.specification.ubl.schema.xsd.creditnote_21.CreditNoteType;
import oasis.names.specification.ubl.schema.xsd.debitnote_21.DebitNoteType;
import oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType;

public class UblProviderTest_PE extends AbstractProviderTest {

    protected OrganizationModel organization;

    public void createOrganization() {
        OrganizationProvider provider = session.organizations();
        organization = provider.createOrganization("SISTCOOP");
        commit();
    }

    @Test
    public void getInvoiceDocument() throws Exception {
        createOrganization();

        InvoiceModel invoice = session.invoices().addInvoice(organization, "F001-0001");
        invoice.setUBLVersionID("2.0");
        invoice.setCustomizationID("1.0");

        invoice.setID("F001-0001");
        invoice.setIssueDate(LocalDate.now());
        invoice.setInvoiceTypeCode("01");
        invoice.setDocumentCurrencyCode("PEN");

        // signature
        SignatureModel signature = invoice.addSignature();
        signature.setID("IDSignOlva");

        PartyModel partySignature = signature.getSignatoryParty();
        partySignature.getPartyIdentification().add("20494637074");
        partySignature.getPartyName().add("AHREN CONTRATISTAS GENERALES S.A.C");

        AttachmentModel attachment = signature.getDigitalSignatureAttachment();

        ExternalReferenceModel externalReference = attachment.getExternalReference();
        externalReference.setURI("#SignatureOlva");

        // SupplierParty
        SupplierPartyModel supplierParty = invoice.getAccountingSupplierParty();
        supplierParty.setCustomerAssignedAccountID("20494637074");
        supplierParty.getAdditionalAccountID().add("6");

        PartyModel partySupplier = supplierParty.getParty();

        AddressModel address = partySupplier.getPostalAddress();
        address.setID("050101");
        address.setStreetName("MZA. A LOTE. 3");
        address.setCitySubdivisionName("ASOC. SANTA TERESA");
        address.setCityName("AYACUCHO");
        address.setCountrySubentity("HUAMANGA");
        address.setDistrict("AYACUCHO");
        address.getCountry().setIdentificationCode("PE");

        PartyLegalModel partyLegalSupplier = partySupplier.addPartyLegalEntity();
        partyLegalSupplier.setRegistrationName("SISTCOOP S.A.C");

        // CustomerParty
        CustomerPartyModel customerParty = invoice.getAccountingCustomerParty();
        customerParty.setCustomerAssignedAccountID("20407446497");
        customerParty.getAdditionalAccountID().add("6");

        PartyModel partyCustomer = customerParty.getParty();

        PartyLegalModel partyLegalCustomer = partyCustomer.addPartyLegalEntity();
        partyLegalCustomer.setRegistrationName("AHREN CONTRATISTAS");

        // TaxTotal
        TaxTotalModel taxTotalInvoice = invoice.addTaxTotal();
        taxTotalInvoice.setTaxAmount(new BigDecimal("62675.85"));

        TaxSubtotalModel taxSubtotalInvoice = taxTotalInvoice.addTaxSubtotal();
        taxSubtotalInvoice.setTaxAmount(new BigDecimal("62675.85"));

        TaxCategoryModel taxCategoryInvoice = taxSubtotalInvoice.getTaxCategory();

        TaxSchemeModel taxSchemeInvoice = taxCategoryInvoice.getTaxScheme();
        taxSchemeInvoice.setID("1000");
        taxSchemeInvoice.setName("IGV");
        taxSchemeInvoice.setTaxTypeCode("VAT");

        // LegalMonetaryTotal
        MonetaryTotalModel monetaryTotal = invoice.getLegalMonetaryTotal();
        monetaryTotal.setPayableAmount(new BigDecimal("423225.00"));

        // InvoiceLine
        InvoiceLineModel invoiceLine = invoice.addInvoiceLine();
        invoiceLine.setID("1");

        QuantityModel quantity = invoiceLine.getInvoicedQuantity();
        quantity.setUnitCode("NIU");
        quantity.setValue(new BigDecimal("2000"));

        invoiceLine.setLineExtensionAmount(new BigDecimal("149491.53"));

        PricingReferenceModel pricingReference = invoiceLine.getPricingReference();

        PriceModel price = pricingReference.addAlternativeConditionPrice();
        price.setPriceAmount(new BigDecimal("98.00"));
        price.setPriceTypeCode("01");

        TaxTotalModel taxTotalInvoiceLine = invoiceLine.addTaxTotal();
        taxTotalInvoiceLine.setTaxAmount(new BigDecimal("26908.47"));

        TaxSubtotalModel taxSubtotalInvoiceLine = taxTotalInvoiceLine.addTaxSubtotal();
        taxSubtotalInvoiceLine.setTaxAmount(new BigDecimal("26908.47"));

        TaxCategoryModel taxCategoryInvoiceLine = taxSubtotalInvoiceLine.getTaxCategory();
        taxCategoryInvoiceLine.setTaxExemptionReasonCode("10");

        TaxSchemeModel taxSchemeInvoiceLine = taxCategoryInvoiceLine.getTaxScheme();
        taxSchemeInvoiceLine.setID("1000");
        taxSchemeInvoiceLine.setName("IGV");
        taxSchemeInvoiceLine.setTaxTypeCode("VAT");

        ItemModel item = invoiceLine.getItem();
        item.getDescription().add("Grabadora LG Externo Modelo: GE20LU10");

        ItemIdentificationModel itemIdentification = item.getSellersItemIdentification();
        itemIdentification.setID("GLG199");
        invoiceLine.getPrice().setPriceAmount(new BigDecimal("83.05"));

        // add extension content type
        UBLExtensionsModel ublExtensions = invoice.getUBLExtensions();
        UBLExtensionModel ublExtension = ublExtensions.addUblExtension();
        ExtensionContentModel extensionContent = ublExtension.getExtensionContent();
        
        // additional information sunat
        AdditionalInformationTypeSunatAgg additionalInformation = new AdditionalInformationTypeSunatAgg();
        IDType idAMonetaryTotal = new IDType();
        idAMonetaryTotal.setValue("1000");
        PayableAmountType pa = new PayableAmountType();
        pa.setCurrencyID("PEN");
        pa.setValue(new BigDecimal(348199.15));
        AdditionalMonetaryTotalType amtt = new AdditionalMonetaryTotalType();
        amtt.setID(idAMonetaryTotal);
        amtt.setPayableAmount(pa);
        additionalInformation.getAdditionalMonetaryTotal().add(amtt);

        IDType idAMonetaryTotal1 = new IDType();
        idAMonetaryTotal1.setValue("2000");
        PayableAmountType pa1 = new PayableAmountType();
        pa1.setCurrencyID("PEN");
        pa1.setValue(new BigDecimal(12350.00));
        AdditionalMonetaryTotalType amtt1 = new AdditionalMonetaryTotalType();
        amtt1.setID(idAMonetaryTotal1);
        amtt1.setPayableAmount(pa1);
        additionalInformation.getAdditionalMonetaryTotal().add(amtt1);

        InvoiceFactory factory = new InvoiceFactory();
        JAXBContext context = JAXBContext.newInstance(InvoiceFactory.class);
        Marshaller marshallerElement = context.createMarshaller();

        JAXBElement<AdditionalInformationTypeSunatAgg> jeAits = factory.createAdditionalInformation(additionalInformation);
        DOMResult res = new DOMResult();
        marshallerElement.marshal(jeAits, res);
        Element elem = ((Document) res.getNode()).getDocumentElement();

        extensionContent.setAny(elem);

        UBLExtensionsModel e1 = invoice.getUBLExtensions();
        UBLExtensionModel ee1 = e1.addUblExtension();
        ExtensionContentModel cc1 = ee1.getExtensionContent();
        Document document = UblSignature.ublSignatureGenerate(organization);
        Element element = document.getDocumentElement();
        cc1.setAny(element);
        
        commit();

        Set<UblProvider> providers = session.getAllProviders(UblProvider.class);
        for (UblProvider provider : providers) {
            Document xml = provider.getDocument(organization, invoice);
            InvoiceType invoiceType = UBL21Reader.invoice().read(xml);
            IErrorList resourceErrorGroup = UBL21Validator.invoice().validate(invoiceType);

            assertThat(xml, is(notNullValue()));
            assertThat(resourceErrorGroup.getAllErrors().getSize(), is(0));
        }
    }

    @Test
    public void getCreditNoteDocument() throws Exception {
        createOrganization();

        CreditNoteModel creditNote = session.creditNotes().addCreditNote(organization, "C001-0001");
        creditNote.setUBLVersionID("2.0");
        creditNote.setCustomizationID("1.0");

        creditNote.setID("F001-0001");
        creditNote.setIssueDate(LocalDate.now());
        creditNote.setDocumentCurrencyCode("PEN");

        // signature
        SignatureModel signature = creditNote.addSignature();
        signature.setID("IDSignOlva");

        PartyModel partySignature = signature.getSignatoryParty();
        partySignature.getPartyIdentification().add("20494637074");
        partySignature.getPartyName().add("AHREN CONTRATISTAS GENERALES S.A.C");

        AttachmentModel attachment = signature.getDigitalSignatureAttachment();

        ExternalReferenceModel externalReference = attachment.getExternalReference();
        externalReference.setURI("#SignatureOlva");

        // DiscrepancyResponse
        ResponseModel discrepancyResponse = creditNote.addDiscrepancyResponse();
        discrepancyResponse.setReferenceID("F001-0001");
        discrepancyResponse.setResponseCode("01");
        discrepancyResponse.getDescription().add("No tengo motivos");

        // SupplierParty
        SupplierPartyModel supplierParty = creditNote.getAccountingSupplierParty();
        supplierParty.setCustomerAssignedAccountID("20494637074");
        supplierParty.getAdditionalAccountID().add("6");

        PartyModel partySupplier = supplierParty.getParty();

        AddressModel address = partySupplier.getPostalAddress();
        address.setID("050101");
        address.setStreetName("MZA. A LOTE. 3");
        address.setCitySubdivisionName("ASOC. SANTA TERESA");
        address.setCityName("AYACUCHO");
        address.setCountrySubentity("HUAMANGA");
        address.setDistrict("AYACUCHO");
        address.getCountry().setIdentificationCode("PE");

        PartyLegalModel partyLegalSupplier = partySupplier.addPartyLegalEntity();
        partyLegalSupplier.setRegistrationName("SISTCOOP S.A.C");

        // CustomerParty
        CustomerPartyModel customerParty = creditNote.getAccountingCustomerParty();
        customerParty.setCustomerAssignedAccountID("20407446497");
        customerParty.getAdditionalAccountID().add("6");

        PartyModel partyCustomer = customerParty.getParty();

        PartyLegalModel partyLegalCustomer = partyCustomer.addPartyLegalEntity();
        partyLegalCustomer.setRegistrationName("AHREN CONTRATISTAS");

        // TaxTotal
        TaxTotalModel taxTotalCreditNote = creditNote.addTaxTotal();
        taxTotalCreditNote.setTaxAmount(new BigDecimal("62675.85"));

        TaxSubtotalModel taxSubtotalCreditNote = taxTotalCreditNote.addTaxSubtotal();
        taxSubtotalCreditNote.setTaxAmount(new BigDecimal("62675.85"));

        TaxCategoryModel taxCategoryCreditNote = taxSubtotalCreditNote.getTaxCategory();

        TaxSchemeModel taxSchemeCreditNote = taxCategoryCreditNote.getTaxScheme();
        taxSchemeCreditNote.setID("1000");
        taxSchemeCreditNote.setName("IGV");
        taxSchemeCreditNote.setTaxTypeCode("VAT");

        // LegalMonetaryTotal
        MonetaryTotalModel monetaryTotal = creditNote.getLegalMonetaryTotal();
        monetaryTotal.setPayableAmount(new BigDecimal("16523.00"));
        monetaryTotal.setChargeTotalAmount(new BigDecimal("423225.00"));

        // CreditNoteLine
        CreditNoteLineModel invoiceLine = creditNote.addCreditNoteLine();
        invoiceLine.setID("1");

        QuantityModel quantity = invoiceLine.getCreditedQuantity();
        quantity.setUnitCode("NIU");
        quantity.setValue(new BigDecimal("2000"));

        invoiceLine.setLineExtensionAmount(new BigDecimal("149491.53"));

        PricingReferenceModel pricingReference = invoiceLine.getPricingReference();

        PriceModel price = pricingReference.addAlternativeConditionPrice();
        price.setPriceAmount(new BigDecimal("98.00"));
        price.setPriceTypeCode("01");

        TaxTotalModel taxTotalCreditNoteLine = invoiceLine.addTaxTotal();
        taxTotalCreditNoteLine.setTaxAmount(new BigDecimal("26908.47"));

        TaxSubtotalModel taxSubtotalCreditNoteLine = taxTotalCreditNoteLine.addTaxSubtotal();
        taxSubtotalCreditNoteLine.setTaxAmount(new BigDecimal("26908.47"));

        TaxCategoryModel taxCategoryCreditNoteLine = taxSubtotalCreditNoteLine.getTaxCategory();
        taxCategoryCreditNoteLine.setTaxExemptionReasonCode("10");

        TaxSchemeModel taxSchemeCreditNoteLine = taxCategoryCreditNoteLine.getTaxScheme();
        taxSchemeCreditNoteLine.setID("1000");
        taxSchemeCreditNoteLine.setName("IGV");
        taxSchemeCreditNoteLine.setTaxTypeCode("VAT");

        ItemModel item = invoiceLine.getItem();
        item.getDescription().add("Grabadora LG Externo Modelo: GE20LU10");        

        ItemIdentificationModel itemIdentification = item.getSellersItemIdentification();
        itemIdentification.setID("GLG199");
        invoiceLine.getPrice().setPriceAmount(new BigDecimal("83.05"));

        commit();

        Set<UblProvider> providers = session.getAllProviders(UblProvider.class);
        for (UblProvider provider : providers) {
            Document xml = provider.getDocument(organization, creditNote);
            CreditNoteType creditNoteType = UBL21Reader.creditNote().read(xml);
            IErrorList resourceErrorGroup = UBL21Validator.creditNote().validate(creditNoteType);

            assertThat(xml, is(notNullValue()));
            assertThat(resourceErrorGroup.getAllErrors().getSize(), is(0));
        }
    }

    @Test
    public void getDebitNoteDocument() throws Exception {
        createOrganization();

        DebitNoteModel debitNote = session.debitNotes().addDebitNote(organization, "C001-0001");
        debitNote.setUBLVersionID("2.0");
        debitNote.setCustomizationID("1.0");

        debitNote.setID("F001-0001");
        debitNote.setIssueDate(LocalDate.now());
        debitNote.setDocumentCurrencyCode("PEN");

        // signature
        SignatureModel signature = debitNote.addSignature();
        signature.setID("IDSignOlva");

        PartyModel partySignature = signature.getSignatoryParty();
        partySignature.getPartyIdentification().add("20494637074");
        partySignature.getPartyName().add("AHREN CONTRATISTAS GENERALES S.A.C");

        AttachmentModel attachment = signature.getDigitalSignatureAttachment();

        ExternalReferenceModel externalReference = attachment.getExternalReference();
        externalReference.setURI("#SignatureOlva");

        // DiscrepancyResponse
        ResponseModel discrepancyResponse = debitNote.addDiscrepancyResponse();
        discrepancyResponse.setReferenceID("F001-0001");
        discrepancyResponse.setResponseCode("01");
        discrepancyResponse.getDescription().add("No tengo motivos");

        // SupplierParty
        SupplierPartyModel supplierParty = debitNote.getAccountingSupplierParty();
        supplierParty.setCustomerAssignedAccountID("20494637074");
        supplierParty.getAdditionalAccountID().add("6");

        PartyModel partySupplier = supplierParty.getParty();

        AddressModel address = partySupplier.getPostalAddress();
        address.setID("050101");
        address.setStreetName("MZA. A LOTE. 3");
        address.setCitySubdivisionName("ASOC. SANTA TERESA");
        address.setCityName("AYACUCHO");
        address.setCountrySubentity("HUAMANGA");
        address.setDistrict("AYACUCHO");
        address.getCountry().setIdentificationCode("PE");

        PartyLegalModel partyLegalSupplier = partySupplier.addPartyLegalEntity();
        partyLegalSupplier.setRegistrationName("SISTCOOP S.A.C");

        // CustomerParty
        CustomerPartyModel customerParty = debitNote.getAccountingCustomerParty();
        customerParty.setCustomerAssignedAccountID("20407446497");
        customerParty.getAdditionalAccountID().add("6");

        PartyModel partyCustomer = customerParty.getParty();

        PartyLegalModel partyLegalCustomer = partyCustomer.addPartyLegalEntity();
        partyLegalCustomer.setRegistrationName("AHREN CONTRATISTAS");

        // TaxTotal
        TaxTotalModel taxTotalDebitNote = debitNote.addTaxTotal();
        taxTotalDebitNote.setTaxAmount(new BigDecimal("62675.85"));

        TaxSubtotalModel taxSubtotalDebitNote = taxTotalDebitNote.addTaxSubtotal();
        taxSubtotalDebitNote.setTaxAmount(new BigDecimal("62675.85"));

        TaxCategoryModel taxCategoryDebitNote = taxSubtotalDebitNote.getTaxCategory();

        TaxSchemeModel taxSchemeDebitNote = taxCategoryDebitNote.getTaxScheme();
        taxSchemeDebitNote.setID("1000");
        taxSchemeDebitNote.setName("IGV");
        taxSchemeDebitNote.setTaxTypeCode("VAT");

        // LegalMonetaryTotal
        //MonetaryTotalModel monetaryTotal = debitNote.getLegalMonetaryTotal();
        //monetaryTotal.setChargeTotalAmount(new BigDecimal("423225.00"));

        // DebitNoteLine
        DebitNoteLineModel invoiceLine = debitNote.addDebitNoteLine();
        invoiceLine.setID("1");

        QuantityModel quantity = invoiceLine.getDebitedQuantity();
        quantity.setUnitCode("NIU");
        quantity.setValue(new BigDecimal("2000"));

        invoiceLine.setLineExtensionAmount(new BigDecimal("149491.53"));

        PricingReferenceModel pricingReference = invoiceLine.getPricingReference();

        PriceModel price = pricingReference.addAlternativeConditionPrice();
        price.setPriceAmount(new BigDecimal("98.00"));
        price.setPriceTypeCode("01");

        TaxTotalModel taxTotalDebitNoteLine = invoiceLine.addTaxTotal();
        taxTotalDebitNoteLine.setTaxAmount(new BigDecimal("26908.47"));

        TaxSubtotalModel taxSubtotalDebitNoteLine = taxTotalDebitNoteLine.addTaxSubtotal();
        taxSubtotalDebitNoteLine.setTaxAmount(new BigDecimal("26908.47"));

        TaxCategoryModel taxCategoryDebitNoteLine = taxSubtotalDebitNoteLine.getTaxCategory();
        taxCategoryDebitNoteLine.setTaxExemptionReasonCode("10");

        TaxSchemeModel taxSchemeDebitNoteLine = taxCategoryDebitNoteLine.getTaxScheme();
        taxSchemeDebitNoteLine.setID("1000");
        taxSchemeDebitNoteLine.setName("IGV");
        taxSchemeDebitNoteLine.setTaxTypeCode("VAT");

        ItemModel item = invoiceLine.getItem();
        item.getDescription().add("Grabadora LG Externo Modelo: GE20LU10");        

        ItemIdentificationModel itemIdentification = item.getSellersItemIdentification();
        itemIdentification.setID("GLG199");
        invoiceLine.getPrice().setPriceAmount(new BigDecimal("83.05"));

        commit();

        Set<UblProvider> providers = session.getAllProviders(UblProvider.class);
        for (UblProvider provider : providers) {
            Document xml = provider.getDocument(organization, debitNote);
            DebitNoteType debitNoteType = UBL21Reader.debitNote().read(xml);
            IErrorList resourceErrorGroup = UBL21Validator.debitNote().validate(debitNoteType);

            assertThat(xml, is(notNullValue()));
            assertThat(resourceErrorGroup.getAllErrors().getSize(), is(0));
        }
    }
    
}