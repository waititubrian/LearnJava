public class IfStatements {
    public static void main(String[] args){
        // If temperatue is greater than 30
        //   It's a hot day
        //   Drink plenty of water
        // Otherwise, if it's between 20 and 30
        //   It's a nice day
        // Otherwise
        //   It's cold
        int temp = 20;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20 && temp <=30)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");
    }
}
