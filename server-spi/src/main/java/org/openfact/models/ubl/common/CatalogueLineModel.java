package org.openfact.models.ubl.common;

import java.math.BigDecimal;
import java.util.List;

public interface CatalogueLineModel {

    String getID();

    void setID(String value);

    String getActionCode();

    void setActionCode(String value);

    String getLifeCycleStatusCode();

    void setLifeCycleStatusCode(String value);

    String getContractSubdivision();

    void setContractSubdivision(String value);

    List<String> getNote();

    void setNote(List<String> note);

    boolean getOrderableIndicator();

    void setOrderableIndicator(boolean value);

    String getOrderableUnit();

    void setOrderableUnit(String value);

    QuantityModel getContentUnitQuantity();

    void setContentUnitQuantity(QuantityModel value);

    BigDecimal getOrderQuantityIncrementNumeric();

    void setOrderQuantityIncrementNumeric(BigDecimal value);

    QuantityModel getMinimumOrderQuantity();

    void setMinimumOrderQuantity(QuantityModel value);

    QuantityModel getMaximumOrderQuantity();

    void setMaximumOrderQuantity(QuantityModel value);

    List<String> getWarrantyInformation();

    void setWarrantyInformation(List<String> warrantyInformation);

    String getPackLevelCode();

    void setPackLevelCode(String value);

    CustomerPartyModel getContractorCustomerParty();

    void setContractorCustomerParty(CustomerPartyModel value);

    SupplierPartyModel getSellerSupplierParty();

    void setSellerSupplierParty(SupplierPartyModel value);

    PartyModel getWarrantyParty();

    void setWarrantyParty(PartyModel value);

    PeriodModel getWarrantyValidityPeriod();

    void setWarrantyValidityPeriod(PeriodModel value);

    PeriodModel getLineValidityPeriod();

    void setLineValidityPeriod(PeriodModel value);

    List<ItemComparisonModel> getItemComparison();

    void setItemComparison(List<ItemComparisonModel> itemComparison);

    List<RelatedItemModel> getComponentRelatedItem();

    void setComponentRelatedItem(List<RelatedItemModel> componentRelatedItem);

    List<RelatedItemModel> getAccessoryRelatedItem();

    void setAccessoryRelatedItem(List<RelatedItemModel> accessoryRelatedItem);

    List<RelatedItemModel> getRequiredRelatedItem();

    void setRequiredRelatedItem(List<RelatedItemModel> requiredRelatedItem);

    List<RelatedItemModel> getReplacementRelatedItem();

    void setReplacementRelatedItem(List<RelatedItemModel> replacementRelatedItem);

    List<RelatedItemModel> getComplementaryRelatedItem();

    void setComplementaryRelatedItem(List<RelatedItemModel> complementaryRelatedItem);

    List<ItemLocationQuantityModel> getRequiredItemLocationQuantity();

    void setRequiredItemLocationQuantity(List<ItemLocationQuantityModel> requiredItemLocationQuantity);

    List<DocumentReferenceModel> getDocumentReference();

    void setDocumentReference(List<DocumentReferenceModel> documentReference);

    ItemModel getItem();

    void setItem(ItemModel value);

    String getId();

    

}
