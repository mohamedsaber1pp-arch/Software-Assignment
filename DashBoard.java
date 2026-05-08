package boundries;

/**
 * Boundary class representing the main application dashboard.
 * Provides the visual representation of financial data, including transaction lists,
 * progress bars for budgets, and analytical charts.
 * * @author OurTeam
 * @version 1.0
 */
public class DashBoard {

    /**
     * Default constructor for the DashBoard class.
     */
    public DashBoard() {}

    /**
     * Fetches and displays a summarized list of the most recent financial activities.
     */
    public void showRecentTransaction() {
        System.out.println("Displaying recent transactions on the dashboard...");
    }

    /**
     * Triggers a visual alert message to the user.
     * Often used for system notifications or budget limit warnings.
     * * @param message The text content of the alert to be displayed.
     */
    public void showAlert(String message) {
        System.out.println("ALERT: " + message);
    }

    /**
     * Updates the visual progress bar to reflect current budget usage.
     * * @param percentage The completion percentage to be visualized (e.g., 75.5).
     */
    public void updateProgressBar(double percentage) {
        System.out.println("Progress Bar updated to: " + percentage + "%");
    }

    /**
     * Orchestrates the rendering of complex data visualizations and financial 
     * trend summaries.
     */
    public void displayChartsAndInsights() {
        System.out.println("Loading charts and financial insights...");
    }

    /**
     * Force-reloads the dashboard components to ensure the UI matches the 
     * latest back-end data.
     */
    public void refreshDisplay() {
        System.out.println("Dashboard refreshed.");
    }
}
