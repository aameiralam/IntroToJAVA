package Day5;

import javax.sound.midi.Soundbank;

public class ConstructorIntro {

    public static void main(String[] args) {

//        Special Method that is used to initialise or build an object
//        By default constructor method will be called when an object of class is created.


//        Rules -
//        1. It has to use the class name as same as constructor name.
//        2. no return type and return statements.
//        3. Almost all the cases we will make it public. Special cases for private.

//        Default constructor
//        public ConstructorsIntro(){


//        }

//      Parameterized Constructor
//        Phone phone1 = new Phone("red","15 pro", "IOS",1200);
//        phone1.updateColor("White");
//        phone1.updateModel("15 pro");
//        phone1.updateOs("IOS");
//        phone1.updatePrice(1200);


//        Phone phone2 = new Phone();
//        phone1.updateColor("Blue");
//        phone1.updateModel("13 mini");
//        phone1.updateOs("IOS");
//        phone1.updatePrice(600.50);

//        parameterized constructor used when we want values to be inputted beforehand to save extra steps. And we can update if required

//        public ClassName (datatype parameterName){
//    }
//        Parameterized Constructor
        Phone phone1 = new Phone("red","15 pro", "IOS",1200);

        Phone phone2 = new Phone("blue","13 mini", "IOS",600.50);

        System.out.println(phone1.getColor());


    }
}
