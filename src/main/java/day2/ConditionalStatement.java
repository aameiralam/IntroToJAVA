package day2;

public class ConditionalStatement {

    public static void main(String[] args) {
//        conditional statements :
//        if
//        else
//        else if
//        switch

//        boolean condtion = true;
//        if(condition){
//        System.out.println("This block will execute if the condition is true");
//    }else{
//        System.out.println("This block will execute if the condition is false");



//    Write a logic if a person is a senior citizen or not,
//    person age is greater than 50 - senior citizen


    int age = 25;

    if(age>50){
        System.out.println("The person is a senior citizen");
    } else {
        System.out.println("The person is not a senior citizen");
    }

//person age is less than 20 years - teenager
//        person age is greater than 20 and less than 50 - youngster
//        int personAge = 35


        int x = 35;

        if(x>20 && x<50){
            System.out.println("The person is a youngster");
        } else if(x<20){
            System.out.println("The person is a teenager");
        } else {
            System.out.println("The person is a senior citizen");
        }


//        Switch
//
//        switch(expression){
//            case1:
////            code
//            break;
//            case2:
//            break;
//
//            default:
////                default code
//                break;

            int day = 1;
        switch(day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");



        }

//Write a logic for traffic light using switch

        String trafficLight = "red";

        switch(trafficLight){
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Slow down");
                break;
            case "green":
                System.out.println("You can go");
                break;
            default:
                System.out.println("Invalid Input");
        }








    }


}
