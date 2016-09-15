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


import org.openfact.models.ubl.common.DamageRemarksType;
import org.openfact.models.ubl.common.DespatchLineType;
import org.openfact.models.ubl.common.DimensionType;
import org.openfact.models.ubl.common.HandlingCodeType;
import org.openfact.models.ubl.common.HandlingInstructionsType;
import org.openfact.models.ubl.common.HazardousGoodsTransitType;
import org.openfact.models.ubl.common.HazardousRiskIndicatorType;
import org.openfact.models.ubl.common.IDType;
import org.openfact.models.ubl.common.PackageType;
import org.openfact.models.ubl.common.ReceiptLineType;
import org.openfact.models.ubl.common.ShippingMarksType;
import org.openfact.models.ubl.common.TemperatureType;
import org.openfact.models.ubl.common.TotalGoodsItemQuantityType;
import org.openfact.models.ubl.common.TotalPackageQuantityType;
import org.openfact.models.ubl.common.TransportEquipmentType;
import org.openfact.models.ubl.common.TransportHandlingUnitTypeCodeType;

public class TransportHandlingUnitType {

    protected IDType ID;
    protected TransportHandlingUnitTypeCodeType transportHandlingUnitTypeCode;
    protected HandlingCodeType handlingCode;
    protected HandlingInstructionsType handlingInstructions;
    protected HazardousRiskIndicatorType hazardousRiskIndicator;
    protected TotalGoodsItemQuantityType totalGoodsItemQuantity;
    protected TotalPackageQuantityType totalPackageQuantity;
    protected List<DamageRemarksType> damageRemarks;
    protected List<ShippingMarksType> shippingMarks;
    protected List<DespatchLineType> handlingUnitDespatchLine;
    protected List<PackageType> actualPackage;
    protected List<ReceiptLineType> receivedHandlingUnitReceiptLine;
    protected List<TransportEquipmentType> transportEquipment;
    protected List<HazardousGoodsTransitType> hazardousGoodsTransit;
    protected List<DimensionType> measurementDimension;
    protected TemperatureType minimumTemperature;
    protected TemperatureType maximumTemperature;
    protected String id;

    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    public TransportHandlingUnitTypeCodeType getTransportHandlingUnitTypeCode() {
        return transportHandlingUnitTypeCode;
    }

    public void setTransportHandlingUnitTypeCode(TransportHandlingUnitTypeCodeType value) {
        this.transportHandlingUnitTypeCode = value;
    }

    public HandlingCodeType getHandlingCode() {
        return handlingCode;
    }

    public void setHandlingCode(HandlingCodeType value) {
        this.handlingCode = value;
    }

    public HandlingInstructionsType getHandlingInstructions() {
        return handlingInstructions;
    }

    public void setHandlingInstructions(HandlingInstructionsType value) {
        this.handlingInstructions = value;
    }

    public HazardousRiskIndicatorType getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    public void setHazardousRiskIndicator(HazardousRiskIndicatorType value) {
        this.hazardousRiskIndicator = value;
    }

    public TotalGoodsItemQuantityType getTotalGoodsItemQuantity() {
        return totalGoodsItemQuantity;
    }

    public void setTotalGoodsItemQuantity(TotalGoodsItemQuantityType value) {
        this.totalGoodsItemQuantity = value;
    }

    public TotalPackageQuantityType getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    public void setTotalPackageQuantity(TotalPackageQuantityType value) {
        this.totalPackageQuantity = value;
    }

    public List<DamageRemarksType> getDamageRemarks() {
        if (damageRemarks == null) {
            damageRemarks = new ArrayList<DamageRemarksType>();
        }
        return this.damageRemarks;
    }

    public void setDamageRemarks(List<DamageRemarksType> damageRemarks) {
        this.damageRemarks = damageRemarks;
    }

    public List<ShippingMarksType> getShippingMarks() {
        if (shippingMarks == null) {
            shippingMarks = new ArrayList<ShippingMarksType>();
        }
        return this.shippingMarks;
    }

    public void setShippingMarks(List<ShippingMarksType> shippingMarks) {
        this.shippingMarks = shippingMarks;
    }

    public List<DespatchLineType> getHandlingUnitDespatchLine() {
        if (handlingUnitDespatchLine == null) {
            handlingUnitDespatchLine = new ArrayList<DespatchLineType>();
        }
        return this.handlingUnitDespatchLine;
    }

    public void setHandlingUnitDespatchLine(List<DespatchLineType> handlingUnitDespatchLine) {
        this.handlingUnitDespatchLine = handlingUnitDespatchLine;
    }

    public List<PackageType> getActualPackage() {
        if (actualPackage == null) {
            actualPackage = new ArrayList<PackageType>();
        }
        return this.actualPackage;
    }

    public void setActualPackage(List<PackageType> actualPackage) {
        this.actualPackage = actualPackage;
    }

    public List<ReceiptLineType> getReceivedHandlingUnitReceiptLine() {
        if (receivedHandlingUnitReceiptLine == null) {
            receivedHandlingUnitReceiptLine = new ArrayList<ReceiptLineType>();
        }
        return this.receivedHandlingUnitReceiptLine;
    }

    public void setReceivedHandlingUnitReceiptLine(List<ReceiptLineType> receivedHandlingUnitReceiptLine) {
        this.receivedHandlingUnitReceiptLine = receivedHandlingUnitReceiptLine;
    }

    public List<TransportEquipmentType> getTransportEquipment() {
        if (transportEquipment == null) {
            transportEquipment = new ArrayList<TransportEquipmentType>();
        }
        return this.transportEquipment;
    }

    public void setTransportEquipment(List<TransportEquipmentType> transportEquipment) {
        this.transportEquipment = transportEquipment;
    }

    public List<HazardousGoodsTransitType> getHazardousGoodsTransit() {
        if (hazardousGoodsTransit == null) {
            hazardousGoodsTransit = new ArrayList<HazardousGoodsTransitType>();
        }
        return this.hazardousGoodsTransit;
    }

    public void setHazardousGoodsTransit(List<HazardousGoodsTransitType> hazardousGoodsTransit) {
        this.hazardousGoodsTransit = hazardousGoodsTransit;
    }

    public List<DimensionType> getMeasurementDimension() {
        if (measurementDimension == null) {
            measurementDimension = new ArrayList<DimensionType>();
        }
        return this.measurementDimension;
    }

    public void setMeasurementDimension(List<DimensionType> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    public TemperatureType getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(TemperatureType value) {
        this.minimumTemperature = value;
    }

    public TemperatureType getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(TemperatureType value) {
        this.maximumTemperature = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}