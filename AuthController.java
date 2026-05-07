package controls;

import entities.User;
import java.util.ArrayList;
import java.util.List;

public class AuthController {
    private static List<User> usersList = new ArrayList<>();

    public AuthController() {
        if (usersList.isEmpty()) {
            usersList.add(new User("admin@app.com", "Main Admin", "admin123", true));
        }
    }

    public boolean register(String name, String email, String password, boolean isAdmin) {
        for (User u : usersList) {
            if (u.getEmail().equals(email)) {
                System.out.println("Error: Email already exists.");
                return false;
            }
        }
        usersList.add(new User(email, name, password, isAdmin));
        System.out.println("Welcome " + name);
        return true;
    }

    public User login(String email, String password) {
        for (User u : usersList) {
            if (u.verifyCardentials(email, password)) return u;
        }
        return null;
    }

    public void displayAllUsers() {
        System.out.println("\n--- Registered Users ---");
        for (User u : usersList) {
            System.out.println("- Name: " + u.getName() + " | Email: " + u.getEmail() + " | Admin: " + u.isAdmin());
        }
    }
}