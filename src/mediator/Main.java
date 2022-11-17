package mediator;

public class Main {
    /**
     * Mediator có nghĩa là người trung gian. Pattern này nói rằng “Định nghĩa một đối tượng gói gọn cách một tập hợp các đối tượng tương tác.
     * Mediator thúc đẩy sự khớp nối lỏng lẻo (loose coupling) bằng cách ngăn không cho các đối tượng đề cập đến nhau một cách rõ ràng và nó cho phép bạn thay đổi sự tương tác của họ một cách độc lập”.
     *
     * Định nghĩa ra một đối tượng đóng gói hay quy định cách mà các đối tượng sẽ tương tác với nhau:
     * ví dụ khi một server (mediator) nhận được một message thì message đó phải có người nhận, và server sẽ gửi message này đến đúng người nhận đó
     *
     */
    public static void main(String[] args) {

        ChatMediator chatMediator = new ChatMediatorImpl("Tai-hehe");
        User user1 = new UserImpl(chatMediator,"student 1");
        User user2 = new UserImpl(chatMediator,"student 2");
        User user3 = new UserImpl(chatMediator,"student 3");
        User teacher = new UserImpl(chatMediator,"teacher 3");

        // add user to mediator
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(teacher);

        teacher.send("Hi student!");
        user1.send("Hi you teacher");

    }
}
