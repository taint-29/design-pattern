package abstractfactory.factories;

import abstractfactory.product.Gpu;
import abstractfactory.product.Monitor;
import abstractfactory.product.MsiGpu;
import abstractfactory.product.MsiMonitor;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
