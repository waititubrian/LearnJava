import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[][][] numbers = new int[2][3][4];
        numbers [0][0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        // Implicit casting
        // byte -> short -> int -> long -> float -> double
        double x = 1.1;
        int y = (int)x + 2;
        System.out.println(y);

//        Integer.parseInt(); //int
//        Short.parseShort(); //short
//        Long.parseLong(); //long
//        Float.parseFloat(); //float
//        Double.parseDouble(); //double
        String a = "1";
        int b = Integer.parseInt(a) + 2;
        System.out.println(b);

        String c = "1.1";
        float d = Float.parseFloat(c) + 2;
        System.out.println(d);

        // The Math Class
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1F); // Greater than or equal to 1.1
        System.out.println(result2);

        int result3 = (int)Math.floor(1.1F); // Less than or equal to 1.1

        int result4 = Math.max(4, 7);
        System.out.println(result4);

        int result5 = Math.min(1, 2);
        System.out.println(result5);

        int result6 = (int)(Math.random() * 100);
        System.out.println(result6);

        double result7 = Math.round(Math.random() * 100);
        System.out.println(result7);
    }
}