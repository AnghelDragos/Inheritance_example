public class Mercedes extends Car{  //The Mercedes class inherits the Car class

    boolean autopilot; // by default set to false

    public Mercedes (String brand, String model){
        super(brand,model); // Constructor
        System.out.println("A Mercedes has been created");
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", autopilot=" + autopilot +
                '}';
    }

    public void accelerate(){
        System.out.println("The Mercedes is accelerating");





    }

}
