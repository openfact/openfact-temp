//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.ubl.common;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



public class CodeType {

    protected String value;
    protected String listID;
    protected String listAgencyID;
    protected String listAgencyName;
    protected String listName;
    protected String listVersionID;
    protected String name;
    protected String languageID;
    protected String listURI;
    protected String listSchemeURI;
    protected String id;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getListID() {
        return listID;
    }

    public void setListID(String value) {
        this.listID = value;
    }

    public String getListAgencyID() {
        return listAgencyID;
    }

    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    public String getListAgencyName() {
        return listAgencyName;
    }

    public void setListAgencyName(String value) {
        this.listAgencyName = value;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String value) {
        this.listName = value;
    }

    public String getListVersionID() {
        return listVersionID;
    }

    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getLanguageID() {
        return languageID;
    }

    public void setLanguageID(String value) {
        this.languageID = value;
    }

    public String getListURI() {
        return listURI;
    }

    public void setListURI(String value) {
        this.listURI = value;
    }

    public String getListSchemeURI() {
        return listSchemeURI;
    }

    public void setListSchemeURI(String value) {
        this.listSchemeURI = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}