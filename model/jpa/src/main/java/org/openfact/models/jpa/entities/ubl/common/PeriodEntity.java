//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.time.LocalDate;
import java.time.LocalTime;
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
import org.hibernate.annotations.Type;

@Entity
@Table(name = "PERIOD")
public class PeriodEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "START_DATE")
    @Type(type = "org.hibernate.type.LocalDateType")
    protected LocalDate startDate;

    @Column(name = "START_TIME")
    @Type(type = "org.hibernate.type.LocalTimeType")
    protected LocalTime startTime;

    @Column(name = "END_DATE")
    @Type(type = "org.hibernate.type.LocalDateType")
    protected LocalDate endDate;

    @Column(name = "END_TIME")
    @Type(type = "org.hibernate.type.LocalTimeType")
    protected LocalTime endTime;

    @ManyToOne(targetEntity = MeasureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DURATIONMEASURE")
    protected MeasureEntity durationMeasure = new MeasureEntity();

    @ElementCollection
    @Column(name = "VALUE")
    @CollectionTable(name = "PERIOD_DESCRIPTIONCODE", joinColumns = { @JoinColumn(name = "PERIOD_ID") })
    protected List<String> descriptionCode = new ArrayList<>();

    @ElementCollection
    @Column(name = "VALUE")
    @CollectionTable(name = "PERIOD_DESCRIPTION", joinColumns = { @JoinColumn(name = "PERIOD_ID") })
    protected List<String> description;

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
     * @return the startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     *            the startDate to set
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the startTime
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     *            the startTime to set
     */
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     *            the endDate to set
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the endTime
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     *            the endTime to set
     */
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the durationMeasure
     */
    public MeasureEntity getDurationMeasure() {
        return durationMeasure;
    }

    /**
     * @param durationMeasure
     *            the durationMeasure to set
     */
    public void setDurationMeasure(MeasureEntity durationMeasure) {
        this.durationMeasure = durationMeasure;
    }

    /**
     * @return the descriptionCode
     */
    public List<String> getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * @param descriptionCode
     *            the descriptionCode to set
     */
    public void setDescriptionCode(List<String> descriptionCode) {
        this.descriptionCode = descriptionCode;
    }

    /**
     * @return the description
     */
    public List<String> getDescription() {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(List<String> description) {
        this.description = description;
    }

}
