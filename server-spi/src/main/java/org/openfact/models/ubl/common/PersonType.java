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


import org.openfact.models.ubl.common.FamilyNameType;
import org.openfact.models.ubl.common.FirstNameType;
import org.openfact.models.ubl.common.JobTitleType;
import org.openfact.models.ubl.common.MiddleNameType;
import org.openfact.models.ubl.common.NameSuffixType;
import org.openfact.models.ubl.common.OrganizationDepartmentType;
import org.openfact.models.ubl.common.TitleType;

public class PersonType {

    protected FirstNameType firstName;
    protected FamilyNameType familyName;
    protected TitleType title;
    protected MiddleNameType middleName;
    protected NameSuffixType nameSuffix;
    protected JobTitleType jobTitle;
    protected OrganizationDepartmentType organizationDepartment;
    protected String id;

    public FirstNameType getFirstName() {
        return firstName;
    }

    public void setFirstName(FirstNameType value) {
        this.firstName = value;
    }

    public FamilyNameType getFamilyName() {
        return familyName;
    }

    public void setFamilyName(FamilyNameType value) {
        this.familyName = value;
    }

    public TitleType getTitle() {
        return title;
    }

    public void setTitle(TitleType value) {
        this.title = value;
    }

    public MiddleNameType getMiddleName() {
        return middleName;
    }

    public void setMiddleName(MiddleNameType value) {
        this.middleName = value;
    }

    public NameSuffixType getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(NameSuffixType value) {
        this.nameSuffix = value;
    }

    public JobTitleType getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitleType value) {
        this.jobTitle = value;
    }

    public OrganizationDepartmentType getOrganizationDepartment() {
        return organizationDepartment;
    }

    public void setOrganizationDepartment(OrganizationDepartmentType value) {
        this.organizationDepartment = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}