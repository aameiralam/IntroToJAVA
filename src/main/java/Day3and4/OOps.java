package Day3and4;

public class OOps {
    public static void main(String[] args) {
//        Object oriented programming

//        Main Component
//        Class
//        Object

//        Class - Class is a template or blueprint for creating objects

//        1. Attributes - will hold data
//        2. Methods -    modify the data or perform some actions

//        Class                   object

//        Car           -     toyota, mazda, volvo, lexus
//        fruits       -      apple, oranges, grapes
//        attribute - mileage, color, price
//        method - actions, accelerate, drive, stopping


//        how to write a simple method -
//                public void methodName(){
//        body of method
//    }

//        how to create an object with class - we will use a keyword called "new" to create an object using class
//    ClassName  objectName = new ClassName
//        adding a value to the attributes
//        objectName.attributesName = value;


        Car toyota = new Car();
        toyota.model="toyota1";
        toyota.color = "black";
        toyota.mfgDate = "02-20-2024";
        toyota.mileage = 20000;
        toyota.model = "Camry";
        toyota.price = 25000.99;

        toyota.drive();
        toyota.accelerate();
        toyota.decelerating();
        toyota.stop();

String updatedColor = toyota.getColor();
System.out.println(updatedColor);
//void = Return type methods
//        public returnType methodName(){
//return keyword
//    }

//        different return types
//        void - we are not returning anything from method
//          datatype is in void place



//        input parameters for methods

        toyota.changeSpeed(80);
        System.out.println(toyota.speed);




    }

}



