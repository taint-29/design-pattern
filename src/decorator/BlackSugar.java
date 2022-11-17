package decorator;

public class BlackSugar extends MilkTeaDecorator{
    protected BlackSugar(MilkTeaInterface milkTeaInterface) {
        super(milkTeaInterface);
    }

    @Override
    public double cost() {
        return super.cost() + 4;
    }
}
