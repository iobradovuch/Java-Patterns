package ua.iobradovuch.lab5;

public class User {
    private String username;
    private String email;
    private String password;
    private String address;

    public User(String username, String email, String password, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public void processUser() {
        System.out.println("Processing user: " + username);
        if (isAdmin()) {
            System.out.println("Admin user detected!");
        }
    }

    public boolean isAdmin() {
        return username.contains("admin");
    }
}
