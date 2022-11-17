package strategy;

public class DefensiveBehaviour implements Behaviour{
    @Override
    public void moveCommand() {
        System.out.println("Phòng thủ: Nếu có bất kì mối nguy hiểm nào");
    }
}
