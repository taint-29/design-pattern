package strategy;

public class NormalBehaviour implements Behaviour{
    @Override
    public void moveCommand() {
        System.out.println("Tiếp tục di chuyển: Nếu không có bất cứ mỗi nguy hiểm nào");
    }
}
