import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        System.out.println("This is Output Line");

        int x = 10;
        System.out.println("Value of x is " + x);

        System.out.println("First String");
        System.out.println("Second String");

        System.out.printf("This is the value of x = %d, PI = %f \n", x, 22f/7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data using the keyboard: ");
        int data = scanner.nextInt();

        System.out.println("The data, that has been read is " + data);

        scanner.close();
    }
    
}
