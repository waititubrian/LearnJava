import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ForLoops {
    public static void main (String [] args){
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World!");
        System.out.println();

        for (int x = 1; x <= 5; x++)
            System.out.println("Another way of doing it");
        System.out.println();

        for (int x = 1; x <= 5; x++)
            System.out.println("Hello World!" + x);
        System.out.println();

        for (int i = 0; i < 5; i++)
            System.out.println("Hello World!" + i);
        System.out.println();

        for (int i = 5; i > 0; i--)
            System.out.println("Hello World!" + i);
        System.out.println("===============================");

        int V = 2;
        for(int c = 1; c <= 10; c++)
            System.out.println(V + " * " + c + " = " + (V * c));
    }
}
