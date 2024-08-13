package HomeWork;

public class Day3 {
    public static void main(String[] args) {

        // Weekend Homework.
//  1. Write a Java program to find the largest among three numbers.

        int num1 =8;
        int num2 = 3;
        int num3 = 5;

    if(num1>num2 && num1>num3){
        System.out.println("The largest number is num 1");
    }else if(num2>num1 && num2>num3){
        System.out.println("The largest number is num 2");
    }else if(num3>num1 && num3>num2){
        System.out.println("The largest number is num 3");
    }






//  2. Write a Java program to check if a character is a vowel or consonant

        char c = 'b';
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("The character is a vowel");
        }else{
            System.out.println("The character is a consonant");
        }


//  3. Write a Java program to determine if a person is eligible to vote based on their age

        int age = 20;
//        legal age to vote is 18 in USA
        if(age>=18){
            System.out.println("The person is eligible to vote");
        }else{
            System.out.println("The person is ineligible to vote");
        }




//  4. Write a Java program to calculate the factorial of a number using a while loop

    int y = 3;
        int f = 1;
        while (y > 0) {
            f *= y;
            y--;
        }
System.out.println("Factorial of the given number is" + " " +  f );

//  5. Write a Java program to find the sum of all even numbers between 1 and 100 using a for loop


        int sum =0;
        for(int w =1; w<100; w++){
           if(w%2==0){
               sum = w+sum;

           }

        }
        System.out.println("The sum of all the even number till 100 is" + " " + sum);







    }
}
