package ua.iobradovuch.lab5;
import java.util.ArrayList;

public class UserListProcessor {
    private ArrayList<User> users;

    public UserListProcessor(ArrayList<User> users) {
        this.users = users;
    }

    public void processUserList() {
        for (User user : users) {
            user.processUser();
        }
    }

    public int countAdminUsers() {
        return (int) users.stream()
                .filter(User::isAdmin)
                .count();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendEmailToUser(User user) {
        // Sending email...
    }
}

