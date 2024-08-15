import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String [] args){

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);

        // Do While Loops gets executed at least once
        // Above program written with a Do While Loop
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        }
    }
