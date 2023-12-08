public class Main {
    public static void main(String[] args) {
        Car superCar = new Car();
        System.out.println("Nisan GTR");
        superCar.startEngine();
        superCar.fuelLoading();
        superCar.setSpeed(499);
        superCar.setCapacity(1200);
        superCar.setCarTrunk(1);
        superCar.setNumberOfSeats(2);
        System.out.println();

        Truck sportTruck = new Truck();
        System.out.println("Ford");
        sportTruck.startEngine();
        sportTruck.fuelLoading();
        sportTruck.setSpeed(350);
        sportTruck.setCapacity(970);
        sportTruck.setNumberOfWheels(6);
        sportTruck.setEngineType("diesel - 4 ki ");
        System.out.println();

        Bike sportBike = new Bike();
        System.out.println("Asama");
        sportBike.startEngine();
        sportBike.setSpeed(40);
        sportBike.setCarBasket(1);
        System.out.println();

        Boat yacht = new Boat();
        System.out.println("Titanic");
        yacht.startEngine();
        yacht.fuelLoading();
        yacht.setSpeed(120);
        yacht.setCapacity(790);
        yacht.setThrustTurbine(5);
    }
}