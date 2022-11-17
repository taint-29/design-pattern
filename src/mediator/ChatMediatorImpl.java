package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private String groupName;

    public ChatMediatorImpl(String groupName) {
        this.groupName = groupName;
        System.out.println(this.groupName + " group is create");
    }

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        System.out.println(user.name + " joined this group");
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            if (!u.equals(user)) {
                u.receive(msg);
            }
        }
    }
}
