public class MathClass {
    public static void main (String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1F); // Greater than or equal to 1.1
        System.out.println(result2);

        int result3 = (int)Math.floor(1.1F); // Less than or equal to 1.1
        System.out.println(result3);

        int result4 = Math.max(4, 7);
        System.out.println(result4);

        int result5 = Math.min(1, 2);
        System.out.println(result5);

        int result6 = (int)(Math.random() * 100);
        System.out.println(result6);

        double result7 = Math.round(Math.random() * 100);
        System.out.println(result7);

        int result15 = (int)Math.round(Math.random() * 100);
        System.out.println(result15);

        float f = 5.6F;
//        int x = (int)f;
        int x = (int)(Math.round(f));
        System.out.println(x);

        byte d = 127;
        int c = d;
        System.out.println(c);

        int e = 257;
        byte g = (byte)e;
        System.out.println(g);

        int result8 = Math.round(1.1F);
        System.out.println(result8);

        int result9 = (int)Math.ceil(1.1F);
        System.out.println(result9);

        int result10 = (int)Math.floor(1.1F);
        System.out.println(result10);

        int result11 = Math.max(4, 7);
        System.out.println(result11);

        int result12 = Math.min(1, 2);
        System.out.println(result12);
    }
}
