public class Audi extends Car{  //The Audi class inherits the Car class

    public Audi (String brand, String model){
        super (brand, model); // Constructor
        System.out.println("An Audi has been created");
    }


    @Override
    public String toString() {
        return "Audi{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
