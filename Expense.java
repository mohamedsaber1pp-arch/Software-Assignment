package entities;

/**
 * Entity class representing a financial outflow (Expense).
 * Implements the {@code Transaction} interface to provide standardized 
 * management and tracking of user spending across different categories.
 * * @author OurTeam
 * @version 1.0
 */
public class Expense implements Transaction {
    private double amount;
    private String category;
    private String date;

    /**
     * Constructs a new Expense record with the specified financial details.
     * * @param amount The monetary value of the expense.
     * @param category The spending category (e.g., "Food", "Transport").
     * @param date The date the expense was incurred.
     */
    public Expense(double amount, String category, String date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    /**
     * Executes the logic to record the expense within the system.
     */
    @Override
    public void addTransaction() {
        System.out.println("[System] Expense added: -" + amount);
    }

    /**
     * Removes the specific expense entry from the system records.
     */
    @Override
    public void deleteTransaction() {
        System.out.println("[System] Expense entry deleted.");
    }

    /**
     * Displays the full details of the expense record, including amount, 
     * category, and date.
     */
    @Override
    public void getTransaction() {
        System.out.println("Expense: " + amount + " | Category: " + category + " | Date: " + date);
    }

    /**
     * Retrieves the monetary value of this expense.
     * * @return The double value of the expense amount.
     */
    public double getAmount() {
        return amount;
    }
}
