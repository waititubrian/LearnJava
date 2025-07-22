package oop.bas;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit = 100.0;

    public CheckingAccount(String accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

