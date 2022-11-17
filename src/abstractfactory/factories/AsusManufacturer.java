package abstractfactory.factories;

import abstractfactory.product.AsusGpu;
import abstractfactory.product.AsusMonitor;
import abstractfactory.product.Gpu;
import abstractfactory.product.Monitor;

public class AsusManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
