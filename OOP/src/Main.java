public class Main {
    public static void main(String[] args) {
        //bai1.
        Shape.Circle circle = new Shape.Circle(2);
        System.out.println("Shape.Circle Area: " + circle.area());

        Shape.Rectangle rectangle = new Shape.Rectangle(6, 12);
        System.out.println("Shape.Rectangle Area: " + rectangle.area());
        System.out.println();
        //bai2.
        Dog dog = new Dog();
        Cat cat = new Cat();
        animalsMakeSound(dog);
        animalsMakeSound(cat);
        System.out.println();
        //bai3.
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new Bike();

        for (Vehicle vehicle : vehicles) {
            vehicle.speedUp();
            vehicle.applyBrakes();
        }
        System.out.println();
        //bai4.
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor paypalProcessor = new PaypalProcessor();

        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(creditCardProcessor);
        System.out.println();
        paymentService.processPayment(paypalProcessor);

    }
    static void animalsMakeSound(AnimalSound animal) {
        animal.makeSound();
    }
}