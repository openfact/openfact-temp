//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "ResponseEntity")
@Table(name = "RESPONSE")
@Inheritance(strategy = InheritanceType.JOINED)
public class ResponseEntity {

    protected String referenceID;
    protected String responseCode;
    protected List<String> description;
    protected String id;

    @Column(name = "REFERENCE_ID")
    public String getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    @Column(name = "RESPONSE_CODE")
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    @Column(name = "DESCRIPTION")
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    @Id
    @Column(name = "ID_OFID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}