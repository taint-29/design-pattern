package decorator;

public class FruitPudding extends MilkTeaDecorator{

    protected FruitPudding(MilkTeaInterface milkTeaInterface) {
        super(milkTeaInterface);
    }

    @Override
    public double cost() {
        return super.cost() + 2;
    }
}
