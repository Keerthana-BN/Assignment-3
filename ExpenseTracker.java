import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the maximum number of expenses
        int maxExpenses = 100;
        double[] expenses = new double[maxExpenses];
        int expenseCount = 0;
        
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Expense Tracker Menu:");
            System.out.println("1. Add an Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    if (expenseCount < maxExpenses) {
                        System.out.print("Enter the expense amount: ");
                        double expenseAmount = scanner.nextDouble();
                        expenses[expenseCount] = expenseAmount;
                        expenseCount++;
                        System.out.println("Expense added successfully!");
                    } else {
                        System.out.println("Expense limit reached!");
                    }
                    break;
                case 2:
                    if (expenseCount > 0) {
                        System.out.println("All Expenses:");
                        for (int i = 0; i < expenseCount; i++) {
                            System.out.println("Expense " + (i + 1) + ": $" + expenses[i]);
                        }
                    } else {
                        System.out.println("No expenses added yet!");
                    }
                    break;
                case 3:
                    double totalExpenses = 0;
                    for (int i = 0; i < expenseCount; i++) {
                        totalExpenses += expenses[i];
                    }
                    System.out.println("Total Expenses: $" + totalExpenses);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        scanner.close();
    }
}