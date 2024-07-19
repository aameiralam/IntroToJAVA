package Day5;

public class Phone {
    private String color;
    private String model;
    private String OS;
    private double price;


//    default constructor / if we do not provide it java will create it for us
//    public Phone(){
//        System.out.println("Phone Object has been created");
//    }
    public Phone(String inputColor, String inputModel, String inputOS, double inputPrice){
        color = inputColor;
        model = inputModel;
        OS = inputOS;
        price = inputPrice;
    }

//    public void updateColor(String inputColor) {
//        color = inputColor;
//    }
//
    public String getColor() {
        return color;
    }
//
//    public void updateModel(String inputModel) {
//        color = inputModel;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void updatePrice(double inputPrice) {
//        price = inputPrice;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void updateOs(String inputOs) {
//        OS = inputOs;
//    }
//
//    public String getOs() {
//        return OS;
//    }
}