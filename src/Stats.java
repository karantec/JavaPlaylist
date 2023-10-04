class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }

}

public class Stats {
    public static void main(String[] args) {
        Student.school = "JMV";
        Student s1 = new Student();
        s1.name = "Rohan";
        System.out.println(s1.school);

    }
}
