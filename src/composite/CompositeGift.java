package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGift extends GiftBase implements GiftOperator{

    private List<GiftBase> giftBaseList = new ArrayList<>();

    public CompositeGift(String name, int price) {
        super(name, price);
    }

    @Override
    public int CalculateTotalPrice() {
//        System.out.println(name + " contains the following products with prices:");

        int sum = 0;
        for (GiftBase giftBase : giftBaseList){
            sum += giftBase.CalculateTotalPrice();
        }
        return sum;
    }

    @Override
    public void add(GiftBase giftBase) {
        giftBaseList.add(giftBase);
    }

    @Override
    public void remove(GiftBase giftBase) {
        giftBaseList.remove(giftBase);
    }
}
