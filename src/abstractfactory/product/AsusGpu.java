package abstractfactory.product;

public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS GPU");
    }
}
