package org.openfact.representations.idm.ubl.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemRepresentation {
    private List<String> description;
    private QuantityRepresentation packQuantity;
    private BigDecimal packSizeNumeric;
    private Boolean catalogueIndicator;
    private String name;
    private Boolean hazardousRiskIndicator;
    private String additionalInformation;
    private List<String> keyword;
    private List<String> brandName;
    private List<String> representationName;
    private ItemIdentificationRepresentation buyersItemIdentification;
    private ItemIdentificationRepresentation sellersItemIdentification;
    private List<ItemIdentificationRepresentation> manufacturersItemIdentification;
    private ItemIdentificationRepresentation standardItemIdentification;
    private ItemIdentificationRepresentation catalogueItemIdentification;
    private List<ItemIdentificationRepresentation> additionalItemIdentification;
    private DocumentReferenceRepresentation catalogueDocumentReference;
    private List<DocumentReferenceRepresentation> itemSpecificationDocumentReference;
    private CountryRepresentation originCountry;
    private List<CommodityClassificationRepresentation> commodityClassification;
    private List<TransactionConditionsRepresentation> transactionConditions;
    private List<HazardousItemRepresentation> hazardousItem;
    private List<TaxCategoryRepresentation> classifiedTaxCategory;
    private List<ItemPropertyRepresentation> additionalItemProperty;
    private List<PartyRepresentation> manufacturerParty;
    private PartyRepresentation informationContentProviderParty;
    private List<AddressRepresentation> originAddress;
    private List<ItemInstanceRepresentation> itemInstance;
    private String id;

    /**/
    public void addItemSpecificationDocumentReference(DocumentReferenceRepresentation rep) {
        if (itemSpecificationDocumentReference == null) {
            itemSpecificationDocumentReference = new ArrayList<>();
        }
        itemSpecificationDocumentReference.add(rep);
    }

    public void addCommodityClassification(CommodityClassificationRepresentation rep) {
        if (commodityClassification == null) {
            commodityClassification = new ArrayList<>();
        }
        commodityClassification.add(rep);
    }

    public void addTransactionConditions(TransactionConditionsRepresentation rep) {
        if (transactionConditions == null) {
            transactionConditions = new ArrayList<>();
        }
        transactionConditions.add(rep);
    }

    public void addHazardousItem(HazardousItemRepresentation rep) {
        if (hazardousItem == null) {
            hazardousItem = new ArrayList<>();
        }
        hazardousItem.add(rep);
    }

    public void addClassifiedTaxCategory(TaxCategoryRepresentation rep) {
        if (classifiedTaxCategory == null) {
            classifiedTaxCategory = new ArrayList<>();
        }
        classifiedTaxCategory.add(rep);
    }

    public void addAdditionalItemProperty(ItemPropertyRepresentation rep) {
        if (additionalItemProperty == null) {
            additionalItemProperty = new ArrayList<>();
        }
        additionalItemProperty.add(rep);
    }

    public void addManufacturerParty(PartyRepresentation rep) {
        if (manufacturerParty == null) {
            manufacturerParty = new ArrayList<>();
        }
        manufacturerParty.add(rep);
    }

    public void addOriginAddress(AddressRepresentation rep) {
        if (originAddress == null) {
            originAddress = new ArrayList<>();
        }
        originAddress.add(rep);
    }

    public void addItemInstance(ItemInstanceRepresentation rep) {
        if (itemInstance == null) {
            itemInstance = new ArrayList<>();
        }
        itemInstance.add(rep);
    }

    public void addDescription(String rep) {
        if (description == null) {
            description = new ArrayList<>();
        }
        description.add(rep);
    }

    public void addKeyword(String rep) {
        if (keyword == null) {
            keyword = new ArrayList<>();
        }
        keyword.add(rep);
    }

    public void addBrandName(String rep) {
        if (brandName == null) {
            brandName = new ArrayList<>();
        }
        brandName.add(rep);
    }

    public void addRepresentationName(String rep) {
        if (representationName == null) {
            representationName = new ArrayList<>();
        }
        representationName.add(rep);
    }

    public void addManufacturersItemIdentification(ItemIdentificationRepresentation representation) {
        if (manufacturersItemIdentification == null) {
            manufacturersItemIdentification = new ArrayList<>();
        }
        manufacturersItemIdentification.add(representation);
    }

    public void addAdditionalItemIdentification(ItemIdentificationRepresentation representation) {
        if (additionalItemIdentification == null) {
            additionalItemIdentification = new ArrayList<>();
        }
        additionalItemIdentification.add(representation);
    }

    /**/

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getRepresentationName() {
        return this.representationName;
    }

    public void setRepresentationName(List<String> representationName) {
        this.representationName = representationName;
    }

    public List<TransactionConditionsRepresentation> getTransactionConditions() {
        return this.transactionConditions;
    }

    public void setTransactionConditions(List<TransactionConditionsRepresentation> transactionConditions) {
        this.transactionConditions = transactionConditions;
    }

    public List<TaxCategoryRepresentation> getClassifiedTaxCategory() {
        return this.classifiedTaxCategory;
    }

    public void setClassifiedTaxCategory(List<TaxCategoryRepresentation> classifiedTaxCategory) {
        this.classifiedTaxCategory = classifiedTaxCategory;
    }

    public List<String> getDescription() {
        return this.description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public PartyRepresentation getInformationContentProviderParty() {
        return this.informationContentProviderParty;
    }

    public void setInformationContentProviderParty(PartyRepresentation informationContentProviderParty) {
        this.informationContentProviderParty = informationContentProviderParty;
    }

    public List<ItemIdentificationRepresentation> getManufacturersItemIdentification() {
        return this.manufacturersItemIdentification;
    }

    public void setManufacturersItemIdentification(
            List<ItemIdentificationRepresentation> manufacturersItemIdentification) {
        this.manufacturersItemIdentification = manufacturersItemIdentification;
    }

    public ItemIdentificationRepresentation getCatalogueItemIdentification() {
        return this.catalogueItemIdentification;
    }

    public void setCatalogueItemIdentification(ItemIdentificationRepresentation catalogueItemIdentification) {
        this.catalogueItemIdentification = catalogueItemIdentification;
    }

    public DocumentReferenceRepresentation getCatalogueDocumentReference() {
        return this.catalogueDocumentReference;
    }

    public void setCatalogueDocumentReference(DocumentReferenceRepresentation catalogueDocumentReference) {
        this.catalogueDocumentReference = catalogueDocumentReference;
    }

    public List<ItemIdentificationRepresentation> getAdditionalItemIdentification() {
        return this.additionalItemIdentification;
    }

    public void setAdditionalItemIdentification(
            List<ItemIdentificationRepresentation> additionalItemIdentification) {
        this.additionalItemIdentification = additionalItemIdentification;
    }

    public BigDecimal getPackSizeNumeric() {
        return this.packSizeNumeric;
    }

    public void setPackSizeNumeric(BigDecimal packSizeNumeric) {
        this.packSizeNumeric = packSizeNumeric;
    }

    public List<ItemInstanceRepresentation> getItemInstance() {
        return this.itemInstance;
    }

    public void setItemInstance(List<ItemInstanceRepresentation> itemInstance) {
        this.itemInstance = itemInstance;
    }

    public List<String> getKeyword() {
        return this.keyword;
    }

    public void setKeyword(List<String> keyword) {
        this.keyword = keyword;
    }

    public List<CommodityClassificationRepresentation> getCommodityClassification() {
        return this.commodityClassification;
    }

    public void setCommodityClassification(
            List<CommodityClassificationRepresentation> commodityClassification) {
        this.commodityClassification = commodityClassification;
    }

    public List<HazardousItemRepresentation> getHazardousItem() {
        return this.hazardousItem;
    }

    public void setHazardousItem(List<HazardousItemRepresentation> hazardousItem) {
        this.hazardousItem = hazardousItem;
    }

    public ItemIdentificationRepresentation getSellersItemIdentification() {
        return this.sellersItemIdentification;
    }

    public void setSellersItemIdentification(ItemIdentificationRepresentation sellersItemIdentification) {
        this.sellersItemIdentification = sellersItemIdentification;
    }

    public Boolean getCatalogueIndicator() {
        return this.catalogueIndicator;
    }

    public void setCatalogueIndicator(Boolean catalogueIndicator) {
        this.catalogueIndicator = catalogueIndicator;
    }

    public QuantityRepresentation getPackQuantity() {
        return this.packQuantity;
    }

    public void setPackQuantity(QuantityRepresentation packQuantity) {
        this.packQuantity = packQuantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddressRepresentation> getOriginAddress() {
        return this.originAddress;
    }

    public void setOriginAddress(List<AddressRepresentation> originAddress) {
        this.originAddress = originAddress;
    }

    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public CountryRepresentation getOriginCountry() {
        return this.originCountry;
    }

    public void setOriginCountry(CountryRepresentation originCountry) {
        this.originCountry = originCountry;
    }

    public ItemIdentificationRepresentation getStandardItemIdentification() {
        return this.standardItemIdentification;
    }

    public void setStandardItemIdentification(ItemIdentificationRepresentation standardItemIdentification) {
        this.standardItemIdentification = standardItemIdentification;
    }

    public List<PartyRepresentation> getManufacturerParty() {
        return this.manufacturerParty;
    }

    public void setManufacturerParty(List<PartyRepresentation> manufacturerParty) {
        this.manufacturerParty = manufacturerParty;
    }

    public List<DocumentReferenceRepresentation> getItemSpecificationDocumentReference() {
        return this.itemSpecificationDocumentReference;
    }

    public void setItemSpecificationDocumentReference(
            List<DocumentReferenceRepresentation> itemSpecificationDocumentReference) {
        this.itemSpecificationDocumentReference = itemSpecificationDocumentReference;
    }

    public List<String> getBrandName() {
        return this.brandName;
    }

    public void setBrandName(List<String> brandName) {
        this.brandName = brandName;
    }

    public Boolean getHazardousRiskIndicator() {
        return this.hazardousRiskIndicator;
    }

    public void setHazardousRiskIndicator(Boolean hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
    }

    public List<ItemPropertyRepresentation> getAdditionalItemProperty() {
        return this.additionalItemProperty;
    }

    public void setAdditionalItemProperty(List<ItemPropertyRepresentation> additionalItemProperty) {
        this.additionalItemProperty = additionalItemProperty;
    }

    public ItemIdentificationRepresentation getBuyersItemIdentification() {
        return this.buyersItemIdentification;
    }

    public void setBuyersItemIdentification(ItemIdentificationRepresentation buyersItemIdentification) {
        this.buyersItemIdentification = buyersItemIdentification;
    }
}