package entities;

/**
 * Entity class representing a positive financial inflow (Income).
 * Implements the {@code Transaction} interface to provide standard 
 * recording and retrieval behaviors for income-specific data.
 * * @author OurTeam
 * @version 1.0
 */
public class Income implements Transaction {
    private double amount;
    private String source;
    private String date;

    /**
     * Constructs a new Income record with the specified financial details.
     * * @param amount The monetary value of the income.
     * @param source The origin of the funds (e.g., "Salary", "Gift").
     * @param date The date the income was received.
     */
    public Income(double amount, String source, String date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

    /**
     * Executes the logic to register the income record within the system.
     */
    @Override
    public void addTransaction() {
        System.out.println("[System] Income added: +" + amount);
    }

    /**
     * Removes the specific income entry from the system records.
     */
    @Override
    public void deleteTransaction() {
        System.out.println("[System] Income entry deleted.");
    }

    /**
     * Displays the full details of the income record, including amount, 
     * source, and date.
     */
    @Override
    public void getTransaction() {
        System.out.println("Income: " + amount + " | Source: " + source + " | Date: " + date);
    }

    /**
     * Retrieves the monetary value of this income record.
     * * @return The double value of the income amount.
     */
    public double getAmount() {
        return amount;
    }
}
