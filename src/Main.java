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

    }
}