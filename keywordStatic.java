class staticDemo {
    static int staticVar;
    int var;

    public staticDemo() {
        var = 0;
    }

    public static void setStaticVar(int x) {
        staticVar = x;
    }

    public void increase() {
        staticVar++;
        var++;
    }

    public void display() {
        System.out.println("The value of static variable: " + staticVar);
        System.out.println("The value of non-static variable: " + var);
        System.out.println();
    }
}

public class keywordStatic {
    public static void main(String[] args) {
        staticDemo st1 = new staticDemo();
        staticDemo st2 = new staticDemo();

        st1.increase();
        st1.increase();
        st1.display();

        st2.increase();
        st2.increase();
        st2.increase();
        st2.display();

        staticDemo.setStaticVar(50);
        System.out.println("Static variable without object is " + staticDemo.staticVar);
    }
}
