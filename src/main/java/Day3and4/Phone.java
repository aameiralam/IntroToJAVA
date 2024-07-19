package Day3and4;

public class Phone {
    double screenSize;
    int batteryLife;
    int memorySize;
    String color;
    String model;
    int camera;

    public void calling() {
        System.out.println("Calling someone");
    }

    public void texting() {
        System.out.println("Texting someone");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }

    public void playVideo() {
        System.out.println("Playing a video");
    }

    public void chargePhone() {
        System.out.println("Charging Phone");
    }

    public void turnOff() {
        System.out.println("Phone turned off");
    }

    public void turnOn() {
        System.out.println("Turning on");
    }

    public void volumeUp(){
        System.out.println("Volume is up");
    }

    public void volumeDown(){
        System.out.println("Volume is down");
    }
}