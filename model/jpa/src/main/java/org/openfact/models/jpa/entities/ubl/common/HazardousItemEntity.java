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
@Table(name = "HAZARDOUSITEM")
public class HazardousItemEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "ID_UBL")
    protected String ID;

    @Column(name = "PLACARD_NOTATION")
    protected String placardNotation;

    @Column(name = "PLACARD_ENDORSEMENT")
    protected String placardEndorsement;

    @Column(name = "ADDITIONAL_INFORMATION")
    protected String additionalInformation;

    @Column(name = "UNDG_CODE")
    protected String undgCode;

    @Column(name = "EMERGENCY_PROCEDURES_CODE")
    protected String emergencyProceduresCode;

    @Column(name = "MEDICAL_FIRST_AID_GUIDE_CODE")
    protected String medicalFirstAidGuideCode;

    @Column(name = "TECHNICAL_NAME")
    protected String technicalName;

    @Column(name = "CATEGORY_NAME")
    protected String categoryName;

    @Column(name = "HAZARDOUS_CATEGORY_CODE")
    protected String hazardousCategoryCode;

    @Column(name = "UPPERORANGEHAZARDPLACARDID")
    protected String upperOrangeHazardPlacardID;

    @Column(name = "LOWERORANGEHAZARDPLACARDID")
    protected String lowerOrangeHazardPlacardID;

    @Column(name = "MARKING_ID")
    protected String markingID;

    @Column(name = "HAZARD_CLASS_ID")
    protected String hazardClassID;

    @ManyToOne(targetEntity = MeasureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "NETWEIGHTMEASURE")
    protected MeasureEntity netWeightMeasure = new MeasureEntity();

    @ManyToOne(targetEntity = MeasureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "NETVOLUMEMEASURE")
    protected MeasureEntity netVolumeMeasure = new MeasureEntity();

    @ManyToOne(targetEntity = QuantityEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "QUANTITY")
    protected QuantityEntity quantity = new QuantityEntity();

    @ManyToOne(targetEntity = PartyEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CONTACTPARTY")
    protected PartyEntity contactParty = new PartyEntity();

    @OneToMany(targetEntity = SecondaryHazardEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "SECONDARYHAZARD")
    protected List<SecondaryHazardEntity> secondaryHazard = new ArrayList<>();

    @OneToMany(targetEntity = HazardousGoodsTransitEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "HAZARDOUSGOODSTRANSIT")
    protected List<HazardousGoodsTransitEntity> hazardousGoodsTransit = new ArrayList<>();

    @ManyToOne(targetEntity = TemperatureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "EMERGENCYTEMPERATURE")
    protected TemperatureEntity emergencyTemperature = new TemperatureEntity();

    @ManyToOne(targetEntity = TemperatureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "FLASHPOINTTEMPERATURE")
    protected TemperatureEntity flashpointTemperature = new TemperatureEntity();

    @OneToMany(targetEntity = TemperatureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ADDITIONALTEMPERATURE")
    protected List<TemperatureEntity> additionalTemperature = new ArrayList<>();

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
     * @return the placardNotation
     */
    public String getPlacardNotation() {
        return placardNotation;
    }

    /**
     * @param placardNotation
     *            the placardNotation to set
     */
    public void setPlacardNotation(String placardNotation) {
        this.placardNotation = placardNotation;
    }

    /**
     * @return the placardEndorsement
     */
    public String getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * @param placardEndorsement
     *            the placardEndorsement to set
     */
    public void setPlacardEndorsement(String placardEndorsement) {
        this.placardEndorsement = placardEndorsement;
    }

    /**
     * @return the additionalInformation
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * @param additionalInformation
     *            the additionalInformation to set
     */
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * @return the undgCode
     */
    public String getUndgCode() {
        return undgCode;
    }

    /**
     * @param undgCode
     *            the undgCode to set
     */
    public void setUndgCode(String undgCode) {
        this.undgCode = undgCode;
    }

    /**
     * @return the emergencyProceduresCode
     */
    public String getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * @param emergencyProceduresCode
     *            the emergencyProceduresCode to set
     */
    public void setEmergencyProceduresCode(String emergencyProceduresCode) {
        this.emergencyProceduresCode = emergencyProceduresCode;
    }

    /**
     * @return the medicalFirstAidGuideCode
     */
    public String getMedicalFirstAidGuideCode() {
        return medicalFirstAidGuideCode;
    }

    /**
     * @param medicalFirstAidGuideCode
     *            the medicalFirstAidGuideCode to set
     */
    public void setMedicalFirstAidGuideCode(String medicalFirstAidGuideCode) {
        this.medicalFirstAidGuideCode = medicalFirstAidGuideCode;
    }

    /**
     * @return the technicalName
     */
    public String getTechnicalName() {
        return technicalName;
    }

    /**
     * @param technicalName
     *            the technicalName to set
     */
    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     *            the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the hazardousCategoryCode
     */
    public String getHazardousCategoryCode() {
        return hazardousCategoryCode;
    }

    /**
     * @param hazardousCategoryCode
     *            the hazardousCategoryCode to set
     */
    public void setHazardousCategoryCode(String hazardousCategoryCode) {
        this.hazardousCategoryCode = hazardousCategoryCode;
    }

    /**
     * @return the upperOrangeHazardPlacardID
     */
    public String getUpperOrangeHazardPlacardID() {
        return upperOrangeHazardPlacardID;
    }

    /**
     * @param upperOrangeHazardPlacardID
     *            the upperOrangeHazardPlacardID to set
     */
    public void setUpperOrangeHazardPlacardID(String upperOrangeHazardPlacardID) {
        this.upperOrangeHazardPlacardID = upperOrangeHazardPlacardID;
    }

    /**
     * @return the lowerOrangeHazardPlacardID
     */
    public String getLowerOrangeHazardPlacardID() {
        return lowerOrangeHazardPlacardID;
    }

    /**
     * @param lowerOrangeHazardPlacardID
     *            the lowerOrangeHazardPlacardID to set
     */
    public void setLowerOrangeHazardPlacardID(String lowerOrangeHazardPlacardID) {
        this.lowerOrangeHazardPlacardID = lowerOrangeHazardPlacardID;
    }

    /**
     * @return the markingID
     */
    public String getMarkingID() {
        return markingID;
    }

    /**
     * @param markingID
     *            the markingID to set
     */
    public void setMarkingID(String markingID) {
        this.markingID = markingID;
    }

    /**
     * @return the hazardClassID
     */
    public String getHazardClassID() {
        return hazardClassID;
    }

    /**
     * @param hazardClassID
     *            the hazardClassID to set
     */
    public void setHazardClassID(String hazardClassID) {
        this.hazardClassID = hazardClassID;
    }

    /**
     * @return the netWeightMeasure
     */
    public MeasureEntity getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * @param netWeightMeasure
     *            the netWeightMeasure to set
     */
    public void setNetWeightMeasure(MeasureEntity netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
    }

    /**
     * @return the netVolumeMeasure
     */
    public MeasureEntity getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * @param netVolumeMeasure
     *            the netVolumeMeasure to set
     */
    public void setNetVolumeMeasure(MeasureEntity netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
    }

    /**
     * @return the quantity
     */
    public QuantityEntity getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     *            the quantity to set
     */
    public void setQuantity(QuantityEntity quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the contactParty
     */
    public PartyEntity getContactParty() {
        return contactParty;
    }

    /**
     * @param contactParty
     *            the contactParty to set
     */
    public void setContactParty(PartyEntity contactParty) {
        this.contactParty = contactParty;
    }

    /**
     * @return the secondaryHazard
     */
    public List<SecondaryHazardEntity> getSecondaryHazard() {
        return secondaryHazard;
    }

    /**
     * @param secondaryHazard
     *            the secondaryHazard to set
     */
    public void setSecondaryHazard(List<SecondaryHazardEntity> secondaryHazard) {
        this.secondaryHazard = secondaryHazard;
    }

    /**
     * @return the hazardousGoodsTransit
     */
    public List<HazardousGoodsTransitEntity> getHazardousGoodsTransit() {
        return hazardousGoodsTransit;
    }

    /**
     * @param hazardousGoodsTransit
     *            the hazardousGoodsTransit to set
     */
    public void setHazardousGoodsTransit(List<HazardousGoodsTransitEntity> hazardousGoodsTransit) {
        this.hazardousGoodsTransit = hazardousGoodsTransit;
    }

    /**
     * @return the emergencyTemperature
     */
    public TemperatureEntity getEmergencyTemperature() {
        return emergencyTemperature;
    }

    /**
     * @param emergencyTemperature
     *            the emergencyTemperature to set
     */
    public void setEmergencyTemperature(TemperatureEntity emergencyTemperature) {
        this.emergencyTemperature = emergencyTemperature;
    }

    /**
     * @return the flashpointTemperature
     */
    public TemperatureEntity getFlashpointTemperature() {
        return flashpointTemperature;
    }

    /**
     * @param flashpointTemperature
     *            the flashpointTemperature to set
     */
    public void setFlashpointTemperature(TemperatureEntity flashpointTemperature) {
        this.flashpointTemperature = flashpointTemperature;
    }

    /**
     * @return the additionalTemperature
     */
    public List<TemperatureEntity> getAdditionalTemperature() {
        return additionalTemperature;
    }

    /**
     * @param additionalTemperature
     *            the additionalTemperature to set
     */
    public void setAdditionalTemperature(List<TemperatureEntity> additionalTemperature) {
        this.additionalTemperature = additionalTemperature;
    }

}
