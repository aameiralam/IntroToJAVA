package Day3and4;

public class OopsForHouse {
    public static void main(String[] args) {

//        ClassName  objectName = new ClassName
//        adding a value to the attributes
//        objectName.attributesName = value;

        House apartment = new House();
        apartment.noOfBedRooms = 3;
        apartment.location = "Virginia";
        apartment.NoOfBathRooms= 2;
        apartment.price = 800000;
System.out.println(apartment.price);
//        object.method()

        apartment.rent();
        apartment.enter();
        apartment.sold();
        apartment.renovation();

House penthouse = new House();
penthouse.location = "Manhattan";
penthouse.price = 12000000;
penthouse.NoOfBathRooms=5;
penthouse.noOfBedRooms=10;

//calling out method
        penthouse.enter();
        penthouse.renovation();
        penthouse.sold();
        penthouse.rent();


        House condo = new House();
        condo.location = "Manassas";
        condo.price = 300000;
        condo.noOfBedRooms= 6;
        condo.NoOfBathRooms = 3;

        condo.rent();
        condo.sold();
        condo.renovation();
        condo.enter();



    }
}
