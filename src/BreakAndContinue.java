import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true)  // When using While(true) make sure you have a break statement to avoid infinite
        {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;  // Moves control to the beginning of the loop
//            if (!input.equals("quit"))
//                System.out.println(input);
            if (input.equals("quit"))
                break;  // Terminates loop
            System.out.println(input);
        }
    }
}
