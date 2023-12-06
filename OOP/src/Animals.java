public class Animals {
}
class Dog implements AnimalSound {
    String dog = new String("gau gau gau");
    @Override
    public void makeSound() {
        System.out.println("Dog : " + dog);
    }
}
class Cat implements AnimalSound {
    String cat = new String("meoww meowww");
    @Override
    public void makeSound() {
        System.out.println("Cat : " + cat);
    }
}


