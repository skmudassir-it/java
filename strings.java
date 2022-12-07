import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        char[] charString = {'S','t','r','i','n','g'};
        Scanner scanner = new Scanner(System.in);

        String str = new String(charString);

        System.out.println("The value of str is " + str);

        System.out.println("Enter A string");
        str = scanner.next();
        System.out.println("The value of string is " + str);

        str = "JAVA Strings";
        System.out.println("The value of string is " + str);

        str = "Strings" + " " + "Concatenate";
        System.out.println("The value of string is " + str);
        
        scanner.close();
    }
    
}
