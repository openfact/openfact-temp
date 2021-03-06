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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ITEMIDENTIFICATION")
public class ItemIdentificationEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "ID_UBL")
    protected String ID;

    @Column(name = "EXTENDED_ID")
    protected String extendedID;

    @OneToMany(targetEntity = PhysicalAttributeEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PHYSICALATTRIBUTE")
    protected List<PhysicalAttributeEntity> physicalAttribute = new ArrayList<>();

    @OneToMany(targetEntity = DimensionEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "MEASUREMENTDIMENSION")
    protected List<DimensionEntity> measurementDimension = new ArrayList<>();

    @ManyToOne(targetEntity = PartyEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ISSUERPARTY")
    protected PartyEntity issuerParty = new PartyEntity();

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the iD
     */
    public String getID() {
        return ID;
    }

    /**
     * @param iD
     *            the iD to set
     */
    public void setID(String iD) {
        ID = iD;
    }

    /**
     * @return the extendedID
     */
    public String getExtendedID() {
        return extendedID;
    }

    /**
     * @param extendedID
     *            the extendedID to set
     */
    public void setExtendedID(String extendedID) {
        this.extendedID = extendedID;
    }

    /**
     * @return the physicalAttribute
     */
    public List<PhysicalAttributeEntity> getPhysicalAttribute() {
        return physicalAttribute;
    }

    /**
     * @param physicalAttribute
     *            the physicalAttribute to set
     */
    public void setPhysicalAttribute(List<PhysicalAttributeEntity> physicalAttribute) {
        this.physicalAttribute = physicalAttribute;
    }

    /**
     * @return the measurementDimension
     */
    public List<DimensionEntity> getMeasurementDimension() {
        return measurementDimension;
    }

    /**
     * @param measurementDimension
     *            the measurementDimension to set
     */
    public void setMeasurementDimension(List<DimensionEntity> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    /**
     * @return the issuerParty
     */
    public PartyEntity getIssuerParty() {
        return issuerParty;
    }

    /**
     * @param issuerParty
     *            the issuerParty to set
     */
    public void setIssuerParty(PartyEntity issuerParty) {
        this.issuerParty = issuerParty;
    }

}
