package app.dataprovider;

import app.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class UserDataProvider {
    public Supplier<List<User>> provideUserList = () -> {
        List<User> users = new ArrayList<>();
        users.add(new User("John Smith", "+5557778"));
        users.add(new User("Mary Rose", "+1234567"));
        users.add(new User("Ivan Petrenko", "+5872351"));
        users.add(new User("Bob Alisson", "+2377651"));
        users.add(new User("Alice Robertson", "+9583812"));
        return users;
    };
}
