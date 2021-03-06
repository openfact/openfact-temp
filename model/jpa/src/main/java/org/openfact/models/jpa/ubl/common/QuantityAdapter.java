package org.openfact.models.jpa.ubl.common;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import org.jboss.logging.Logger;
import org.openfact.models.OpenfactSession;
import org.openfact.models.jpa.JpaModel;
import org.openfact.models.jpa.entities.ubl.common.QuantityEntity;
import org.openfact.models.ubl.common.QuantityModel;

public class QuantityAdapter implements QuantityModel, JpaModel<QuantityEntity> {

    protected static final Logger logger = Logger.getLogger(QuantityAdapter.class);
    protected QuantityEntity quantity;
    protected EntityManager em;
    protected OpenfactSession session;

    public QuantityAdapter(OpenfactSession session, EntityManager em, QuantityEntity quantity) {
        this.session = session;
        this.em = em;
        this.quantity = quantity;
    }

    @Override
    public BigDecimal getValue() {
        return this.quantity.getValue();
    }

    @Override
    public void setValue(BigDecimal value) {
        this.quantity.setValue(value);
    }

    @Override
    public String getUnitCode() {
        return this.quantity.getUnitCode();
    }

    @Override
    public void setUnitCode(String value) {
        this.quantity.setUnitCode(value);
    }

    @Override
    public String getId() {
        return this.quantity.getId();
    }

    @Override
    public QuantityEntity getEntity() {
        return quantity;
    }

    public static QuantityEntity toEntity(QuantityModel model, EntityManager em) {
        if (model instanceof QuantityAdapter) {
            return ((QuantityAdapter) model).getEntity();
        }
        return em.getReference(QuantityEntity.class, model.getId());
    }

}
