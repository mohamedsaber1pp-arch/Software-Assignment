package boundries;

public class LoginScreen {
    public LoginScreen() {}

    public void displayLogin() {
        System.out.println("Displaying Login Screen...");
    }

    public void showErrorMessage() {
        System.out.println("Error: Invalid email or password. Please try again.");
    }

    public void redirectToDashboard() {
        System.out.println("Login successful! Redirecting to Dashboard...");
    }
}