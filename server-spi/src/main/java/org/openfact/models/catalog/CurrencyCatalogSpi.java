package org.openfact.models.catalog;

import org.openfact.provider.Provider;
import org.openfact.provider.ProviderFactory;
import org.openfact.provider.Spi;

public class CurrencyCatalogSpi implements Spi  {

	@Override
	public boolean isInternal() {		
		return false;
	}

	@Override
	public String getName() {		
		return "currencyCatalog";
	}

	@Override
	public Class<? extends Provider> getProviderClass() {		
		return CurrencyCatalogProvider.class;
	}

	@Override
	public Class<? extends ProviderFactory> getProviderFactoryClass() {		
		return CurrencyCatalogProviderFactory.class;
	}

}
