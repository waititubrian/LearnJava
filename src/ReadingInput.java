import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years old");

        // Consume the leftover newline character
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); //.trim method is used to trim the white spaces that you put before typing your name. If no spaces then [String name = scanner.nextLine()]
        System.out.println("Your name is " + name);

        System.out.println(name +", " + "You are "+ age + " years old.");
    }
}
