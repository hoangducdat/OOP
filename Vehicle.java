public class Vehicle implements Drivable {
    static void driveVehicle(Vehicle veh){
    veh.drive();

    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("MERC", "GLC300","2022");
        vehicle.info();
        vehicle.start();
        vehicle.stop();
        System.out.println("\t");
        Car car = new Car("BMW","I8","2023", "7 cho");
        car.info();
        car.start();
        car.stop();
        System.out.println("\t");
        Bike bike = new Bike("ASAMA", "NewVersion","2023","1");
        bike.info();
        bike.start();
        bike.stop();
        System.out.println();
        car.drive();
        bike.drive();
        driveVehicle(car);
        driveVehicle(bike);
    }
    public String make;
    public String model;
    public String year;
    public Vehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void info() {
        System.out.println(make + " " + model + " nam san xuat " + year);
    }
    public void start() {
        System.out.println("khoi dong may di");
    }
    public void stop() {
        System.out.println("tat may di");
    }

    @Override
    public void drive() {
        System.out.println("Vehicle");
    }

    public static class Car extends Vehicle implements Drivable {
        public String soGheXe;

        public Car(String make, String model, String year, String soGheXe) {
            super(make, model, year);
            this.soGheXe = soGheXe;
        }
        @Override
        public void drive(){
            System.out.println("Car");
        }
        public void info() {
            System.out.println(make + " " + model + " nam san xuat " + year);
            System.out.println("so ghe cua xe la : " + soGheXe);
        }
        @Override
        public void start() {
            System.out.println("di chuyen ve phia truoc");
        }
        public void stop() {
            System.out.println("dung ben kia duong kia");
        }
    }
    public static class Bike extends Vehicle implements Drivable {
        public String gioXe;
        public Bike(String make, String model, String year, String gioXe) {
            super(make, model, year);
            this.gioXe = gioXe;
        }
        @Override
        public void drive(){
            System.out.println("Bike");
        }

        @Override
        public void info() {
            System.out.println(make + " " + model + " " + year);
            System.out.println("gio xe : " + gioXe);
        }
        public void start() {
            System.out.println("dap xe nhanh len nao");
        }
        public void stop() {
            System.out.println("dung lai nghi ngoi di");
        }
    }


}

