import java.util.Locale;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){
//        for (int i = 5; i > 0; i--)
//            System.out.println("Hello World!" + i);
//        System.out.println();

       // Above program written with a While Loop
        int a = 5;
        while (a > 0) {
            System.out.println("Hello World!" + a);
            a--;
        }

        System.out.println(">>>>>>>>>>>>>>>>>>");

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>");

        // Nested While loop - A while loop that runs inside another while loop
        int i = 1;
        while(i<=4){
            System.out.println("Hi" + i);
            i++;

            int j = 1;
            while(j<=3) {
                System.out.println("Hello" + j);
                j++;
            }
        }
    }
}
