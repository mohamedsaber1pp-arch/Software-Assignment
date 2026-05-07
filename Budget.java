package entities;

public class Budget {
    private double monthlyLimit;
    private double spentAmount;

    public Budget(double limit) {
        this.monthlyLimit = limit;
        this.spentAmount = 0;
    }

    public void setLimit(double limit) {
        this.monthlyLimit = limit;
    }

    public double getMonthlyLimit() {
        return monthlyLimit;
    }

    public double getSpentAmount() {
        return spentAmount;
    }

    public double calcRemaining() {
        return monthlyLimit - spentAmount;
    }

    
    public void updateSpent(double amount) {
        this.spentAmount += amount;
    }

    public void restoreSpent(double amount) {
        this.spentAmount -= amount;
    }

    public boolean checkAlert() {
        return spentAmount > monthlyLimit && monthlyLimit > 0;
    }
}
