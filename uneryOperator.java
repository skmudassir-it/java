public class uneryOperator {
    public static void main(String[] args) {
        int var1, var2;
        var1 = 50;
        
        var2 = -var1;
        System.out.println("The value 1 is " + var1 + " , value 2 is " + var2);

        var1 = 50;
        var2 = var1++;
        System.out.println("The value 1 is " + var1 + " , value 2 is " + var2);

        var1 = 50;
        var2 = ++var1;
        System.out.println("The value 1 is " + var1 + " , value 2 is " + var2);

        var1 = 50;
        var2 = var1--;
        System.out.println("The value 1 is " + var1 + " , value 2 is " + var2);

        var1 = 50;
        var2 = --var1;
        System.out.println("The value 1 is " + var1 + " , value 2 is " + var2);

        boolean bool1, res;
        bool1 = true;

        res =! bool1;
        System.out.println("The boolean value is " + bool1);
        System.out.println("The result value is " + res);
    }
}
