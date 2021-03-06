package org.openfact.models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openfact.component.ComponentModel;
import org.openfact.provider.ProviderEvent;

public interface OrganizationModel {

    String NAME = "name";
    String DESCRIPTION = "description";
    String ASSIGNED_IDENTIFICATION_ID = "assignedIdentificationId";
    String SUPPLIER_NAME = "supplierName";
    String REGISTRATION_NAME = "registrationName";

    String getId();

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    boolean isEnabled();

    void setEnabled(boolean enabled);

    String getAssignedIdentificationId();

    void setAssignedIdentificationId(String assignedIdentificationId);

    String getAdditionalAccountId();

    void setAdditionalAccountId(String additionalAccount);

    String getSupplierName();

    void setSupplierName(String supplierName);

    String getRegistrationName();

    void setRegistrationName(String registrationName);

    LocalDateTime getCreatedTimestamp();

    /**
     * Postal address
     */
    String getPostalAddressId();

    void setPostalAddressId(String postalAddressId);

    String getStreetName();

    void setStreetName(String streetName);

    String getCitySubdivisionName();

    void setCitySubdivisionName(String citySubdivisionName);

    String getCityName();

    void setCityName(String cityName);

    String getCountrySubentity();

    void setCountrySubentity(String countrySubentity);

    String getDistrict();

    void setDistrict(String district);

    String getCountryIdentificationCode();

    void setCountryIdentificationCode(String countryIdentificationCode);

    /**
     * Themes
     */
    String getEmailTheme();

    void setEmailTheme(String name);

    /**
     * Internationalization
     */
    boolean isInternationalizationEnabled();

    void setInternationalizationEnabled(boolean enabled);

    Set<String> getSupportedLocales();

    void setSupportedLocales(Set<String> locales);

    String getDefaultLocale();

    void setDefaultLocale(String locale);

    /**
     * Internationalization ubl
     */
    boolean isInternationalizationUblEnabled();

    void setInternationalizationUblEnabled(boolean enabled);

    Set<String> getSupportedUblLocales();

    void setSupportedUblLocales(Set<String> locales);

    String getDefaultUblLocale();

    void setDefaultUblLocale(String locale);

    /**
     * Task schedules
     */
    Date getTaskFirstTime();

    void setTaskFirstTime(Date firstTime);

    long getTaskDelay();

    void setTaskDelay(long taskDelay);

    boolean isTasksEnabled();

    void setTaskEnabled(boolean taskEnabled);

    /**
     * Currencies
     */
    Set<String> getSupportedCurrencies();

    void setSupportedCurrencies(Set<String> currencies);

    String getDefaultCurrency();

    void setDefaultCurrency(String currency);

    /**
     * Events
     */
    boolean isEventsEnabled();

    void setEventsEnabled(boolean enabled);

    Set<String> getEventsListeners();

    void setEventsListeners(Set<String> listeners);

    Set<String> getEnabledEventTypes();

    void setEnabledEventTypes(Set<String> enabledEventTypes);

    boolean isAdminEventsEnabled();

    void setAdminEventsEnabled(boolean enabled);

    boolean isAdminEventsDetailsEnabled();

    void setAdminEventsDetailsEnabled(boolean enabled);

    long getEventsExpiration();

    void setEventsExpiration(long expiration);

    /**
     * Smtp for email
     */
    Map<String, String> getSmtpConfig();

    void setSmtpConfig(Map<String, String> smtpConfig);

    /**
     * Ubl server
     */
    Map<String, String> getUblSenderConfig();

    void setUblSenderConfig(Map<String, String> ublSenderConfig);

    /**
     * Attributes
     */
    void setAttribute(String name, String value);

    void removeAttribute(String name);

    String getAttribute(String name);

    Map<String, String> getAttributes();

    String getDisplayName();

    void setDisplayName(String displayName);

    String getDisplayNameHtml();

    void setDisplayNameHtml(String displayNameHtml);

    /**
     * Required actions
     */
    Set<String> getRequiredActions();

    void addRequiredAction(RequiredAction action);

    void addRequiredAction(String actionName);

    void removeRequiredAction(RequiredAction action);

    void removeRequiredAction(String actionName);

    /**
     * Events interfaces
     */
    interface OrganizationCreationEvent extends ProviderEvent {
        OrganizationModel getCreatedOrganization();
    }

    interface OrganizationPostCreateEvent extends ProviderEvent {
        OrganizationModel getCreatedOrganization();

        OpenfactSession getOpenfactSession();
    }

    interface OrganizationRemovedEvent extends ProviderEvent {
        OrganizationModel getOrganization();

        OpenfactSession getOpenfactSession();
    }

    /**
     * Components
     */
    ComponentModel addComponentModel(ComponentModel model);

    void updateComponent(ComponentModel component);

    void removeComponent(ComponentModel component);

    void removeComponents(String parentId);

    List<ComponentModel> getComponents(String parentId, String providerType);

    List<ComponentModel> getComponents(String parentId);

    List<ComponentModel> getComponents();

    ComponentModel getComponent(String id);

    /**
     * Headers
     */
    Map<String, String> getBrowserSecurityHeaders();

    void setBrowserSecurityHeaders(Map<String, String> headers);

    public static enum RequiredAction {
        ACTION1, ACTION2, ACTION3, ACTION4
    }

}
