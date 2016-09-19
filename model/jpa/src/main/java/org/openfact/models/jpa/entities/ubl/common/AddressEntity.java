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
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    protected String ID;
    protected String addressCode;
    protected String addressFormatCode;
    protected String postbox;
    protected String floor;
    protected String room;
    protected String streetName;
    protected String additionalStreetName;
    protected String blockName;
    protected String buildingName;
    protected String buildingNumber;
    protected String inhouseMail;
    protected String department;
    protected String markAttention;
    protected String markCare;
    protected String plotIdentification;
    protected String citySubdivisionName;
    protected String cityName;
    protected String postalZone;
    protected String countrySubentity;
    protected String countrySubentityCode;
    protected String region;
    protected String district;
    protected String timezoneOffset;
    
    @ElementCollection
    @Column(name="VALUE")
    @CollectionTable(name="ADDRESS_LINE", joinColumns={ @JoinColumn(name="ADDRESS_ID") })   
    protected List<String> addressLine;

    @ManyToOne(targetEntity = CountryEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "COUNTRY_ADDRESS_ID")
    protected CountryEntity country;

    @ManyToOne(targetEntity = LocationCoordinateEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LOCATIONCOORDINATE_ADDRESS_ID")
    protected LocationCoordinateEntity locationCoordinate;

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
     * @return the addressCode
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * @param addressCode
     *            the addressCode to set
     */
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    /**
     * @return the addressFormatCode
     */
    public String getAddressFormatCode() {
        return addressFormatCode;
    }

    /**
     * @param addressFormatCode
     *            the addressFormatCode to set
     */
    public void setAddressFormatCode(String addressFormatCode) {
        this.addressFormatCode = addressFormatCode;
    }

    /**
     * @return the postbox
     */
    public String getPostbox() {
        return postbox;
    }

    /**
     * @param postbox
     *            the postbox to set
     */
    public void setPostbox(String postbox) {
        this.postbox = postbox;
    }

    /**
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor
     *            the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room
     *            the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @return the streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName
     *            the streetName to set
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return the additionalStreetName
     */
    public String getAdditionalStreetName() {
        return additionalStreetName;
    }

    /**
     * @param additionalStreetName
     *            the additionalStreetName to set
     */
    public void setAdditionalStreetName(String additionalStreetName) {
        this.additionalStreetName = additionalStreetName;
    }

    /**
     * @return the blockName
     */
    public String getBlockName() {
        return blockName;
    }

    /**
     * @param blockName
     *            the blockName to set
     */
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    /**
     * @return the buildingName
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * @param buildingName
     *            the buildingName to set
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * @return the buildingNumber
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * @param buildingNumber
     *            the buildingNumber to set
     */
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    /**
     * @return the inhouseMail
     */
    public String getInhouseMail() {
        return inhouseMail;
    }

    /**
     * @param inhouseMail
     *            the inhouseMail to set
     */
    public void setInhouseMail(String inhouseMail) {
        this.inhouseMail = inhouseMail;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     *            the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the markAttention
     */
    public String getMarkAttention() {
        return markAttention;
    }

    /**
     * @param markAttention
     *            the markAttention to set
     */
    public void setMarkAttention(String markAttention) {
        this.markAttention = markAttention;
    }

    /**
     * @return the markCare
     */
    public String getMarkCare() {
        return markCare;
    }

    /**
     * @param markCare
     *            the markCare to set
     */
    public void setMarkCare(String markCare) {
        this.markCare = markCare;
    }

    /**
     * @return the plotIdentification
     */
    public String getPlotIdentification() {
        return plotIdentification;
    }

    /**
     * @param plotIdentification
     *            the plotIdentification to set
     */
    public void setPlotIdentification(String plotIdentification) {
        this.plotIdentification = plotIdentification;
    }

    /**
     * @return the citySubdivisionName
     */
    public String getCitySubdivisionName() {
        return citySubdivisionName;
    }

    /**
     * @param citySubdivisionName
     *            the citySubdivisionName to set
     */
    public void setCitySubdivisionName(String citySubdivisionName) {
        this.citySubdivisionName = citySubdivisionName;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName
     *            the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return the postalZone
     */
    public String getPostalZone() {
        return postalZone;
    }

    /**
     * @param postalZone
     *            the postalZone to set
     */
    public void setPostalZone(String postalZone) {
        this.postalZone = postalZone;
    }

    /**
     * @return the countrySubentity
     */
    public String getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * @param countrySubentity
     *            the countrySubentity to set
     */
    public void setCountrySubentity(String countrySubentity) {
        this.countrySubentity = countrySubentity;
    }

    /**
     * @return the countrySubentityCode
     */
    public String getCountrySubentityCode() {
        return countrySubentityCode;
    }

    /**
     * @param countrySubentityCode
     *            the countrySubentityCode to set
     */
    public void setCountrySubentityCode(String countrySubentityCode) {
        this.countrySubentityCode = countrySubentityCode;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region
     *            the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district
     *            the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the timezoneOffset
     */
    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * @param timezoneOffset
     *            the timezoneOffset to set
     */
    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    /**
     * @return the addressLine
     */
    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<>();
        }
        return addressLine;
    }

    /**
     * @param addressLine
     *            the addressLine to set
     */
    public void setAddressLine(List<String> addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * @return the country
     */
    public CountryEntity getCountry() {
        if (country == null) {
            country = new CountryEntity();
        }
        return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    /**
     * @return the locationCoordinate
     */
    public LocationCoordinateEntity getLocationCoordinate() {
        return locationCoordinate;
    }

    /**
     * @param locationCoordinate
     *            the locationCoordinate to set
     */
    public void setLocationCoordinate(LocationCoordinateEntity locationCoordinate) {
        this.locationCoordinate = locationCoordinate;
    }

}