public class IfStatements {
    public static void main(String[] args){
        int x = 5;
        int y = 7;
        int z = 2;
        if (x>y && x>z){
            System.out.println(x);
        }
        else if(y>z){
            System.out.println(y);
        }
        else
            System.out.println(z);

        System.out.println(">>>>>>>>>>>>>>>>>>");

        int temp = 50;
        if (temp > 30) {
            System.out.println("It's a hot day\nDrink plenty of water");}
        else if (temp > 20 && temp <=30)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");
    }
}
