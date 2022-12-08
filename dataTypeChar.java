public class dataTypeChar {
    public static void main(String[] args) {
        char myChar;

        myChar = 'A';
        System.out.println("The value of myChar is "+ myChar);
        
        myChar = 70; //Ascii code
        System.out.println("The value of myChar is "+ myChar);

        myChar = '\u0041'; //unicode
        System.out.println("The value of myChar is "+ myChar);
    }
}
