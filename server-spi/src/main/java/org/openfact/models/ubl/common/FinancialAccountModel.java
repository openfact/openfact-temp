package org.openfact.models.ubl.common;

import java.util.List;

public interface FinancialAccountModel {

    String getID();

    void setID(String value);

    String getName();

    void setName(String value);

    String getAccountTypeCode();

    void setAccountTypeCode(String value);

    String getCurrencyCode();

    void setCurrencyCode(String value);

    List<String> getPaymentNote();

    void setPaymentNote(List<String> paymentNote);

    BranchModel getFinancialInstitutionBranch();

    void setFinancialInstitutionBranch(BranchModel value);

    CountryModel getCountry();

    void setCountry(CountryModel value);

    String getId();

    

}
