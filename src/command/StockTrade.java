package command;

public class StockTrade {
    private String name;
    private int quantity;

    public StockTrade(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("You just buy stock");
    }

    public void sell(){
        System.out.println("You just sell stock");
    }

    @Override
    public String toString() {
        return "StockTrade{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
