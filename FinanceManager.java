package controls;

// تم إلغاء الاستيراد بالنجمة واستخدام الاستيراد الصريح
import entities.Transaction;
import entities.Income;
import entities.Expense;
import entities.Budget;
import java.util.ArrayList;
import java.util.List;

public class FinanceManager {
    private double currentBalance = 0;
    private List<Transaction> history = new ArrayList<>();

    // تعديل الاسم
    public void addIncome(double amount, String src, String date) {
        Income inc = new Income(amount, src, date);
        history.add(inc);
        currentBalance += amount;
        inc.addTransaction();
    }

    // تعديل الاسم
    public void addExpense(double amount, String cat, String date, Budget budget) {
        Expense exp = new Expense(amount, cat, date);
        history.add(exp);
        currentBalance -= amount;
        budget.updateSpent(amount);
        exp.addTransaction();
    }

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

    public double getBalance() {
        return currentBalance;
    }

    // تعديل الاسم
    public void createGoal(String name, double target, String deadline, double initial) {
        System.out.println("Goal created: " + name + " | Target: " + target);
    }
}