package org.openfact.models.ubl.common;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface CreditNoteLineModel {

    String getID();

    void setID(String value);

    String getUUID();

    void setUUID(String value);

    String getNote();

    void setNote(String value);

    QuantityModel getCreditedQuantity();

    void setCreditedQuantity(QuantityModel value);

    BigDecimal getLineExtensionAmount();

    void setLineExtensionAmount(BigDecimal value);

    LocalDate getTaxPointDate();

    void setTaxPointDate(LocalDate value);

    String getAccountingCostCode();

    void setAccountingCostCode(String value);

    String getAccountingCost();

    void setAccountingCost(String value);

    List<ResponseModel> getDiscrepancyResponse();

    void setDiscrepancyResponse(List<ResponseModel> discrepancyResponse);

    List<LineReferenceModel> getDespatchLineReference();

    void setDespatchLineReference(List<LineReferenceModel> despatchLineReference);

    List<LineReferenceModel> getReceiptLineReference();

    void setReceiptLineReference(List<LineReferenceModel> receiptLineReference);

    List<BillingReferenceModel> getBillingReference();

    void setBillingReference(List<BillingReferenceModel> billingReference);

    List<DocumentReferenceModel> getDocumentReference();

    void setDocumentReference(List<DocumentReferenceModel> documentReference);

    PricingReferenceModel getPricingReference();

    void setPricingReference(PricingReferenceModel value);

    List<DeliveryModel> getDelivery();

    void setDelivery(List<DeliveryModel> delivery);

    List<TaxTotalModel> getTaxTotal();

    void setTaxTotal(List<TaxTotalModel> taxTotal);

    ItemModel getItem();

    void setItem(ItemModel value);

    PriceModel getPrice();

    void setPrice(PriceModel value);

    String getId();

    

    /*
     * **/
    TaxTotalModel addTaxTotal();

}
