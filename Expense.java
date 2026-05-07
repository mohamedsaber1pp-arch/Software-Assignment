package entities;

public class Expense implements Transaction {
    private double amount;
    private String category;
    private String date;

    public Expense(double amount, String category, String date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    @Override
    public void addTransaction() {
        System.out.println("[System] Expense added: -" + amount);
    }

    @Override
    public void deleteTransaction() {
        System.out.println("[System] Expense entry deleted.");
    }

    @Override
    public void getTransaction() {
        System.out.println("Expense: " + amount + " | Category: " + category + " | Date: " + date);
    }

    public double getAmount() {
        return amount;
    }
}