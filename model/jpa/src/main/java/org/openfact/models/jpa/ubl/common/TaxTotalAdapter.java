package org.openfact.models.jpa.ubl.common;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.jboss.logging.Logger;
import org.openfact.models.OpenfactSession;
import org.openfact.models.jpa.JpaModel;
import org.openfact.models.jpa.entities.ubl.common.TaxSubtotalEntity;
import org.openfact.models.jpa.entities.ubl.common.TaxTotalEntity;
import org.openfact.models.ubl.common.TaxSubtotalModel;
import org.openfact.models.ubl.common.TaxTotalModel;

public class TaxTotalAdapter implements TaxTotalModel, JpaModel<TaxTotalEntity> {

    protected static final Logger logger = Logger.getLogger(TaxTotalAdapter.class);
    protected TaxTotalEntity taxTotal;
    protected EntityManager em;
    protected OpenfactSession session;

    public TaxTotalAdapter(OpenfactSession session, EntityManager em, TaxTotalEntity taxTotal) {
        this.session = session;
        this.em = em;
        this.taxTotal = taxTotal;
    }

    @Override
    public BigDecimal getTaxAmount() {
        return this.taxTotal.getTaxAmount();
    }

    @Override
    public void setTaxAmount(BigDecimal value) {
        this.taxTotal.setTaxAmount(value);
    }

    @Override
    public BigDecimal getRoundingAmount() {
        return this.taxTotal.getRoundingAmount();
    }

    @Override
    public void setRoundingAmount(BigDecimal value) {
        this.taxTotal.setRoundingAmount(value);
    }

    @Override
    public boolean getTaxEvidenceIndicator() {
        return this.taxTotal.isTaxEvidenceIndicator();
    }

    @Override
    public void setTaxEvidenceIndicator(boolean value) {
        this.taxTotal.setTaxEvidenceIndicator(value);
    }

    @Override
    public List<TaxSubtotalModel> getTaxSubtotal() {
        return taxTotal.getTaxSubtotal().stream().map(f -> new TaxSubtotalAdapter(session, em, f))
                .collect(Collectors.toList());
    }

    @Override
    public void setTaxSubtotal(List<TaxSubtotalModel> taxSubtotal) {
        List<TaxSubtotalEntity> entities = taxSubtotal.stream().map(f -> TaxSubtotalAdapter.toEntity(f, em))
                .collect(Collectors.toList());
        taxTotal.setTaxSubtotal(entities);
    }

    @Override
    public String getId() {
        return this.taxTotal.getId();
    }

    public static TaxTotalEntity toEntity(TaxTotalModel model, EntityManager em) {
        if (model instanceof TaxTotalAdapter) {
            return ((TaxTotalAdapter) model).getEntity();
        }
        return em.getReference(TaxTotalEntity.class, model.getId());
    }

    @Override
    public TaxTotalEntity getEntity() {
        return taxTotal;
    }

    @Override
    public TaxSubtotalModel addTaxSubtotal() {
        List<TaxSubtotalEntity> entities = taxTotal.getTaxSubtotal();
        TaxSubtotalEntity entity = new TaxSubtotalEntity();
        entities.add(entity);
        return new TaxSubtotalAdapter(session, em, entity);
    }

}
