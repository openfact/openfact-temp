package org.openfact.testsuite.model;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openfact.models.OpenfactSession;
import org.openfact.models.OrganizationModel;
import org.openfact.representations.idm.OrganizationRepresentation;
import org.openfact.representations.idm.PostalAddressRepresentation;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImportTest extends AbstractModelTest {

    @Test
    public void install() throws Exception {
        OrganizationRepresentation rep = AbstractModelTest.loadJson("model/testorganization.json");
        rep.setId("demo");
        rep.setOrganization("demo");
        OrganizationModel organization = organizationManager.importOrganization(rep);

        // Commit after import
        commit();

        organization = organizationManager.getOrganization("demo");
        assertDataImportedInOrganization(organizationManager.getSession(), organization, rep);

        commit();

        organization = organizationManager.getOrganization("demo");
        organizationManager.removeOrganization(organization);
    }

    public static void assertDataImportedInOrganization(OpenfactSession session, OrganizationModel organization, OrganizationRepresentation rep) {
        /**
         * General information
         */
        if (rep.getId() != null) {
            Assert.assertEquals(rep.getId(), organization.getId());
        } else {
            Assert.assertNotNull(organization.getId());
        }
        Assert.assertEquals(rep.getOrganization(), organization.getName());
        Assert.assertEquals(rep.getDescription(), organization.getDescription());
        if (rep.getEnabled() != null) {
            Assert.assertEquals(rep.getEnabled(), organization.isEnabled());
        } else {
            Assert.assertTrue(organization.isEnabled());
        }
        Assert.assertEquals(rep.getAssignedIdentificationId(), organization.getAssignedIdentificationId());
        Assert.assertEquals(rep.getSupplierName(), organization.getSupplierName());
        Assert.assertEquals(rep.getRegistrationName(), organization.getRegistrationName());
        
        if(rep.getAdditionalAccountId() != null) {
            Assert.assertEquals(rep.getAdditionalAccountId(), organization.getAdditionalAccountId());            
        }

        /**
         * Postal Address
         */
        PostalAddressRepresentation postalAddressRep = rep.getPostalAddress();
        Assert.assertEquals(postalAddressRep.getStreetName(), organization.getStreetName());
        Assert.assertEquals(postalAddressRep.getCitySubdivisionName(), organization.getCitySubdivisionName());
        Assert.assertEquals(postalAddressRep.getCityName(), organization.getCityName());
        Assert.assertEquals(postalAddressRep.getCountrySubentity(), organization.getCountrySubentity());
        Assert.assertEquals(postalAddressRep.getDistrict(), organization.getDistrict());
        Assert.assertEquals(postalAddressRep.getCountryIdentificationCode(), organization.getCountryIdentificationCode());
        
        /**
         * Smtp server*/
        Assert.assertEquals(rep.getSmtpServer().size(), organization.getSmtpConfig().size());
        
        /**
         * Tasks Schedule*/                     
        
        /**
         * Invoices
         */
        //Assert.assertEquals(rep.getInvoices().size(), session.invoices().getInvoices(organization).size());                
    }
}