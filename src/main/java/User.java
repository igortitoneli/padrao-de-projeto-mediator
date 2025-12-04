import java.util.ArrayList;
import java.util.List;

public class User {
    private ChatMediator mediator;
    private final String name;
    private List<String> messages = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message, User to) {
        to.receive(message);
        mediator.send(message, this);
    }

    public void receive(String message) {
        this.messages.add(message);
    }

    public List<String> getMessages() {
        return this.messages;
    }
}
