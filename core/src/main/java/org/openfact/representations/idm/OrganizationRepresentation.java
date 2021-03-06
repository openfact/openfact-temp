package org.openfact.representations.idm;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openfact.common.util.MultivaluedHashMap;
import org.openfact.representations.idm.ubl.CreditNoteRepresentation;
import org.openfact.representations.idm.ubl.DebitNoteRepresentation;
import org.openfact.representations.idm.ubl.InvoiceRepresentation;

public class OrganizationRepresentation {

    private String id;
    private String organization;
    private String description;
    private Boolean enabled;

    private String assignedIdentificationId;
    private String additionalAccountId;
    private String supplierName;
    private String registrationName;
    private LocalDateTime createdTimestamp;

    protected Map<String, String> smtpServer;
    protected Map<String, String> ublSenderServer;

    @Deprecated
    protected String privateKey;
    @Deprecated
    protected String publicKey;
    @Deprecated
    protected String certificate;
    @Deprecated
    protected String codeSecret;

    private PostalAddressRepresentation postalAddress;

    private Date taskFirstTime;
    private Long taskDelay;
    private Boolean tasksEnabled;

    protected String adminTheme;
    protected String emailTheme;
    protected Set<String> supportedLocales;
    protected String defaultLocale;
    protected Boolean internationalizationEnabled;

    protected Set<String> supportedUblLocales;
    protected String defaultUblLocale;
    protected Boolean internationalizationUblEnabled;

    protected Set<String> supportedCurrencies;
    protected String defaultCurrency;

    protected Boolean eventsEnabled;
    protected Long eventsExpiration;
    protected List<String> eventsListeners;
    protected List<String> enabledEventTypes;

    protected Boolean adminEventsEnabled;
    protected Boolean adminEventsDetailsEnabled;

    protected Set<String> requiredActions;
    protected Map<String, String> attributes;

    protected List<InvoiceRepresentation> invoices;
    protected List<CreditNoteRepresentation> creditNotes;
    protected List<DebitNoteRepresentation> debitNotes;

    private MultivaluedHashMap<String, ComponentExportRepresentation> components;

    protected String openfactVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAssignedIdentificationId() {
        return assignedIdentificationId;
    }

    public void setAssignedIdentificationId(String assignedIdentificationId) {
        this.assignedIdentificationId = assignedIdentificationId;
    }

    public String getAdditionalAccountId() {
        return additionalAccountId;
    }

