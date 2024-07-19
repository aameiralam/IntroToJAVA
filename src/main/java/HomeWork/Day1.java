package HomeWork;

public class Day1 {

    public static void main(String[] args) {


        // 1. Write a Java program that takes an integer as input and prints whether the number is positive, negative, or zero using if-else conditions.

        int x = 1;
        if (x > 0) {
            System.out.println("The number is a positive number");
        } else if (x < 0) {
            System.out.println("The number is a negative number");
        } else if (x < 1 && x > -1) {
            System.out.println("The number is zero");
        }


// 2. Write a Java program to check if a given number is odd or even using if-else conditions.

        int y = 1;
        if (y % 2 == 0) {
            System.out.println("The number is an even number");
        } else {
            System.out.println("The number is an odd number");
        }


        // 3. Write a Java program that takes a score (0-100) as input and prints the corresponding grade using if-else conditions. For example:
        //    90-100: A
        //    80-89: B
        //    70-79: C
        //    60-69: D
        //     0-59: F

        int a = 95;
        if (a >= 90 && a <= 100) {
            System.out.println('A');
        } else if (a >= 80 && a < 90) {
            System.out.println('B');
        } else if (a >= 70 && a < 80) {
            System.out.println('C');
        } else if (a >= 60 && a < 70) {
            System.out.println('D');
        } else if (a >= 0 && a < 60) {
            System.out.println('F');
        }

// 4. Write a Java program that takes the lengths of three sides of a triangle as input and determines
        //           if the triangle is equilateral, isosceles, or scalene using if-else conditions.


        short l1 = 10;
        int l2 = 10;
        long l3 = 9;
        if (l1 == l2 && l1 == l3) {
            System.out.println("Equilateral Triangle");
        } else if (l1 == l2 || l1 == l3 || l3 == l2) {
            System.out.println("Isosceles Triangle");
        } else if (l1 != l2 || l1 != l3 || l3 != l2) {
            System.out.println("Scalene Triangle");
        }


//        5. Write a Java program that takes an integer as input and classifies it into one of the following categories using if-else conditions:
////              Positive and even
////              Positive and odd
////              Negative and even
////               Negative and odd
////                Zero


        int num = 95;
        if (num > 0 && num % 2 == 0) {
            System.out.println("positive and even");
        } else if (num > 0 && num % 2 != 0) {
            System.out.println("positive and odd");
        } else if (num < 0 && num % 2 == 0) {
            System.out.println("negative and even");
        } else if (num < 0 && num % 2 != 0) {
            System.out.println("negative and odd");
        } else if (num < 1 && num > -1) {
            System.out.println("zero");
        }


//        6. Write a Java program that takes an integer N as input and calculates the sum of the first N natural numbers using a while loop.

        int n = 10;
        int sum = 0;
        int s = 1;

        while (s <= n) {
            sum = sum + s;
            s++;
        }

        System.out.println(sum);

//            7. Write a Java program that takes an integer as input and prints its multiplication table up to 10 using a for loop.

        int z = 10;
        int mul = 0;
        int q = 1;

        for (q = 1; q <= z; q++) {
            mul = z * q;
            System.out.println(mul);
        }


//        8. Write a Java program to print all prime numbers between 1 and 100 using a for loop and nested loops.





        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }

            } else {
                isPrime = false;
            }
            if (isPrime) {
                System.out.println(i + "");

            }

        }

    }
}
