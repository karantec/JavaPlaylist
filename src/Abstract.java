//creating a abstract class 
abstract class Animal {
    // having a abstract method
    abstract void walk();

}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walk at 2 legs");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        // because instance cannot be created because it is abstract class and it is not
        // existed so it can be called as run time polymorphism
        Animal animal = new Animal();
        animal.walk();
    }
}