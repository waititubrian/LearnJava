import java.text.NumberFormat;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        String result4 = NumberFormat.getCurrencyInstance().format(1234567.891);
        System.out.println(result4);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);

       String result3 =  NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);

        System.out.println("================================");

        // Java's System.out.printf function can be used to print formatted output.
        Scanner sc=new Scanner(System.in);
        String s1;
        int x;

        // Loop until a valid string is entered
        while (true) {
            System.out.print("Enter a string (max 10 characters): ");
            s1 = sc.next();
            if (s1.length() <= 10)
                break;  // Exit loop if string length is valid
            else
                System.out.println("Error: String must be 10 characters or less.");
        }

        // Loop until a valid integer is entered
        while (true) {
            System.out.print("Enter an integer (0-999): ");
            x = sc.nextInt();
            if (x >= 0 && x <= 999)
                break;  // Exit loop if integer is in the valid range
            else
                System.out.println("Error: Integer must be between 0 and 999.");
        }

        // Print the formatted output
        System.out.printf("Formatted Output: %-15s%03d%n", s1, x);
    }
}
