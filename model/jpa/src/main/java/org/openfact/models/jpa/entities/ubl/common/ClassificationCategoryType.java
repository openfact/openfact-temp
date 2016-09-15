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
import org.openfact.models.ubl.common.ClassificationCategoryType;
import org.openfact.models.ubl.common.CodeValueType;
import org.openfact.models.ubl.common.DescriptionType;
import org.openfact.models.ubl.common.NameTypeCommBas;

@Entity(name = "ClassificationCategoryType")
@Table(name = "CLASSIFICATIONCATEGORYTYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class ClassificationCategoryType {

    protected NameTypeCommBas name;
    protected CodeValueType codeValue;
    protected List<DescriptionType> description;
    protected List<ClassificationCategoryType> categorizesClassificationCategory;
    protected String id;

    @ManyToOne(targetEntity = NameTypeCommBas.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "NAME__CLASSIFICATIONCATEGORY_0")
    public NameTypeCommBas getName() {
        return name;
    }

    public void setName(NameTypeCommBas value) {
        this.name = value;
    }

    @ManyToOne(targetEntity = CodeValueType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CODEVALUE_CLASSIFICATIONCATE_0")
    public CodeValueType getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(CodeValueType value) {
        this.codeValue = value;
    }

    @OneToMany(targetEntity = DescriptionType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DESCRIPTION_CLASSIFICATIONCA_0")
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    @OneToMany(targetEntity = ClassificationCategoryType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CATEGORIZESCLASSIFICATIONCAT_1")
    public List<ClassificationCategoryType> getCategorizesClassificationCategory() {
        if (categorizesClassificationCategory == null) {
            categorizesClassificationCategory = new ArrayList<ClassificationCategoryType>();
        }
        return this.categorizesClassificationCategory;
    }

    public void setCategorizesClassificationCategory(
            List<ClassificationCategoryType> categorizesClassificationCategory) {
        this.categorizesClassificationCategory = categorizesClassificationCategory;
    }

    @Id
    @Column(name = "ID")
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