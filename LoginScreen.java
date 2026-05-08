package boundries;

/**
 * Boundary class representing the authentication interface of the application.
 * Provides the visual feedback and navigation logic for the user login process.
 * * @author OurTeam
 * @version 1.0
 */
public class LoginScreen {

    /**
     * Default constructor for the LoginScreen.
     */
    public LoginScreen() {}

    /**
     * Renders the login interface to the console, prompting the user 
     * to enter their credentials.
     */
    public void displayLogin() {
        System.out.println("Displaying Login Screen...");
    }

    /**
     * Displays a specific feedback message when the provided email 
     * or password does not match system records.
     */
    public void showErrorMessage() {
        System.out.println("Error: Invalid email or password. Please try again.");
    }

    /**
     * Handles the transition from the login interface to the main 
     * application dashboard upon successful authentication.
     */
    public void redirectToDashboard() {
        System.out.println("Login successful! Redirecting to Dashboard...");
    }
}
