package controls;

public interface FinanceService {
    void add_income(double amount, String category, String date);

    void add_expense(double amount, String category, String date);

    void update_balance();
        public default void create_goal(String name, double target, String deadline, double initial) {
        System.out.println("New financial goal created: " + name);
        System.out.println("Target: " + target + " | Initial Saved: " + initial + " | Deadline: " + deadline);
    }
}
