import entities.User;
import entities.Budget;
import controls.AuthController;
import controls.FinanceManager;
import boundries.DashBoard;
import boundries.LoginScreen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AuthController auth = new AuthController();
        FinanceManager finance = new FinanceManager();
        Budget userBudget = new Budget(0);
        DashBoard db = new DashBoard();
        LoginScreen loginScreen = new LoginScreen();

        boolean exitApp = false;
        User loggedInUser = null;

        while (!exitApp) {
            if (loggedInUser == null) {
                System.out.println("\n==== FINANCE APP ====\n1. Register\n2. Login\n3. Exit");
                System.out.print("> Selection: ");
                int choice = input.nextInt();
                input.nextLine();

                if (choice == 1) {
                    System.out.print("Name: "); String name = input.nextLine();
                    System.out.print("Email: "); String email = input.nextLine();
                    System.out.print("Password: "); String pass = input.nextLine();
                    System.out.print("Admin? (y/n): "); String isAdminStr = input.nextLine();

                    boolean isAdmin = false;

                    if (isAdminStr.equalsIgnoreCase("y")) {
                        System.out.print("Secret Key: ");
                        if (input.nextLine().equals("556677")) {
                            isAdmin = true;
                        }
                    }
                    auth.register(name, email, pass, isAdmin);
                } else if (choice == 2) {
                    
                    loginScreen.displayLogin();

                    System.out.print("Email: "); String email = input.nextLine();
                    System.out.print("Password: "); String pass = input.nextLine();
                    loggedInUser = auth.login(email, pass);

                    if (loggedInUser != null) {
                        System.out.println("Welcome " + loggedInUser.getName());
                        
                        loginScreen.redirectToDashboard();
                    } else {
                        
                        loginScreen.showErrorMessage();
                    }
                } else if (choice == 3) {
                    exitApp = true;
                }
            } else {
                if (loggedInUser.isAdmin()) {
                    System.out.println("\n==== ADMIN MENU ====\n1. View Users\n2. Logout");
                    System.out.print("> Selection: ");
                    int adminAct = input.nextInt();
                    input.nextLine();

                    if (adminAct == 1) {
                        auth.displayAllUsers();
                    } else if (adminAct == 2) {
                        loggedInUser = null;
                    }
                } else {
                    System.out.println("\n==== USER DASHBOARD ====");
                    System.out.println("1. View Dashboard Status\n2. Add Expense\n3. Add Income\n4. Set Budget Limit\n5. Set Goal\n6. Edit/Delete Transactions\n7. Logout");
                    System.out.print("> Selection: ");
                    int action = input.nextInt();
                    input.nextLine();

                    switch (action) {
                        case 1:
                            
                            db.refreshDisplay();
                            System.out.println("Current Total Balance: " + finance.getBalance());
                            System.out.println("Current Budget Limit: " + userBudget.getMonthlyLimit());
                            System.out.println("Remaining Budget: " + userBudget.calcRemaining());
                            db.displayChartsAndInsights();
                            break;
                        case 2:
                            System.out.print("Amount: "); double exp = input.nextDouble();
                            input.nextLine();
                            System.out.print("Category: "); String cat = input.nextLine();

                            
                            finance.addExpense(exp, cat, "2024-05-08", userBudget);

                            if (userBudget.checkAlert()) {
                                System.out.println("!! ALERT: BUDGET EXCEEDED !!");
                            }
                            break;
                        case 3:
                            System.out.print("Amount: "); double inc = input.nextDouble();
                            input.nextLine();
                            System.out.print("Source: "); String src = input.nextLine();

                            
                            finance.addIncome(inc, src, "2024-05-08");
                            break;
                        case 4:
                            System.out.print("Enter Monthly Limit: ");
                            userBudget.setLimit(input.nextDouble());
                            break;
                        case 5:
                            System.out.print("Goal Name: "); String gName = input.nextLine();
                            System.out.print("Target Amount: "); double t = input.nextDouble();

                            
                            finance.createGoal(gName, t, "2025-01-01", 0);
                            break;
                        case 6:
                            System.out.println("\n--- Manage Transactions ---");
                            finance.displayTransactions();
                            System.out.print("Enter number to delete (0 to cancel): ");
                            int idx = input.nextInt() - 1;
                            if (idx >= 0) {
                                finance.deleteTransaction(idx, userBudget);
                            }
                            break;
                        case 7:
                            loggedInUser = null;
                            break;
                    }
                }
            }
        }
        System.out.println("System Closed.");
        input.close();
    }
}
