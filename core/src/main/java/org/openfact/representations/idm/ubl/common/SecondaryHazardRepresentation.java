package org.openfact.representations.idm.ubl.common;

public class SecondaryHazardRepresentation {
    private String idUbl;
    private String placardNotation;
    private String placardEndorsement;
    private String emergencyProceduresCode;
    private String extension;
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

    public String getPlacardEndorsement() {
        return this.placardEndorsement;
    }

    public void setPlacardEndorsement(String placardEndorsement) {
        this.placardEndorsement = placardEndorsement;
    }

    public String getPlacardNotation() {
        return this.placardNotation;
    }

    public void setPlacardNotation(String placardNotation) {
        this.placardNotation = placardNotation;
    }

    public String getEmergencyProceduresCode() {
        return this.emergencyProceduresCode;
    }

    public void setEmergencyProceduresCode(String emergencyProceduresCode) {
        this.emergencyProceduresCode = emergencyProceduresCode;
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}