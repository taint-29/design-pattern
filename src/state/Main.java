package state;

public class Main {

    /**
     * State Pattern là một mẫu thiết kế hành vi cho phép một object thay đổi hành vi của nó khi trạng thái bên trong của nó thay đổi.
     * Loại bỏ các câu lệnh xét trường hợp (If, Switch case) giúp đơn giản code của context
     * @param args
     */
    public static void main(String[] args) {

        Player player = new Player();
        System.out.println(player.getState().onPlay());
        System.out.println(player.getState().onLock());
        System.out.println(player.getState().onNext());
        System.out.println(player.getState().onPrevious());

    }
}
