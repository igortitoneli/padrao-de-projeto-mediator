import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChatMediatorTest {

    @Test
    void deveEnviarMensagem() {
        ChatMediator mediator = new ChatMediator();

        User u1 = new User("Marco");
        User u2 = new User("Igor");

        mediator.register(u1);
        mediator.register(u2);

        mediator.send("Oi", u1);

        assertTrue(u2.getMessages().contains("Oi"));
    }
}