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

    public void printInfo(String name) {
        System.out.println(name);

    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + "" + age);
    }
}

public class AppDeve {
    public static void main(String[] args) {
        // Student s1 = new Student("Aman", 24);
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
