import java.util.Scanner;

public record arthamaticOperator() {
    public static void main(String[] args) {
        int a,b, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a and b");

        a = scanner.nextInt();
        b = scanner.nextInt();

        result = a + b;
        System.out.println("Result after addition: " + result);

        result = a * b;
        System.out.println("Result after substraction: " + result);

        result = a * b;
        System.out.println("Result after multiplication: " + result);

        result = a / b;
        System.out.println("Result after division: " + result);

        result = a % b;
        System.out.println("Result after reminder: " + result);
    }
}
