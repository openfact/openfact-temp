//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.ubl.common;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.openfact.models.ubl.common.AllowanceChargeType;
import org.openfact.models.ubl.common.ChargeableWeightMeasureType;
import org.openfact.models.ubl.common.ContractType;
import org.openfact.models.ubl.common.CountryType;
import org.openfact.models.ubl.common.DeclaredCustomsValueAmountType;
import org.openfact.models.ubl.common.DeliveryTermsType;
import org.openfact.models.ubl.common.GrossVolumeMeasureType;
import org.openfact.models.ubl.common.GrossWeightMeasureType;
import org.openfact.models.ubl.common.HazardousRiskIndicatorType;
import org.openfact.models.ubl.common.IDType;
import org.openfact.models.ubl.common.InsurancePremiumAmountType;
import org.openfact.models.ubl.common.LoadingLengthMeasureType;
import org.openfact.models.ubl.common.NetNetWeightMeasureType;
import org.openfact.models.ubl.common.NetVolumeMeasureType;
import org.openfact.models.ubl.common.NetWeightMeasureType;
import org.openfact.models.ubl.common.PartyType;
import org.openfact.models.ubl.common.PaymentTermsType;
import org.openfact.models.ubl.common.RemarksType;
import org.openfact.models.ubl.common.SummaryDescriptionType;
import org.openfact.models.ubl.common.TariffCodeType;
import org.openfact.models.ubl.common.TariffDescriptionType;
import org.openfact.models.ubl.common.TotalInvoiceAmountType;
import org.openfact.models.ubl.common.TransportationServiceType;

public class ConsignmentType {

    protected IDType ID;
    protected List<SummaryDescriptionType> summaryDescription;
    protected TotalInvoiceAmountType totalInvoiceAmount;
    protected DeclaredCustomsValueAmountType declaredCustomsValueAmount;
    protected List<TariffDescriptionType> tariffDescription;
    protected TariffCodeType tariffCode;
    protected InsurancePremiumAmountType insurancePremiumAmount;
    protected GrossWeightMeasureType grossWeightMeasure;
    protected NetWeightMeasureType netWeightMeasure;
    protected NetNetWeightMeasureType netNetWeightMeasure;
    protected ChargeableWeightMeasureType chargeableWeightMeasure;
    protected GrossVolumeMeasureType grossVolumeMeasure;
    protected NetVolumeMeasureType netVolumeMeasure;
    protected LoadingLengthMeasureType loadingLengthMeasure;
    protected List<RemarksType> remarks;
    protected HazardousRiskIndicatorType hazardousRiskIndicator;
    protected PartyType consigneeParty;
    protected PartyType exporterParty;
    protected PartyType consignorParty;
    protected PartyType importerParty;
    protected PartyType carrierParty;
    protected PartyType freightForwarderParty;
    protected PartyType notifyParty;
    protected PartyType originalDespatchParty;
    protected PartyType finalDeliveryParty;
    protected CountryType originalDepartureCountry;
    protected CountryType finalDestinationCountry;
    protected List<CountryType> transitCountry;
    protected ContractType transportContract;
    protected TransportationServiceType originalDespatchTransportationService;
    protected TransportationServiceType finalDeliveryTransportationService;
    protected DeliveryTermsType deliveryTerms;
    protected PaymentTermsType paymentTerms;
    protected List<AllowanceChargeType> freightAllowanceCharge;
    protected String id;

    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    public List<SummaryDescriptionType> getSummaryDescription() {
        if (summaryDescription == null) {
            summaryDescription = new ArrayList<SummaryDescriptionType>();
        }
        return this.summaryDescription;
    }

    public void setSummaryDescription(List<SummaryDescriptionType> summaryDescription) {
        this.summaryDescription = summaryDescription;
    }

    public TotalInvoiceAmountType getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    public void setTotalInvoiceAmount(TotalInvoiceAmountType value) {
        this.totalInvoiceAmount = value;
    }

    public DeclaredCustomsValueAmountType getDeclaredCustomsValueAmount() {
        return declaredCustomsValueAmount;
    }

