package decorator;

public class Main {

    /**
     *
     *Mục đích: Mở rộng tính năng của một object tại run-time, decorator cung cấp một sự thay thế linh hoạt cho subclass để mở rộng tính năng của object
     */
    public static void main(String[] args) {

        EggPudding ourMilkTea = new EggPudding(
                new FruitPudding(
                        new BlackSugar(
                                new Bubble(
                                        new MilkTea()))));
        System.out.println(ourMilkTea.cost());


    }
}
