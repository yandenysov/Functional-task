package app.handler;

import app.user.User;
import app.view.View;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class UserDataHandler {

    private View view;
    public UserDataHandler() {
        this.view = new View();
    }

    public void handleData(List<User> userList, Consumer<User> consumer) {
        for (User user : userList) {
            consumer.accept(user);
        }
    }

    public Consumer<User> getUserData() {
        AtomicInteger count = new AtomicInteger(1);
        return user ->
                view.getOutput(count.getAndIncrement() + ") " +
                        "Name: " + user.getName() + ", Phone: " + user.getPhone());
    }
}