    public void setDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType value) {
        this.declaredCustomsValueAmount = value;
    }

    public List<TariffDescriptionType> getTariffDescription() {
        if (tariffDescription == null) {
            tariffDescription = new ArrayList<TariffDescriptionType>();
        }
        return this.tariffDescription;
    }

    public void setTariffDescription(List<TariffDescriptionType> tariffDescription) {
        this.tariffDescription = tariffDescription;
    }

    public TariffCodeType getTariffCode() {
        return tariffCode;
    }

    public void setTariffCode(TariffCodeType value) {
        this.tariffCode = value;
    }

    public InsurancePremiumAmountType getInsurancePremiumAmount() {
        return insurancePremiumAmount;
    }

    public void setInsurancePremiumAmount(InsurancePremiumAmountType value) {
        this.insurancePremiumAmount = value;
    }

    public GrossWeightMeasureType getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    public void setGrossWeightMeasure(GrossWeightMeasureType value) {
        this.grossWeightMeasure = value;
    }

    public NetWeightMeasureType getNetWeightMeasure() {
        return netWeightMeasure;
    }

    public void setNetWeightMeasure(NetWeightMeasureType value) {
        this.netWeightMeasure = value;
    }

    public NetNetWeightMeasureType getNetNetWeightMeasure() {
        return netNetWeightMeasure;
    }

    public void setNetNetWeightMeasure(NetNetWeightMeasureType value) {
        this.netNetWeightMeasure = value;
    }

    public ChargeableWeightMeasureType getChargeableWeightMeasure() {
        return chargeableWeightMeasure;
    }

    public void setChargeableWeightMeasure(ChargeableWeightMeasureType value) {
        this.chargeableWeightMeasure = value;
    }

    public GrossVolumeMeasureType getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    public void setGrossVolumeMeasure(GrossVolumeMeasureType value) {
        this.grossVolumeMeasure = value;
    }

    public NetVolumeMeasureType getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    public void setNetVolumeMeasure(NetVolumeMeasureType value) {
        this.netVolumeMeasure = value;
    }

    public LoadingLengthMeasureType getLoadingLengthMeasure() {
        return loadingLengthMeasure;
    }

    public void setLoadingLengthMeasure(LoadingLengthMeasureType value) {
        this.loadingLengthMeasure = value;
    }

    public List<RemarksType> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<RemarksType>();
        }
        return this.remarks;
    }

    public void setRemarks(List<RemarksType> remarks) {
        this.remarks = remarks;
    }

    public HazardousRiskIndicatorType getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    public void setHazardousRiskIndicator(HazardousRiskIndicatorType value) {
        this.hazardousRiskIndicator = value;
    }

    public PartyType getConsigneeParty() {
        return consigneeParty;
    }

    public void setConsigneeParty(PartyType value) {
        this.consigneeParty = value;
    }

    public PartyType getExporterParty() {
        return exporterParty;
    }

    public void setExporterParty(PartyType value) {
        this.exporterParty = value;
    }

    public PartyType getConsignorParty() {
        return consignorParty;
    }

    public void setConsignorParty(PartyType value) {
        this.consignorParty = value;
    }

    public PartyType getImporterParty() {
        return importerParty;
    }

    public void setImporterParty(PartyType value) {
        this.importerParty = value;
    }

    public PartyType getCarrierParty() {
        return carrierParty;
    }

    public void setCarrierParty(PartyType value) {
        this.carrierParty = value;
    }

    public PartyType getFreightForwarderParty() {
        return freightForwarderParty;
    }

    public void setFreightForwarderParty(PartyType value) {
        this.freightForwarderParty = value;
    }

    public PartyType getNotifyParty() {
        return notifyParty;
    }

    public void setNotifyParty(PartyType value) {
        this.notifyParty = value;
    }

    public PartyType getOriginalDespatchParty() {
        return originalDespatchParty;
    }

    public void setOriginalDespatchParty(PartyType value) {
        this.originalDespatchParty = value;
    }

    public PartyType getFinalDeliveryParty() {
        return finalDeliveryParty;
    }

    public void setFinalDeliveryParty(PartyType value) {
        this.finalDeliveryParty = value;
    }

    public CountryType getOriginalDepartureCountry() {
        return originalDepartureCountry;
    }

    public void setOriginalDepartureCountry(CountryType value) {
        this.originalDepartureCountry = value;
    }

    public CountryType getFinalDestinationCountry() {
        return finalDestinationCountry;
    }

    public void setFinalDestinationCountry(CountryType value) {
        this.finalDestinationCountry = value;
    }

    public List<CountryType> getTransitCountry() {
        if (transitCountry == null) {
            transitCountry = new ArrayList<CountryType>();
        }
        return this.transitCountry;
    }

    public void setTransitCountry(List<CountryType> transitCountry) {
        this.transitCountry = transitCountry;
    }

    public ContractType getTransportContract() {
        return transportContract;
    }

    public void setTransportContract(ContractType value) {
        this.transportContract = value;
    }

    public TransportationServiceType getOriginalDespatchTransportationService() {
        return originalDespatchTransportationService;
    }

    public void setOriginalDespatchTransportationService(TransportationServiceType value) {
        this.originalDespatchTransportationService = value;
    }

    public TransportationServiceType getFinalDeliveryTransportationService() {
        return finalDeliveryTransportationService;
    }

    public void setFinalDeliveryTransportationService(TransportationServiceType value) {
        this.finalDeliveryTransportationService = value;
    }

    public DeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    public void setDeliveryTerms(DeliveryTermsType value) {
        this.deliveryTerms = value;
    }

    public PaymentTermsType getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(PaymentTermsType value) {
        this.paymentTerms = value;
    }

    public List<AllowanceChargeType> getFreightAllowanceCharge() {
        if (freightAllowanceCharge == null) {
            freightAllowanceCharge = new ArrayList<AllowanceChargeType>();
        }
        return this.freightAllowanceCharge;
    }

    public void setFreightAllowanceCharge(List<AllowanceChargeType> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}