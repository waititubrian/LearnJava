import java.util.Scanner;

public class HackerRank01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: "); // Prompt the user for input
        int N = scanner.nextInt();
        scanner.close();

        // N is odd
        if (N % 2 != 0)
            System.out.println("Weird");
        // N is even
        else if (N >= 2 && N <= 5)
            System.out.println("Not Weird");
        else if (N >= 6 && N <= 20)
            System.out.println("Weird");
        else if (N > 20)
            System.out.println("Not Weird");
    }
}

