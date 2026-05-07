package boundries;

public class TransactionForm {
    public TransactionForm() {}

    public String getInputData() {
        System.out.println("Getting data from input fields...");
        return "Sample Data";
    }

    public void showCategoryList() {
        System.out.println("Showing categories: Food, Transport, Bills...");
    }

    public void redirectToAppInterface() {
        System.out.println("Redirecting to the main app interface...");
    }

    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}