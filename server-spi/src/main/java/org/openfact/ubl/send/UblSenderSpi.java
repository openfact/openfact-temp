package org.openfact.ubl.send;

import org.openfact.provider.Provider;
import org.openfact.provider.ProviderFactory;
import org.openfact.provider.Spi;

public class UblSenderSpi implements Spi {

    @Override
    public boolean isInternal() {
        return true;
    }

    @Override
    public String getName() {
        return "ulbSender";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return UblSenderProvider.class;
    }

    @Override
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return UblSenderProviderFactory.class;
    }

}