    public void setAdditionalAccountId(String additionalAccountId) {
        this.additionalAccountId = additionalAccountId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public Map<String, String> getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(Map<String, String> smtpServer) {
        this.smtpServer = smtpServer;
    }

    public Map<String, String> getUblSenderServer() {
        return ublSenderServer;
    }

    public void setUblSenderServer(Map<String, String> ublSenderServer) {
        this.ublSenderServer = ublSenderServer;
    }

    public PostalAddressRepresentation getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(PostalAddressRepresentation postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getEmailTheme() {
        return emailTheme;
    }

    public void setEmailTheme(String emailTheme) {
        this.emailTheme = emailTheme;
    }

    public Set<String> getSupportedLocales() {
        return supportedLocales;
    }

    public void setSupportedLocales(Set<String> supportedLocales) {
        this.supportedLocales = supportedLocales;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public Boolean getInternationalizationEnabled() {
        return internationalizationEnabled;
    }

    public void setInternationalizationEnabled(Boolean internationalizationEnabled) {
        this.internationalizationEnabled = internationalizationEnabled;
    }

    public Set<String> getSupportedUblLocales() {
        return supportedUblLocales;
    }

    public void setSupportedUblLocales(Set<String> supportedUblLocales) {
        this.supportedUblLocales = supportedUblLocales;
    }

    public String getDefaultUblLocale() {
        return defaultUblLocale;
    }

    public void setDefaultUblLocale(String defaultUblLocale) {
        this.defaultUblLocale = defaultUblLocale;
    }

    public Boolean getInternationalizationUblEnabled() {
        return internationalizationUblEnabled;
    }

    public void setInternationalizationUblEnabled(Boolean internationalizationUblEnabled) {
        this.internationalizationUblEnabled = internationalizationUblEnabled;
    }

    public Set<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    public void setSupportedCurrencies(Set<String> supportedCurrencies) {
        this.supportedCurrencies = supportedCurrencies;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public Boolean getEventsEnabled() {
        return eventsEnabled;
    }

    public void setEventsEnabled(Boolean eventsEnabled) {
        this.eventsEnabled = eventsEnabled;
    }

    public Long getEventsExpiration() {
        return eventsExpiration;
    }

    public void setEventsExpiration(Long eventsExpiration) {
        this.eventsExpiration = eventsExpiration;
    }

    public List<String> getEventsListeners() {
        return eventsListeners;
    }

    public void setEventsListeners(List<String> eventsListeners) {
        this.eventsListeners = eventsListeners;
    }

    public List<String> getEnabledEventTypes() {
        return enabledEventTypes;
    }

    public void setEnabledEventTypes(List<String> enabledEventTypes) {
        this.enabledEventTypes = enabledEventTypes;
    }

    public Boolean getAdminEventsEnabled() {
        return adminEventsEnabled;
    }

    public void setAdminEventsEnabled(Boolean adminEventsEnabled) {
        this.adminEventsEnabled = adminEventsEnabled;
    }

    public Boolean getAdminEventsDetailsEnabled() {
        return adminEventsDetailsEnabled;
    }

    public void setAdminEventsDetailsEnabled(Boolean adminEventsDetailsEnabled) {
        this.adminEventsDetailsEnabled = adminEventsDetailsEnabled;
    }

    public Set<String> getRequiredActions() {
        return requiredActions;
    }

    public void setRequiredActions(Set<String> requiredActions) {
        this.requiredActions = requiredActions;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public List<InvoiceRepresentation> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<InvoiceRepresentation> invoices) {
        this.invoices = invoices;
    }

    public List<CreditNoteRepresentation> getCreditNotes() {
        return creditNotes;
    }

    public void setCreditNotes(List<CreditNoteRepresentation> creditNotes) {
        this.creditNotes = creditNotes;
    }

    public List<DebitNoteRepresentation> getDebitNotes() {
        return debitNotes;
    }

    public void setDebitNotes(List<DebitNoteRepresentation> debitNotes) {
        this.debitNotes = debitNotes;
    }

    public String getOpenfactVersion() {
        return openfactVersion;
    }

    public void setOpenfactVersion(String openfactVersion) {
        this.openfactVersion = openfactVersion;
    }

    public LocalDateTime getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getCodeSecret() {
        return codeSecret;
    }

    public void setCodeSecret(String codeSecret) {
        this.codeSecret = codeSecret;
    }

    public Long getTaskDelay() {
        return taskDelay;
    }

    public void setTaskDelay(Long taskDelay) {
        this.taskDelay = taskDelay;
    }

    public Date getTaskFirstTime() {
        return taskFirstTime;
    }

    public void setTaskFirstTime(Date taskFirstTime) {
        this.taskFirstTime = taskFirstTime;
    }

    public Boolean isTasksEnabled() {
        return tasksEnabled;
    }

    public void setTasksEnabled(Boolean tasksEnabled) {
        this.tasksEnabled = tasksEnabled;
    }

    public String getAdminTheme() {
        return adminTheme;
    }

    public void setAdminTheme(String adminTheme) {
        this.adminTheme = adminTheme;
    }

    public Boolean getTasksEnabled() {
        return tasksEnabled;
    }

    public MultivaluedHashMap<String, ComponentExportRepresentation> getComponents() {
        return components;
    }

    public void setComponents(MultivaluedHashMap<String, ComponentExportRepresentation> components) {
        this.components = components;
    }

}
