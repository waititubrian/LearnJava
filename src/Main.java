class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        byte by = 127;
        short sh = 558;
        long l = 5854l;

        float marks = 6.5f;
        double marks2 = 6.5;

        char c = 'k';
        System.out.println(c);

        boolean b = true;
        System.out.println(!b);

        // Integer Literals - Are numeric values (associated with numbers) without any fractional or exponential part.
        // binary(base 2)
        int binaryNumber = 0b101;  // 0b represents binary
        System.out.println(binaryNumber);
        int num5 = 0b10010;
        System.out.println(num5);
        // octal(base8)
        int octalNumber = 027;
        System.out.println(octalNumber);
        // decimal(base 10)
        int decNumber = 34;
        System.out.println(decNumber);
        // hexadecimal(base 16)
        int hexNumber = 0x2F; // 0x represents hexadecimal
        System.out.println(hexNumber);
        System.out.println(">>>>>>>>>>>>>>");

        // Floating-point Literals - Are numeric literals that have either a fractional form or an exponential form
        double myDouble = 3.4;
        float myFloat = 3.4F;

        // 3.445*10^2
        double myDoubleScientific = 3.445e2;

        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println("Is: " + myDoubleScientific);

        double num3 = 12e10;
        System.out.println(num3);
    }
}
