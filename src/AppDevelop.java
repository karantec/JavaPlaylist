class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void printName() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // constuctor calling
    Student() {
        System.out.println("Constructore called");
    }

    // parametrized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class AppDevelop {
    public static void main(String[] args) {
        // Student s1 = new Student("Aman", 24);
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        Student s2 = new Student(s1);
        s2.printName();
        // s1.name = "Aman";
        // s1.age = 24;
        s1.printName();
    }
}
