public abstract class Vehicle {
    abstract void speedUp();
    abstract void applyBrakes();
}
class Car extends Vehicle {
    String car = new String("dap ga tang toc di nao ");
    @Override
    void speedUp() {
        System.out.println("Car : " + car);
    }
    @Override
    void applyBrakes() {
        System.out.println("dap phanh de giam toc do");
    }
}
class Bike extends Vehicle {
    String bike = new String("dap nhanh chan len");
    @Override
    void speedUp() {
        System.out.println("Bike : " + bike);
    }
    @Override
    void applyBrakes() {
        System.out.println("bop phanh de giam toc do nao");
    }
}
