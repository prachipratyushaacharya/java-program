public class Car extends Vehicle {
    int numDoors = 5;
    String fuelType = "Petrol";

    public static void main(String[] args) {
        Car d = new Car();
        System.out.println("Door Number:" + d.numDoors);
        System.out.println("Fuel Type" + d.fuelType);

        Vehicle b = new Vehicle();
        b.show();
    }
}
