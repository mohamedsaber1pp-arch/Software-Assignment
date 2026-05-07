package entities;

public class FinancialGoal {
    private String goalName;
    private double targetAmount;
    private double currentAmount;
    private String deadline;

    public FinancialGoal() {}

    public FinancialGoal(String name, double target, String deadlines, double initial) {
        this.goalName = name;
        this.targetAmount = target;
        this.deadline = deadlines;
        this.currentAmount = initial;
    }

    public void updateProgress(float amount) {
        this.currentAmount += amount;
    }

    public double calcPercentage() {
        // إضافة الأقواس المعقوفة للجملة الشرطية
        if (targetAmount > 0) {
            return (currentAmount / targetAmount) * 100;
        }
        return 0;
    }
}