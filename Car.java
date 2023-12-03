public class Car {
    public static void main(String[] args) {
        Car superCar = new Car("Merc", "G63", 2024);
        System.out.println("BAI 1");
        System.out.println("Hang xe : " + superCar.getMake());
        System.out.println("Mau xe : " + superCar.getModel());
        System.out.println("Nam san xuat : " + superCar.getYear());
        System.out.println();
        System.out.println("BAI 2");
        superCar.displayCarInfo();
        superCar.startEngine();
        superCar.displayCarInfo();
        superCar.stopEngine();

    }
    public String make;
    public String model;
    public int year;
    public boolean status;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.status = false;
    }
    public void startEngine() {
        status = true;
        System.out.println("dong co da khoi dong");
    }
    public void stopEngine() {
        status = false;
        System.out.println("dong co chua khoi dong");
    }
    public void displayCarInfo() {
        System.out.println( make + " " + model + " " + year + "\t trang thai xe : " + (status ? " da tat " : " dang chay ") );

    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

}



