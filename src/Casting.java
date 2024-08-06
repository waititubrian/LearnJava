public class Casting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        byte b = 127;
        int a = 12;
        b = (byte)a; // Explicit casting
        a = b; // Implicit casting
        System.out.println(a);
        System.out.println(b);

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

    }
}
