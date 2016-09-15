//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.ubl.common;

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
import javax.persistence.Table;


import org.openfact.models.ubl.common.AddressType;
import org.openfact.models.ubl.common.FinancialInstitutionType;
import org.openfact.models.ubl.common.IDType;
import org.openfact.models.ubl.common.NameTypeCommBas;

public class BranchType {

    protected IDType ID;
    protected NameTypeCommBas name;
    protected FinancialInstitutionType financialInstitution;
    protected AddressType address;
    protected String id;

    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    public NameTypeCommBas getName() {
        return name;
    }

    public void setName(NameTypeCommBas value) {
        this.name = value;
    }

    public FinancialInstitutionType getFinancialInstitution() {
        return financialInstitution;
    }

    public void setFinancialInstitution(FinancialInstitutionType value) {
        this.financialInstitution = value;
    }

    public AddressType getAddress() {
        return address;
    }

    public void setAddress(AddressType value) {
        this.address = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}