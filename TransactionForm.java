package boundries;

/**
 * Boundary class representing the user interface for entering new transactions.
 * Facilitates data collection from the user and handles UI navigation logic.
 * * @author OurTeam
 * @version 1.0
 */
public class TransactionForm {

    /**
     * Default constructor for the TransactionForm.
     */
    public TransactionForm() {}

    /**
     * Extracts and aggregates data from the form's input fields (Amount, Category, Date).
     * * @return A {@code String} representing the collected sample data for processing.
     */
    public String getInputData() {
        System.out.println("Getting data from input fields...");
        return "Sample Data";
    }

    /**
     * Displays the available budget categories to the user to ensure valid selection.
     */
    public void showCategoryList() {
        System.out.println("Showing categories: Food, Transport, Bills...");
    }

    /**
     * Navigates the user back to the main dashboard (AppInterface) upon 
     * successful transaction submission or cancellation.
     */
    public void redirectToAppInterface() {
        System.out.println("Redirecting to the main app interface...");
    }

    /**
     * Displays a specific error message to the user when input validation fails.
     * * @param message The error description to be displayed on the UI.
     */
    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}
