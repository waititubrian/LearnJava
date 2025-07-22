package oop.bas;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        int type;
        while (true) {
            System.out.println("1. Savings");
            System.out.println("2. Checking");
            System.out.print("Choose account type (1 or 2): ");
            String input = scanner.nextLine();

            try {
                type = Integer.parseInt(input);
                if (type == 1 || type == 2) {
                    break; // valid input
                } else {
                    System.out.println("Invalid option. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accHolder = scanner.nextLine();

        if (type == 1) {
            account = new SavingsAccount(accNum, accHolder);
        } else{
            account = new CheckingAccount(accNum, accHolder);
        }

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Details");
            if (account instanceof SavingsAccount) {
                System.out.println("4. Apply Interest");
            }
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    scanner.nextLine(); // clear buffer
                    account.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    scanner.nextLine(); // clear buffer
                    account.withdraw(withdraw);
                    break;
                case 3:
                    account.displayDetails();
                    break;
                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).applyInterest();
                    } else {
                        System.out.println("Option not available.");
                    }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

