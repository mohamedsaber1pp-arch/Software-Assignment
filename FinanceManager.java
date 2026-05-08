package controls;

import entities.Transaction;
import entities.Income;
import entities.Expense;
import entities.Budget;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller class responsible for managing the core financial logic of the application.
 * It handles the creation, deletion, and tracking of transactions, while 
 * maintaining the user's current balance and history.
 * * @author OurTeam
 * @version 1.0
 */
public class FinanceManager {
    private double currentBalance = 0;
    private List<Transaction> history = new ArrayList<>();

    /**
     * Records a new income entry, updates the balance, and adds it to the history.
     * * @param amount The monetary value received.
     * @param src The source of the income.
     * @param date The date the income was recorded.
     */
    public void addIncome(double amount, String src, String date) {
        Income inc = new Income(amount, src, date);
        history.add(inc);
        currentBalance += amount;
        inc.addTransaction();
    }

    /**
     * Records a new expense entry, updates the current balance, and adjusts the budget.
     * * @param amount The monetary value spent.
     * @param cat The category of the expense.
     * @param date The date of the transaction.
     * @param budget The specific Budget object to be updated with this spending.
     */
    public void addExpense(double amount, String cat, String date, Budget budget) {
        Expense exp = new Expense(amount, cat, date);
        history.add(exp);
        currentBalance -= amount;
        budget.updateSpent(amount);
        exp.addTransaction();
    }

    /**
     * Iterates through the history list and prints all recorded transactions 
     * to the console.
     */
    public void displayTransactions() {
        if (history.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        for (int i = 0; i < history.size(); i++) {
            System.out.print((i + 1) + ". ");
            history.get(i).getTransaction();
        }
    }

    /**
     * Removes a transaction from the history based on its index and reverts 
     * its impact on the balance and budget.
     * * @param index The position of the transaction in the history list (0-based).
     * @param budget The Budget object to be adjusted if an expense is deleted.
     */
    public void deleteTransaction(int index, Budget budget) {
        if (index < 0 || index >= history.size()) {
            return;
        }
        Transaction t = history.remove(index);
        if (t instanceof Expense) {
            currentBalance += ((Expense) t).getAmount();
            budget.restoreSpent(((Expense) t).getAmount());
        } else if (t instanceof Income) {
            currentBalance -= ((Income) t).getAmount();
        }
        t.deleteTransaction();
    }

    /**
     * Retrieves the user's current overall balance.
     * * @return The double value of the current account balance.
     */
    public double getBalance() {
        return currentBalance;
    }

    /**
     * Initializes a new financial goal within the system.
     * * @param name The name of the goal.
     * @param target The target monetary amount.
     * @param deadline The target completion date.
     * @param initial The starting balance for the goal.
     */
    public void createGoal(String name, double target, String deadline, double initial) {
        System.out.println("Goal created: " + name + " | Target: " + target);
    }
}
