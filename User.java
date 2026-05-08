package entities;

/**
 * Represents a user within the Personal Budgeting Software.
 * This entity stores authentication details and determines user privileges.
 * * @author [Your Name]
 * @version 1.0
 */
public class User {
    private String email;
    private String fullnames;
    private String password;
    private boolean isAdmin;

    /**
     * Constructs a new User with the specified details.
     * * @param email The unique email address used for login.
     * @param fullnames The user's complete name.
     * @param password The user's account password.
     * @param isAdmin Boolean flag indicating if the user has administrative rights.
     */
    public User(String email, String fullnames, String password, boolean isAdmin) {
        this.email = email;
        this.fullnames = fullnames;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**
     * Verifies user login attempts by comparing provided credentials 
     * with the stored email and password.
     * * @param email The email address entered by the user.
     * @param password The password entered by the user.
     * @return {@code true} if both email and password match stored data; 
     * {@code false} otherwise.
     */
    public boolean verifyCardentials(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    /**
     * Retrieves the user's email address.
     * @return The string representation of the user email.
     */
    public String getEmail() { return email; }

    /**
     * Retrieves the user's full names.
     * @return The string representation of the user's full names.
     */
    public String getName() { return fullnames; }

    /**
     * Checks if the user has administrative privileges.
     * @return {@code true} if the user is an admin; otherwise {@code false}.
     */
    public boolean isAdmin() { return isAdmin; }
}
