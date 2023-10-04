interface Animal {
    // methods are public by default

    public void walk();

}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Horse is walking");
    }
}

public class OopsInterface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }

}
