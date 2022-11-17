package composite;

public class Main {

    /**
     * Tách các lớp lớn với nhiều dòng code ra thành các lớp nhỏ với ít dòng code hơn, thuật tiện cho việc đọc hiểu và maintain sau này
     * Đảm bảo mỗi lớp sẽ chỉ thực hiện các các nhiệm vụ riêng việc, tăng khả common (tái sử dụng) code
     * Hạn chế việc thay đổi lớp sử dụng và tăng khả năng mở rộng source code về sau này
     * Tăng khả năng đa thừa kế, đưa ra nhiều sự lựa chọn hơn là chỉ sử dụng extends
     * @param args
     */
    public static void main(String[] args) {
        var phone = new SingleGift("Phone", 256);
        System.out.println("Phone price: " + phone.CalculateTotalPrice());

        //composite gift
        var rootBox = new CompositeGift("RootBox", 0);
        var truckToy = new SingleGift("TruckToy", 289);
        var plainToy = new SingleGift("PlainToy", 587);
        rootBox.add(truckToy);
        rootBox.add(plainToy);
        var childBox = new CompositeGift("ChildBox", 0);
        var soldierToy = new SingleGift("SoldierToy", 200);
        childBox.add(soldierToy);
        rootBox.add(childBox);
        System.out.println("Total price of this composite RootBox present is: " + rootBox.CalculateTotalPrice());
    }
}
