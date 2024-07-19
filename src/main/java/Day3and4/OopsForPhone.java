package Day3and4;

public class OopsForPhone {
    public static void main(String[] args) {

        //        ClassName  objectName = new ClassName
//        adding a value to the attributes
//        objectName.attributesName = value;


        Phone iphone = new Phone();
        iphone.batteryLife= 90;
        iphone.camera= 10;
        iphone.color="White";
        iphone.model="Iphone 10";
        iphone.memorySize= 64;
        iphone.screenSize= 10;

        //        object.method()

        iphone.calling();
        iphone.chargePhone();
        iphone.playVideo();
        iphone.texting();
        iphone.turnOff();
        iphone.turnOn();
        iphone.volumeDown();
        iphone.volumeUp();


        Phone nokia = new Phone();
        nokia.batteryLife= 100;
        nokia.camera= 10;
        nokia.color="Black";
        nokia.model="Nokia Lumia";
        nokia.memorySize= 128;
        nokia.screenSize= 8;

        //        object.method()

        nokia.calling();
        nokia.chargePhone();
        nokia.playVideo();
        nokia.texting();
        nokia.turnOff();
        nokia.turnOn();
        nokia.volumeDown();
        nokia.volumeUp();

        Phone walton = new Phone();
        walton.batteryLife= 100;
        walton.camera= 10;
        walton.color="Black";
        walton.model="Nokia Lumia";
        walton.memorySize= 128;
        walton.screenSize= 8;

        //        object.method()

        walton.calling();
        walton.chargePhone();
        walton.playVideo();
        walton.texting();
        walton.turnOff();
        walton.turnOn();
        walton.volumeDown();
        walton.volumeUp();


    }
}
