package day2;

public class TypeCasting {
    public static void main(String[] args) {

//        2 types of TypeCasting - Converting one data type to another
//        Widening Casting

//        byte = > short => char => int => long => float => double

        byte a = 120;
        System.out.println(a);
        int b=a;
        System.out.println(b);

//        Narrowing Casting

//        double => float => long => int => char = > short = > byte

        int number = 100;
        byte byteValue = (byte)number;
        short shortValue = (short)number;


        float floatValue = 12.345f;
        int inValue = (int) floatValue;
        System.out.println(inValue);

        short shortValue2 = 4523;
        double doubleValue = shortValue2;
        System.out.println(doubleValue);






    }
}
