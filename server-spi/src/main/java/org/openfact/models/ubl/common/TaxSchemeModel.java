package org.openfact.models.ubl.common;

import java.util.List;

public interface TaxSchemeModel {

    String getID();

    void setID(String value);

    String getName();

    void setName(String value);

    String getTaxCode();

    void setTaxTypeCode(String value);

    String getCurrencyCode();

    void setCurrencyCode(String value);

    List<AddressModel> getJurisdictionRegionAddress();

    void setJurisdictionRegionAddress(List<AddressModel> jurisdictionRegionAddress);

    String getId();

    

}
