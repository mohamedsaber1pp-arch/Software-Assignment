package boundries;

public class DashBoard {
    public DashBoard() {}

    
    public void showRecentTransaction() {
        System.out.println("Displaying recent transactions on the dashboard...");
    }

    public void showAlert(String message) {
        System.out.println("ALERT: " + message);
    }

    public void updateProgressBar(double percentage) {
        System.out.println("Progress Bar updated to: " + percentage + "%");
    }

    public void displayChartsAndInsights() {
        System.out.println("Loading charts and financial insights...");
    }

    public void refreshDisplay() {
        System.out.println("Dashboard refreshed.");
    }
}
