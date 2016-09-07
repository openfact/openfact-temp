package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * A document issued by a procurement organization to notify an economic
 * operator whether it has been admitted to or excluded from the tendering
 * process.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:21:34 a. m.
 */
public class TendererQualificationResponse {

    /**
     * An identifier, assigned by the sender, for the process file (i.e.,
     * record) to which this document belongs.
     */
    private String ContractFolderID;
    /**
     * Short title of a contract associated with this Tender.
     */
    private String ContractName;
    /**
     * Indicates whether this document is a copy (true) or not (false).
     */
    private boolean CopyIndicator;
    /**
     * Identifies a user-defined customization of UBL for a specific use.
     */
    private String CustomizationID;
    /**
     * An identifier for this document, assigned by the sender.
     */
    private String ID;
    /**
     * The date, assigned by the sender, on which this document was issued.
     */
    private LocalDate IssueDate;
    /**
     * The time, assigned by the sender, at which this document was issued.
     */
    private LocalTime IssueTime;
    /**
     * Free-form text pertinent to this document, conveying information that is
     * not contained explicitly in other structures.
     */
    private String Note;
    /**
     * Identifies an instance of executing a profile, to associate all
     * transactions in a collaboration.
     */
    private String ProfileExecutionID;
    /**
     * Identifies a user-defined profile of the customization of UBL being used.
     */
    private String ProfileID;
    /**
     * Identifies the earliest version of the UBL 2 schema for this document
     * type that defines all of the elements that might be encountered in the
     * current instance.
     */
    private String UBLVersionID;
    /**
     * A universally unique identifier for an instance of this document.
     */
    private String UUID;
    private List<AppealTerms> appealTerms = new ArrayList<>();
    private DocumentReference ResolutionDocumentReference;
    private Party SenderParty;
    private Party ReceiverParty;
    private List<QualificationResolution> qualificationResolutions = new ArrayList<>();
    private List<Signature> signatures = new ArrayList<>();

    /**
     * @return the contractFolderID
     */
    public String getContractFolderID() {
        return ContractFolderID;
    }

    /**
     * @param contractFolderID
     *            the contractFolderID to set
     */
    public void setContractFolderID(String contractFolderID) {
        ContractFolderID = contractFolderID;
    }

    /**
     * @return the contractName
     */
    public String getContractName() {
        return ContractName;
    }

    /**
     * @param contractName
     *            the contractName to set
     */
    public void setContractName(String contractName) {
        ContractName = contractName;
    }

    /**
     * @return the copyIndicator
     */
    public boolean isCopyIndicator() {
        return CopyIndicator;
    }

    /**
     * @param copyIndicator
     *            the copyIndicator to set
     */
    public void setCopyIndicator(boolean copyIndicator) {
        CopyIndicator = copyIndicator;
    }

    /**
     * @return the customizationID
     */
    public String getCustomizationID() {
        return CustomizationID;
    }

    /**
     * @param customizationID
     *            the customizationID to set
     */
    public void setCustomizationID(String customizationID) {
        CustomizationID = customizationID;
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
     * @return the issueDate
     */
    public LocalDate getIssueDate() {
        return IssueDate;
    }

    /**
     * @param issueDate
     *            the issueDate to set
     */
    public void setIssueDate(LocalDate issueDate) {
        IssueDate = issueDate;
    }

    /**
     * @return the issueTime
     */
    public LocalTime getIssueTime() {
        return IssueTime;
    }

    /**
     * @param issueTime
     *            the issueTime to set
     */
    public void setIssueTime(LocalTime issueTime) {
        IssueTime = issueTime;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return Note;
    }

    /**
     * @param note
     *            the note to set
     */
    public void setNote(String note) {
        Note = note;
    }

    /**
     * @return the profileExecutionID
     */
    public String getProfileExecutionID() {
        return ProfileExecutionID;
    }

    /**
     * @param profileExecutionID
     *            the profileExecutionID to set
     */
    public void setProfileExecutionID(String profileExecutionID) {
        ProfileExecutionID = profileExecutionID;
    }

    /**
     * @return the profileID
     */
    public String getProfileID() {
        return ProfileID;
    }

    /**
     * @param profileID
     *            the profileID to set
     */
    public void setProfileID(String profileID) {
        ProfileID = profileID;
    }

    /**
     * @return the uBLVersionID
     */
    public String getUBLVersionID() {
        return UBLVersionID;
    }

    /**
     * @param uBLVersionID
     *            the uBLVersionID to set
     */
    public void setUBLVersionID(String uBLVersionID) {
        UBLVersionID = uBLVersionID;
    }

    /**
     * @return the uUID
     */
    public String getUUID() {
        return UUID;
    }

    /**
     * @param uUID
     *            the uUID to set
     */
    public void setUUID(String uUID) {
        UUID = uUID;
    }

    /**
     * @return the appealTerms
     */
    public List<AppealTerms> getAppealTerms() {
        return appealTerms;
    }

    /**
     * @param appealTerms
     *            the appealTerms to set
     */
    public void setAppealTerms(List<AppealTerms> appealTerms) {
        this.appealTerms = appealTerms;
    }

    /**
     * @return the resolutionDocumentReference
     */
    public DocumentReference getResolutionDocumentReference() {
        return ResolutionDocumentReference;
    }

    /**
     * @param resolutionDocumentReference
     *            the resolutionDocumentReference to set
     */
    public void setResolutionDocumentReference(DocumentReference resolutionDocumentReference) {
        ResolutionDocumentReference = resolutionDocumentReference;
    }

    /**
     * @return the senderParty
     */
    public Party getSenderParty() {
        return SenderParty;
    }

    /**
     * @param senderParty
     *            the senderParty to set
     */
    public void setSenderParty(Party senderParty) {
        SenderParty = senderParty;
    }

    /**
     * @return the receiverParty
     */
    public Party getReceiverParty() {
        return ReceiverParty;
    }

    /**
     * @param receiverParty
     *            the receiverParty to set
     */
    public void setReceiverParty(Party receiverParty) {
        ReceiverParty = receiverParty;
    }

    /**
     * @return the qualificationResolutions
     */
    public List<QualificationResolution> getQualificationResolutions() {
        return qualificationResolutions;
    }

    /**
     * @param qualificationResolutions
     *            the qualificationResolutions to set
     */
    public void setQualificationResolutions(List<QualificationResolution> qualificationResolutions) {
        this.qualificationResolutions = qualificationResolutions;
    }

    /**
     * @return the signatures
     */
    public List<Signature> getSignatures() {
        return signatures;
    }

    /**
     * @param signatures
     *            the signatures to set
     */
    public void setSignatures(List<Signature> signatures) {
        this.signatures = signatures;
    }

}// end Tenderer Qualification Response