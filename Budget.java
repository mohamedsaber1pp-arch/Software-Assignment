package entities;

/**
 * Entity class responsible for managing user-defined spending limits.
 * Tracks the total amount spent against a monthly ceiling and provides 
 * logical checks for budget violations.
 * * @author OurTeam
 * @version 1.0
 */
public class Budget {
    private double monthlyLimit;
    private double spentAmount;

    /**
     * Constructs a new Budget with a specified limit.
     * * @param limit The maximum amount the user intends to spend in a month.
     */
    public Budget(double limit) {
        this.monthlyLimit = limit;
        this.spentAmount = 0;
    }

    /**
     * Updates the maximum spending ceiling for the budget.
     * * @param limit The new monetary limit to be set.
     */
    public void setLimit(double limit) {
        this.monthlyLimit = limit;
    }

    /**
     * Retrieves the current monthly spending limit.
     * * @return The double value of the monthly limit.
     */
    public double getMonthlyLimit() {
        return monthlyLimit;
    }

    /**
     * Retrieves the total amount spent within this budget period.
     * * @return The double value of the accumulated expenses.
     */
    public double getSpentAmount() {
        return spentAmount;
    }

    /**
     * Calculates the funds remaining before the budget limit is reached.
     * * @return The difference between the monthly limit and the spent amount.
     */
    public double calcRemaining() {
        return monthlyLimit - spentAmount;
    }

    /**
     * Increases the spent amount counter when a new expense is recorded.
     * * @param amount The value of the expense to be added.
     */
    public void updateSpent(double amount) {
        this.spentAmount += amount;
    }

    /**
     * Decreases the spent amount counter (e.g., when an expense is deleted or edited).
     * * @param amount The value to be deducted from the total spent.
     */
    public void restoreSpent(double amount) {
        this.spentAmount -= amount;
    }

    /**
     * Checks if the user has exceeded their defined spending limit.
     * Matches the logic for Use Case 5 (Budget Over-Limit Alert).
     * * @return {@code true} if the spent amount exceeds the limit (and limit is non-zero); 
     * {@code false} otherwise.
     */
    public boolean checkAlert() {
        return spentAmount > monthlyLimit && monthlyLimit > 0;
    }
}
