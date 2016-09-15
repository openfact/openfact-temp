//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.ubl.common;

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


import org.openfact.models.ubl.common.CommunicationType;
import org.openfact.models.ubl.common.ElectronicMailType;
import org.openfact.models.ubl.common.IDType;
import org.openfact.models.ubl.common.NameTypeCommBas;
import org.openfact.models.ubl.common.NoteType;
import org.openfact.models.ubl.common.TelefaxType;
import org.openfact.models.ubl.common.TelephoneType;

public class ContactType {

    protected IDType ID;
    protected NameTypeCommBas name;
    protected TelephoneType telephone;
    protected TelefaxType telefax;
    protected ElectronicMailType electronicMail;
    protected NoteType note;
    protected List<CommunicationType> otherCommunication;
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

    public TelephoneType getTelephone() {
        return telephone;
    }

    public void setTelephone(TelephoneType value) {
        this.telephone = value;
    }

    public TelefaxType getTelefax() {
        return telefax;
    }

    public void setTelefax(TelefaxType value) {
        this.telefax = value;
    }

    public ElectronicMailType getElectronicMail() {
        return electronicMail;
    }

    public void setElectronicMail(ElectronicMailType value) {
        this.electronicMail = value;
    }

    public NoteType getNote() {
        return note;
    }

    public void setNote(NoteType value) {
        this.note = value;
    }

    public List<CommunicationType> getOtherCommunication() {
        if (otherCommunication == null) {
            otherCommunication = new ArrayList<CommunicationType>();
        }
        return this.otherCommunication;
    }

    public void setOtherCommunication(List<CommunicationType> otherCommunication) {
        this.otherCommunication = otherCommunication;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}