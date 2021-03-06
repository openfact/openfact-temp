package org.openfact.testsuite.providers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openfact.models.ModelDuplicateException;
import org.openfact.models.OrganizationModel;
import org.openfact.models.OrganizationProvider;
import org.openfact.models.ubl.InvoiceModel;
import org.openfact.models.ubl.provider.InvoiceProvider;

public class InvoiceProviderTest extends AbstractProviderTest {

    protected OrganizationModel organization;

    public void createOrganization() {
        OrganizationProvider provider = session.organizations();
        organization = provider.createOrganization("SISTCOOP");
        commit();
    }

    @Test
    public void createWithSeriesAndNumber() throws Exception {
        createOrganization();        
        
        InvoiceModel invoice = session.invoices().addInvoice(organization, "F002-0003");
        commit();

        assertThat(invoice, is(notNullValue()));
        assertThat(invoice.getId(), is(notNullValue()));
        assertThat(invoice.getID(), is("F002-0003"));
    }    

    @Test
    public void SeriesAndNumberCollision() {
        OrganizationModel sistcoop1 = session.organizations().createOrganization("SISTCOOP1");
        OrganizationModel sistcoop2 = session.organizations().createOrganization("SISTCOOP2");
        commit();

        session.invoices().addInvoice(sistcoop1, "F01-001");
        session.invoices().addInvoice(sistcoop2, "F01-001");
        commit();

        // Try to create invoice with duplicate series and number
        try {
            sistcoop1 = session.organizations().getOrganizationByName("SISTCOOP1");
            session.invoices().addInvoice(sistcoop1,"F01-001");
            commit();
            Assert.fail("Expected exception");
        } catch (ModelDuplicateException e) {
        }
        commit(true);

        // Ty to rename invoice to duplicate series and number
        sistcoop1 = session.organizations().getOrganizationByName("SISTCOOP1");
        session.invoices().addInvoice(sistcoop1, "F01-002");
        commit();
        try {
            sistcoop1 = session.organizations().getOrganizationByName("SISTCOOP1");
            session.invoices().getInvoiceByID(sistcoop1, "F01-002").setID("F01-001");
            commit();
            Assert.fail("Expected exception");
        } catch (ModelDuplicateException e) {
        }

        resetSession();
    }

    @Test
    public void findById() throws Exception {
        createOrganization();
        InvoiceModel invoice1 = session.invoices().addInvoice(organization, "F01-001");
        commit();

        InvoiceModel invoice2 = session.invoices().getInvoiceById(organization, invoice1.getId());
        assertThat(invoice2, is(notNullValue()));
        assertThat(invoice2.getId(), is(notNullValue()));
        assertThat(invoice2.getId(), is(equalTo(invoice1.getId())));
        assertThat(invoice2.getID(), is(equalTo(invoice1.getID())));
    }

    @Test
    public void findBySeriesAndNumber() throws Exception {
        createOrganization();
        InvoiceProvider provider = session.invoices();
        InvoiceModel invoice1 = provider.addInvoice(organization, "F001-0001");
        commit();

        InvoiceModel invoice2 = session.invoices().getInvoiceByID(organization, "F001-0001");
        assertThat(invoice2, is(notNullValue()));
        assertThat(invoice2.getId(), is(notNullValue()));
        assertThat(invoice2.getId(), is(equalTo(invoice1.getId())));
        assertThat(invoice2.getID(), is(equalTo(invoice1.getID())));
    }

    @Test
    public void remove() throws Exception {
        createOrganization();

        InvoiceProvider provider = session.invoices();
        provider.addInvoice(organization, "F001-0001");
        commit();

        InvoiceModel invoice = session.invoices().getInvoiceByID(organization, "F001-0001");
        assertThat(session.invoices().removeInvoice(organization, invoice), is(true));
        assertThat(session.invoices().removeInvoice(organization, invoice), is(false));
        assertThat(session.invoices().getInvoiceByID(organization, "F001-0001"), is(nullValue()));
    }

    /**
     * Get invoices
     */
    @Test
    public void getInvoicesByOrganization() throws Exception {
        OrganizationModel sistcoop1 = session.organizations().createOrganization("SISTCOOP1");
        OrganizationModel sistcoop2 = session.organizations().createOrganization("SISTCOOP2");
        commit();

        session.invoices().addInvoice(sistcoop1, "F01-001");
        session.invoices().addInvoice(sistcoop1, "F01-002");
        session.invoices().addInvoice(sistcoop1, "F01-003");
        session.invoices().addInvoice(sistcoop2, "F01-004");
        session.invoices().addInvoice(sistcoop2, "F01-005");
        session.invoices().addInvoice(sistcoop2, "F01-006");
        commit();

        List<InvoiceModel> invoices1 = session.invoices().getInvoices(sistcoop1);
        List<InvoiceModel> invoices2 = session.invoices().getInvoices(sistcoop2);

        List<InvoiceModel> invoices3 = session.invoices().getInvoices(sistcoop1, 0, 1);

        assertThat(invoices1.size(), is(3));
        assertThat(invoices2.size(), is(3));
        assertThat(invoices3.size(), is(1));
    }

}
