package abstractfactory.product;

public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
