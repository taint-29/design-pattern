package decorator;

public abstract class MilkTeaDecorator implements MilkTeaInterface{

    private MilkTeaInterface milkTeaInterface;

    protected MilkTeaDecorator(MilkTeaInterface milkTeaInterface) {
        this.milkTeaInterface = milkTeaInterface;
    }

    @Override
    public double cost() {
        return milkTeaInterface.cost();
    }
}
