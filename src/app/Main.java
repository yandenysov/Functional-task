package app;

import app.handler.UserDataHandler;
import app.dataprovider.UserDataProvider;

public class Main {
    public static void main(String[] args) {
        UserDataHandler handler = new UserDataHandler();
        handler.handleData(new UserDataProvider().provideUserList.get(), handler.getUserData());
    }
}
