package org.openfact.models.ubl.common;

import java.math.BigDecimal;
import java.util.List;

public interface QuotationLineModel {

    String getID();

    void setID(String value);

    String getNote();

    void setNote(String value);

    QuantityModel getQuantity();

    void setQuantity(QuantityModel value);

    BigDecimal getLineExtensionAmount();

    void setLineExtensionAmount(BigDecimal value);

    BigDecimal getTotalTaxAmount();

    void setTotalTaxAmount(BigDecimal value);

    List<DocumentReferenceModel> getDocumentReference();

    void setDocumentReference(List<DocumentReferenceModel> documentReference);

    LineItemModel getLineItem();

    void setLineItem(LineItemModel value);

    List<LineItemModel> getSellerProposedSubstituteLineItem();

    void setSellerProposedSubstituteLineItem(List<LineItemModel> sellerProposedSubstituteLineItem);

    String getId();

    

}
