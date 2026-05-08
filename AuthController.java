package controls;

import entities.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller class responsible for user authentication and account management.
 * Handles the registration of new users, credential verification during login,
 * and maintains a centralized list of registered accounts.
 * * @author OurTeam
 * @version 1.0
 */
public class AuthController {
    private static List<User> usersList = new ArrayList<>();

    /**
     * Constructs an AuthController and initializes the system with a default 
     * administrator account if the user list is empty.
     */
    public AuthController() {
        if (usersList.isEmpty()) {
            usersList.add(new User("admin@app.com", "Main Admin", "admin123", true));
        }
    }

    /**
     * Validates that the provided registration data meets basic requirements.
     * * @param name The user's full name.
     * @param email The user's email address.
     * @param password The user's chosen password.
     * @return {@code true} if all fields are non-empty and valid; {@code false} otherwise.
     */
    public boolean validate_input(String name, String email, String password) {
        if (name == null || name.isEmpty()) return false;
        if (email == null || !email.contains("@")) return false;
        if (password == null || password.length() < 6) return false;
        return true;
    }

    /**
     * Registers a new user in the system after checking for email uniqueness.
     * * @param name The full name of the new user.
     * @param email The email address (used as a unique identifier).
     * @param password The account password.
     * @param isAdmin Boolean flag for administrative privileges.
     * @return {@code true} if registration is successful; {@code false} if the email is taken.
     */
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

    /**
     * Verifies user credentials to grant access to the application.
     * * @param email The login email provided by the user.
     * @param password The login password provided by the user.
     * @return The {@code User} object if credentials are valid; {@code null} otherwise.
     */
    public User login(String email, String password) {
        for (User u : usersList) {
            if (u.verifyCardentials(email, password)) return u;
        }
        return null;
    }

    /**
     * Prints a summary list of all registered users to the console.
     * Primarily used for administrative oversight.
     */
    public void displayAllUsers() {
        System.out.println("\n--- Registered Users ---");
        for (User u : usersList) {
            System.out.println("- Name: " + u.getName() + " | Email: " + u.getEmail() + " | Admin: " + u.isAdmin());
        }
    }
}
