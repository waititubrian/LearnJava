package oop.bas;

public class SavingsAccount extends BankAccount {
    private double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        deposit(interest);  // reuse deposit method
        System.out.println("Interest applied: " + interest);
    }
}

