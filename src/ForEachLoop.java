public class ForEachLoop {
    public static void main(String [] args){
        // Used to iterate over arrays or collections
        String [] fruits = {"Apples", "Mango", "Orange"};
        System.out.println(fruits.length);

        // Using For Loop to print each fruit in a new line
        for ( int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        System.out.println();

        // Using For Each Loop to print each fruit in a new line
        for (String fruit : fruits)
            System.out.println(fruit);
        System.out.println();

        // Since For Each Loop is always forward only we cannot iterate an array backwards(From the end to the beginning)
        // We can do this with a For Loop
        for ( int i = fruits.length-1; i >= 0; i--)
            System.out.println(fruits[i]);
        System.out.println();

        // For Loop doesn't have access to index of each item
    }
}
