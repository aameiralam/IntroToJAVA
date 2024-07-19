package day2;

public class Loops {
    public static void main(String[] args) {
//        for
//        while
//        do loops
//        println - prints new line - prints vertically

//        write a code for 39,41,43......150
//        check if any value is divisible by 5


//        for (int x = 39; x <= 150; x = x + 2) {
//            System.out.println(x);
//
//            if (x % 5 == 0) {
//                System.out.println("This number is divisible by 5");
//
//
//            }
//
//
//        }


        int x = 39;
        while(x<=150) {
            x = x+2;
            System.out.println(x);

            if (x % 5 == 0) {
                System.out.println(x + "This number is divisible by 5");


            }


        }


// Nested Loops

        for(int l=0; l<5; l++){
            System.out.println(l);
            for(int h =10; h<15; h++){
                System.out.println(h);
            }


        }


// Pattern Programming

//*********
//*********
//*********
//*********


}
}







