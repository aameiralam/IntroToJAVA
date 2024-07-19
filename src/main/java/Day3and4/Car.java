package Day3and4;

public class Car {
    String model;
    String color;
    int mileage;
    String mfgDate;
    double price;
    int speed;


    public void drive(){
        System.out.println("My car is driving");
    }
    public void accelerate(){
        System.out.println("My car is accelerating");
    }
    public void stop(){
        System.out.println("My car has stopped");
    }
    public void decelerating(){
        System.out.println("My car is decelerating");
    }


//    when using return we have to use the data type name instead of void

public String getModel(){
        return model;
    }

public String getColor(){
       color = "white";
        return color;
}

public int getMileage(){
        return mileage;
}
public String getMfgDate(){
        return mfgDate;
}

public double getPrice(){
        return price;
}

//create a method that takes a inputSpeed and updates the currentSpeed
//    with void
    public void changeSpeed(int inputSpeed){
        speed =inputSpeed;
    }
//with return

public int changeSpeedByReturnType (int inputSpeed){
        speed= inputSpeed;
        return speed;
}

}
