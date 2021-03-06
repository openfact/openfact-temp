package org.openfact.models.jpa.ubl;

import javax.persistence.EntityManager;

import org.openfact.Config.Scope;
import org.openfact.connections.jpa.JpaConnectionProvider;
import org.openfact.models.OpenfactSession;
import org.openfact.models.OpenfactSessionFactory;
import org.openfact.models.ubl.provider.SendEventProvider;
import org.openfact.models.ubl.provider.SendEventProviderFactory;

public class JpaSendEventProviderFactory implements SendEventProviderFactory{

	@Override
	public SendEventProvider create(OpenfactSession session) {
		  EntityManager em = session.getProvider(JpaConnectionProvider.class).getEntityManager();
	        return new JpaSendEventProvider(session, em);
	}

	@Override
	public void init(Scope config) {		
		
	}

	@Override
	public void postInit(OpenfactSessionFactory factory) {
	
	}

	@Override
	public void close() {
		
	}

	@Override
	public String getId() {	
		return "jpa";
	}

}
