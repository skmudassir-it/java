class MyClass {
    private int a,b;

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyClass() {
        this(0,0);
    }
    public void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void display() {
        System.out.println("the value of a and b are " + a + " and " + b);
    }
}

public class keywordThis {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.display();
        myObj.setData(23, 52);
        myObj.display();
    }
}
