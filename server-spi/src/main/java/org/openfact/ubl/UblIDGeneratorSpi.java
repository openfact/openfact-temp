package org.openfact.ubl;

import org.openfact.provider.Provider;
import org.openfact.provider.ProviderFactory;
import org.openfact.provider.Spi;

public class UblIDGeneratorSpi implements Spi {

    @Override
    public boolean isInternal() {
        return true;
    }

    @Override
    public String getName() {
        return "ublIdentifierGenerator";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return UblIDGeneratorProvider.class;
    }

    @Override
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return UblIDGeneratorProviderFactory.class;
    }

}
