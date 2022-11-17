package strategy;

import java.lang.annotation.RetentionPolicy;

public class Main {

    /**
     * Định nghĩa ra một tập hợp các đối tượng đại diện cho các hành động cần thực hiện, các đối tượng này thường là những đối tượng xử lý thuật toán phức tạp
     * Cho phép thay đổi liên tục các hành động mà không cần tác động đến lớp sử dụng
     * Cho phép dễ dàng thay đổi và mở rộng các lớp hành động mà không cần phải thay đổi lớp sử dụng
     * @param args
     */
    public static void main(String[] args) {
        Robot robot1 = new Robot("Big Boss");
        Robot robot2 = new Robot("Mini Boss");
        Robot robot3 = new Robot("Minion");

        robot1.setBehaviour(new AggressiveBehaviour());
        robot2.setBehaviour(new DefensiveBehaviour());
        robot3.setBehaviour(new NormalBehaviour());

        robot1.move();
        robot2.move();
        robot3.move();

        System.out.println("\r\nCác hành động tiếp theo: " +
                "\r\n\t'Big Boss' đã cảm thấy sợ hãi vì nó yếu hơn và không đủ sức tấn công nữa" +
                "\r\n\t'Mini Boss' cảm thấy phát điên sau khi nạp đủ năng lượng" +
                "\r\n\tvà 'Minion' ở một vị trí rất xa nên không vấn đề gì\r\n");

        System.out.println("-------------------------------------------");

        robot1.setBehaviour(new DefensiveBehaviour());
        robot2.setBehaviour(new AggressiveBehaviour());

        robot1.move();
        robot2.move();
    }

}
