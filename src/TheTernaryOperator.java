public class TheTernaryOperator {
    public static void main(String[] args){
        int income = 50_000;
        String className = (income > 100_000 ? "First" : "Economy");
        System.out.println(className);
        // Can also be written this way
        System.out.println(income > 100_000 ? "First" : "Economy");

        System.out.println(">>>>>>>>>>>>>>>>>>");

        int n = 5;
        int result = (n%2==0 ? 10 : 20);
        System.out.println(result);
        // Can also be written this way
        System.out.println(n%2==0 ? 10 : 20);


        System.out.println(">>>>>>>>>>>>>>>>>>");

        int x = 5;
        int y = 7;
        int z = 2;

        int numberSize = ((x>y && x>z) ? x : (y>z ? y : z));
        System.out.println(numberSize);
        // Can also be written this way
        System.out.println((x>y && x>z) ? x : (y>z ? y : z));

        System.out.println(">>>>>>>>>>>>>>>>>>");

        int temp = 50;
        System.out.println((temp>30) ? "It's a hot day\nDrink plenty of water" : (temp >20 && temp <=30 ? "It's a nice day" : "It's cold"));


    }
}
