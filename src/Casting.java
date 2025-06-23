public class Casting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double

        byte b = 127;
        int a = 257;
        b = (byte)a; // Explicit casting
        a = b; // Implicit casting
        System.out.println(a);
        System.out.println(b);

        //Implicit casting[Automatic Conversion](Happens when compiler automatically converts one d.t to another, i.e from smaller to larger d.t)-->No data loss
        short s = 1;
        int q = s + 2;
        System.out.println(q);

        double t = 1.1;
        double r = t + 2;
        System.out.println(r);

        //Explicit casting[Forced Conversion](Converts a larger d.t to smaller d.t)-->Potential data loss
        double w = 1.1;
        int v = (int)w + 2;
        System.out.println(v);


//        Integer.parseInt(u); //int
//        Short.parseShort(u); //short
//        Float.parseFloat(u); //float
//        Double.parseDouble(u); //double

        String u = "1";

        int p = Integer.parseInt(u) + 2;
        System.out.println(p);

        int k = Short.parseShort(u) + 3;
        System.out.println(k);

        Float l = Float.parseFloat(u) + 4;
        System.out.println(l);

    }
}
