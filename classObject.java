class Student {

    String name;
    int id;
    String major;

    void setName(String stName) {
        name = stName;
    }
    void setMajor(String subject) {
        major = subject;
    }
    void display() {
        System.out.println("The student Name is " + name);
        System.out.println("Student Id is " + id);
        System.out.println("Major subject is "+ major);
        System.out.println();
    }
}

public class classObject {
    public static void main(String[] args) {
        Student s1, s2;
        s1 = new Student();
        s2 = new Student();

        s1.setName("joy");
        s1.setMajor("Computers");
        s1.id = 123;

        s2.setName("miller");
        s2.setMajor("maths");
        s2.id = 456;

        s1.display();
        s2.display();
    }
}
