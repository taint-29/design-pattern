package decorator;

public class Bubble extends MilkTeaDecorator{
    protected Bubble(MilkTeaInterface milkTeaInterface) {
        super(milkTeaInterface);
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }
}
