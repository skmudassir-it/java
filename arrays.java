import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] intArr = { 10, 20, 30, 40, 50 };

        float[] floatArr = new float[5];

        char charArr[] = new char[5];

        Scanner sc = new Scanner(System.in);

        floatArr[0] = 2.5F;
        floatArr[1] = 7.23F;
        floatArr[2] = 5.6F;
        floatArr[3] = 8F;
        floatArr[4] = 7.125F;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Character for index " + i + " : ");
            charArr[i] = sc.next().charAt(0);
        }

        System.out.println("Item of the Integer array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println("Item of the Float array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(floatArr[i] + " ");
        }
        System.out.println("Item of the char array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(charArr[i] + " ");
        }
        sc.close();

    }
}
