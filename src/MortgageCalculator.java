import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle;
        while (true) {
            System.out.print("Principle: ");
            principle = scanner.nextInt();

            if (principle >= 1000 && principle <= 1000000) {
                break; // Exit the loop if the principal amount is valid
            } else {
                System.out.println("Invalid amount. Please enter a value between 1,000 and 1,000,000.");
            }
        }

        float annualInterest;

        // Continuously prompt for the interest rate until it's valid
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();

            if (annualInterest > 0 && annualInterest <= 30) {
                break; // Exit the loop if the interest rate is valid
            } else {
                System.out.println("Invalid rate. Please enter a value greater than 0 and less than or equal to 30.");
            }
        }

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principle
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
