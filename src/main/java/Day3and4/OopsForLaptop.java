package Day3and4;

public class OopsForLaptop {


    public static void main(String[] args) {
        //        ClassName  objectName = new ClassName
//        adding a value to the attributes
//        objectName.attributesName = value;

        Laptop acer = new Laptop();
        acer.price=1000;
        acer.rating=4;
        acer.screenSize= 12;
        acer.userName= "Aameir";

        //        object.method()

        acer.switchOn();
        acer.closeApp();
        acer.openApp();
        acer.switchOff();



        Laptop dell = new Laptop();
        dell.price=2000;
        dell.rating=4;
        dell.screenSize= 14;
        dell.userName= "Alam";
        dell.switchOn();
        dell.closeApp();
        dell.openApp();
        dell.switchOff();

    Laptop lenevo = new Laptop();
    lenevo.screenSize= 16;
    lenevo.rating=5;
    lenevo.userName="Nusaibah";
    lenevo.price= 1000;
    lenevo.openApp();
    lenevo.switchOff();
    lenevo.closeApp();
    lenevo.switchOn();


    }


}
