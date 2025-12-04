import java.util.ArrayList;
import java.util.List;

public class ChatMediator {
    private final List<User> users = new ArrayList<>();

    public void register(User user) {
        users.add(user);
        user.setMediator(this);
    }

    public void send(String message, User from) {
        for (User u : users) {
            if (u != from) {
                u.receive(message);
            }
        }
    }
}
