class Computer{
    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";

        return "Nothing";
    }
}
public class ClassAndObjectTheory {

    public static void main(String args []){

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);

        String greeting = "HelloHelloHello";
        int greetLength = greeting.length();
        int number = 4;
//        int total = greetLength + number;
        int total = add(greetLength, number);
        System.out.println(total);
        System.out.println(">>>>>>>>>>>>>>>>>>");

        for(int i = 0; i < greetLength; i++){
            System.out.println(greeting.charAt(i));
        }

        int likes =4035;
        int dislikes =4053;
        double total2 = ratio(likes, dislikes);
        System.out.println(total2);
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static double ratio (int likes, int dislikes){
        if(likes + dislikes == 0) {
            return 0;
        }
        return Math.round((double) likes / (likes + dislikes) * 100);
    }
}
