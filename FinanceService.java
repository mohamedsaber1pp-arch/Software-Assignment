package controls;

/**
 * Interface defining the core financial services provided by the application.
 * Establishes a contract for managing transactions, balances, and savings goals.
 * * @author OurTeam
 * @version 1.0
 */
public interface FinanceService {

    /**
     * Records a new income transaction in the system.
     * * @param amount The monetary value to be added.
     * @param category The source or category of the income.
     * @param date The date the income was received.
     */
    void add_income(double amount, String category, String date);

    /**
     * Records a new expense transaction in the system.
     * * @param amount The monetary value to be deducted.
     * @param category The spending category (e.g., Food, Rent).
     * @param date The date the expense occurred.
     */
    void add_expense(double amount, String category, String date);

    /**
     * Updates the user's total balance based on recent transactions.
     */
    void update_balance();

    /**
     * Creates a new financial goal with a default implementation for console logging.
     * * @param name The descriptive name of the goal.
     * @param target The target monetary amount.
     * @param deadline The expected date of completion.
     * @param initial The starting amount already allocated to the goal.
     */
    public default void create_goal(String name, double target, String deadline, double initial) {
        System.out.println("New financial goal created: " + name);
        System.out.println("Target: " + target + " | Initial Saved: " + initial + " | Deadline: " + deadline);
    }
}
