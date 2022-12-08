import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char character = scanner.next().charAt(0);

        switch (character) {
            case 'A':
            case 'a':
                System.out.println("You have entered letter A");
                break;
            case 'B':
            case 'b':
                System.out.println("You have entered letter B");
                break;
            case 'C':
            case 'c':
                System.out.println("You have entered letter C");
                break;
            case 'D':
            case 'd':
                System.out.println("You have entered letter D");
                break;
            case 'E':
            case 'e':
                System.out.println("You have entered letter E");
                break;
            default:
                System.out.println("You have entered other letter than A, B, C, D, E");
                break;
        }
        scanner.close();
        System.out.println("Program End..");
    }
}
