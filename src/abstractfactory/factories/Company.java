package abstractfactory.factories;

import abstractfactory.product.Gpu;
import abstractfactory.product.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
