package org.openfact.models.jpa.entities.ubl;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "DEBIT_NOTE_ATTRIBUTE")
@NamedQueries({
        @NamedQuery(name = "getDebitNoteAttributesByNameAndValue", query = "select attr from DebitNoteAttributeEntity attr where attr.name = :name and attr.value = :value"),
        @NamedQuery(name = "deleteDebitNoteAttributesByOrganization", query = "delete from  DebitNoteAttributeEntity attr where attr.debitNote IN (select u from DebitNoteEntity u where u.organization.id=:organizationId)"),
        @NamedQuery(name = "deleteDebitNoteAttributesByNameAndDebitNote", query = "delete from  DebitNoteAttributeEntity attr where attr.debitNote.id = :debitNoteId and attr.name = :name"),
        @NamedQuery(name = "deleteDebitNoteAttributesOtherThan", query = "delete from  DebitNoteAttributeEntity attr where attr.debitNote.id = :debitNoteId and attr.id <> :attrId") })
public class DebitNoteAttributeEntity {

    @Id
    @Column(name = "ID", length = 36)
    @Access(AccessType.PROPERTY)
    protected String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected DebitNoteEntity debitNote;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "VALUE")
    protected String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DebitNoteEntity getDebitNote() {
        return debitNote;
    }

    public void setDebitNote(DebitNoteEntity debitNote) {
        this.debitNote = debitNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof DebitNoteAttributeEntity))
            return false;

        DebitNoteAttributeEntity that = (DebitNoteAttributeEntity) o;

        if (!id.equals(that.getId()))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
