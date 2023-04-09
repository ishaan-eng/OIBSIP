import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private static ArrayList<Transaction> transactionHistory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int userId = 1234;
    private static int userPin = 5678;
    private static double balance = 1000;

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");

        // Prompt user for user id and pin
        System.out.print("Enter your user id: ");
        int enteredUserId = scanner.nextInt();
        System.out.print("Enter your pin: ");
        int enteredUserPin = scanner.nextInt();

        // Check if user id and pin match
        if (enteredUserId == userId && enteredUserPin == userPin) {
            System.out.println("Login successful!");

            // Display main menu
            while (true) {
                System.out.println("\nMain Menu");
                System.out.println("1. Transactions History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                System.out.print("\nEnter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        viewTransactionHistory();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        deposit();
                        break;
                    case 4:
                        transfer();
                        break;
                    case 5:
                        System.out.println("Thanks for using the ATM!");
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Login failed, please try again.");
        }
    }

    private static void viewTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawal successful, current balance is " + balance);
        } else {
            System.out.println("Insufficient funds, withdrawal failed.");
        }
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
        System.out.println("Deposit successful, current balance is " + balance);
    }

    private static void transfer() {
        System.out.print("Enter recipient user id: ");
        int recipientId = scanner.nextInt();

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Transfer to user " + recipientId, amount));
            System.out.println("Transfer successful, current balance is " + balance);
        } else {
            System.out.println("Insufficient funds, transfer failed.");
        }
    }

    private static class Transaction {
        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return type + " of " + amount;
        }
    }
}
