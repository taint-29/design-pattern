package command;

import java.util.ArrayList;
import java.util.List;

// invoker
public class Agent {
    private List<Order> orders;

    public Agent() {
        this.orders = new ArrayList<>();
    }

    public Agent(List<Order> orders) {
        this.orders = orders;
    }

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrder(){
        for (Order order : orders){
            order.execute();
        }
        orders.clear();
    }
}
