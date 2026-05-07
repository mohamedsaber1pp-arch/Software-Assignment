package entities;

public class Income implements Transaction {
    private double amount;
    private String source;
    private String date;

    public Income(double amount, String source, String date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

    @Override
    public void addTransaction() {
        System.out.println("[System] Income added: +" + amount);
    }

    @Override
    public void deleteTransaction() {
        System.out.println("[System] Income entry deleted.");
    }

    @Override
    public void getTransaction() {
        System.out.println("Income: " + amount + " | Source: " + source + " | Date: " + date);
    }

    public double getAmount() {
        return amount;
    }
}