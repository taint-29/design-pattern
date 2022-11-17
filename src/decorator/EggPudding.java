package decorator;

public class EggPudding extends MilkTeaDecorator{
    protected EggPudding(MilkTeaInterface milkTeaInterface) {
        super(milkTeaInterface);
    }

    @Override
    public double cost() {
        return super.cost() + 3;
    }
}
