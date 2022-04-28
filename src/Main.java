public class Main {
    public static void main (String[] args){
        Audi audiCar = new Audi("Audi", "Q7"); // Instancing an Object of Audi type
        Mercedes mercedesCar = new Mercedes("Mercedes","E Class" ); // Instancing an Object of Mercedes type

        audiCar.startEngine();
        mercedesCar.startEngine();

        mercedesCar.accelerate(); // Method only available in the Mercedes Class

        System.out.println(audiCar);
        System.out.println(mercedesCar);

    }


}
