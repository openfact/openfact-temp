package org.openfact.models.ubl.common;

import java.math.BigDecimal;
import java.util.List;

public interface ConsignmentModel {

    String getID();

    void setID(String value);

    List<String> getSummaryDescription();

    void setSummaryDescription(List<String> summaryDescription);

    BigDecimal getTotalInvoiceAmount();

    void setTotalInvoiceAmount(BigDecimal value);

    BigDecimal getDeclaredCustomsValueAmount();

    void setDeclaredCustomsValueAmount(BigDecimal value);

    List<String> getTariffDescription();

    void setTariffDescription(List<String> tariffDescription);

    String getTariffCode();

    void setTariffCode(String value);

    BigDecimal getInsurancePremiumAmount();

    void setInsurancePremiumAmount(BigDecimal value);

    MeasureModel getGrossWeightMeasure();

    void setGrossWeightMeasure(MeasureModel value);

    MeasureModel getNetWeightMeasure();

    void setNetWeightMeasure(MeasureModel value);

    MeasureModel getNetNetWeightMeasure();

    void setNetNetWeightMeasure(MeasureModel value);

    MeasureModel getChargeableWeightMeasure();

    void setChargeableWeightMeasure(MeasureModel value);

    MeasureModel getGrossVolumeMeasure();

    void setGrossVolumeMeasure(MeasureModel value);

    MeasureModel getNetVolumeMeasure();

    void setNetVolumeMeasure(MeasureModel value);

    MeasureModel getLoadingLengthMeasure();

    void setLoadingLengthMeasure(MeasureModel value);

    List<String> getRemarks();

    void setRemarks(List<String> remarks);

    boolean getHazardousRiskIndicator();

    void setHazardousRiskIndicator(boolean value);

    PartyModel getConsigneeParty();

    void setConsigneeParty(PartyModel value);

    PartyModel getExporterParty();

    void setExporterParty(PartyModel value);

    PartyModel getConsignorParty();

    void setConsignorParty(PartyModel value);

    PartyModel getImporterParty();

    void setImporterParty(PartyModel value);

    PartyModel getCarrierParty();

    void setCarrierParty(PartyModel value);

    PartyModel getFreightForwarderParty();

    void setFreightForwarderParty(PartyModel value);

    PartyModel getNotifyParty();

    void setNotifyParty(PartyModel value);

    PartyModel getOriginalDespatchParty();

    void setOriginalDespatchParty(PartyModel value);

    PartyModel getFinalDeliveryParty();

    void setFinalDeliveryParty(PartyModel value);

    CountryModel getOriginalDepartureCountry();

    void setOriginalDepartureCountry(CountryModel value);

    CountryModel getFinalDestinationCountry();

    void setFinalDestinationCountry(CountryModel value);

    List<CountryModel> getTransitCountry();

    void setTransitCountry(List<CountryModel> transitCountry);

    ContractModel getTransportContract();

    void setTransportContract(ContractModel value);

    TransportationServiceModel getOriginalDespatchTransportationService();

    void setOriginalDespatchTransportationService(TransportationServiceModel value);

    TransportationServiceModel getFinalDeliveryTransportationService();

    void setFinalDeliveryTransportationService(TransportationServiceModel value);

    DeliveryTermsModel getDeliveryTerms();

    void setDeliveryTerms(DeliveryTermsModel value);

    PaymentTermsModel getPaymentTerms();

    void setPaymentTerms(PaymentTermsModel value);

    List<AllowanceChargeModel> getFreightAllowanceCharge();

    void setFreightAllowanceCharge(List<AllowanceChargeModel> freightAllowanceCharge);

    String getId();

    

}
