package org.openfact.representations.idm.ubl.common;

public class BranchRepresentation {
    private String idUbl;
    private String name;
    private FinancialInstitutionRepresentation financialInstitution;
    private AddressRepresentation address;
    private String id;

    public String getIdUbl() {
        return this.idUbl;
    }

    public void setIdUbl(String idUbl) {
        this.idUbl = idUbl;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FinancialInstitutionRepresentation getFinancialInstitution() {
        return this.financialInstitution;
    }

    public void setFinancialInstitution(FinancialInstitutionRepresentation financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressRepresentation getAddress() {
        return this.address;
    }

    public void setAddress(AddressRepresentation address) {
        this.address = address;
    }
}