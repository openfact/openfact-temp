package org.openfact.models.ubl.common;

import java.math.BigDecimal;
import java.util.List;

public interface SummaryDocumentsLineModel {

    String getLineID();

    void setLineID(String value);

    String getDocumentModelCode();

    void setDocumentModelCode(String value);

    String getDocumentSerialID();

    void setDocumentSerialID(String value);

    String getStartDocumentNumberID();

    void setStartDocumentNumberID(String value);

    String getEndDocumentNumberID();

    void setEndDocumentNumberID(String value);

    BigDecimal getTotalAmount();

    void setTotalAmount(BigDecimal value);

    List<PaymentModel> getBillingPayment();

    void setBillingPayment(List<PaymentModel> billingPayment);

    List<AllowanceChargeModel> getAllowanceCharge();

    void setAllowanceCharge(List<AllowanceChargeModel> allowanceCharge);

    List<TaxTotalModel> getTaxTotal();

    void setTaxTotal(List<TaxTotalModel> taxTotal);

    String getId();

    

}
