class BelowAgeException extends Exception {
    BelowAgeException() {
        super("Age is under 18");
    }
}

class Application{
    private String name;
    private String course;
    private int age;
    public Application(String name, String course) {
        this.name = name;
        this.course = course;
        age = 18;
    }
    public Application() {
        this("", "");
    }
    public void setAge(int age) throws BelowAgeException {
        if(age < 18)
            throw new BelowAgeException();
        else
            this.age = age;
    }
    public void displayDetais() {
        System.out.println("The name of the student is "+ name);
        System.out.println("applied for " + course);
        System.out.println("Applicant age is " + age);
        System.out.println();
    }
}
public class userDefineException {
    public static void main(String[] args) {
         Application application1 = new Application("john", "Java");
         Application application2 = new Application("Peeter", "Python");

         application1.displayDetais();

         try {
            application2.setAge(17);
         } catch (BelowAgeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
         }
    }
}
