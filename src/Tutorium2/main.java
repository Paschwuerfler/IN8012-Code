package Tutorium2;

public class main {
    public static void main(String[] args) {
        byte b; // 8 bit
        short s; // 16 bit
        int i; // 32 bit
        long l; // 64 bit

        float f; // 32 bit
        double d; // 64 bit

        char c; // 16 bit

        i = 4;

        System.out.println("Primitive types");
        System.out.println(i);
        increment(i);
        System.out.println(i);
        System.out.println();

        System.out.println("Wrapper types");
        intWrapper iw = new intWrapper();
        iw.x = 4;
        System.out.println(iw.x);
        newIncrement(iw);
        System.out.println(iw.x);


    }

    static void increment(int i) { //This is a call by value
        i++;
        System.out.println("Incremented to " + i);
    }

    static void newIncrement(intWrapper i) { //This is a call by reference
        i.x = i.x + 1;
        System.out.println("Incremented to " + i.x);
    }
}
