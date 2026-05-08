package entities;

/**
 * Entity class representing a long-term financial objective.
 * This class tracks the progress toward a specific monetary target and 
 * provides logic to calculate the achievement percentage.
 * * @author OurTeam
 * @version 1.0
 */
public class FinancialGoal {
    private String goalName;
    private double targetAmount;
    private double currentAmount;
    private String deadline;

    /**
     * Default constructor for the FinancialGoal class.
     */
    public FinancialGoal() {}

    /**
     * Constructs a new FinancialGoal with specified parameters.
     * * @param name The descriptive name of the goal (e.g., "New Laptop").
     * @param target The total monetary amount required to reach the goal.
     * @param deadlines The target date for completing the goal.
     * @param initial The initial amount already saved toward this goal.
     */
    public FinancialGoal(String name, double target, String deadlines, double initial) {
        this.goalName = name;
        this.targetAmount = target;
        this.deadline = deadlines;
        this.currentAmount = initial;
    }

    /**
     * Increases the current saved amount toward the goal.
     * * @param amount The value to be added to the current savings.
     */
    public void updateProgress(float amount) {
        this.currentAmount += amount;
    }

    /**
     * Calculates the progress made toward the target amount as a percentage.
     * * @return A {@code double} representing the percentage of completion (0-100).
     * Returns 0 if the target amount is zero to avoid division by zero.
     */
    public double calcPercentage() {
        
        if (targetAmount > 0) {
            return (currentAmount / targetAmount) * 100;
        }
        return 0;
    }
}
