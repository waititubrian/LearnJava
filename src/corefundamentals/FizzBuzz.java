import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args){
        // Enter a number: If this a number is divisible by 5 we get Fizz
        // divisible by 10 we get Fizz
        // divisible by 3 we get Buzz,
        // divisible by 5 & 3 we get FizzBuzz,
        // not divisible by 5 & 3 we get the same number printed on terminal

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0){
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (number % 10 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");

        else
            System.out.println(number);

        //////////////////////////////////////////

//        if (number % 3 == 0 && number % 5 == 0)
//            System.out.println("FizzBuzz");
//        else if (number % 5 == 0 || number % 10 == 0)
//            System.out.println("Fizz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//
//        else
//            System.out.println(number);
    }
}
