public class stringFunction {
    public static void main(String[] args) {
        String str1 = "HELLO", str2 = "Hello";

        System.out.println("The length of the string " + str1 + " is " + str1.length());

        if (str1.equals(str2))
            System.out.println(str1 + " & " + str2 + " are Same.");
        else
        System.out.println(str1 + " & " + str2 + " are Not Same.");

        if (str1.equalsIgnoreCase(str2))
            System.out.println(str1 + " & " + str2 + " are Same by ignoring Case");
        else
        System.out.println(str1 + " & " + str2 + " are Not Same by ignoring Case");

        System.out.println("The Caracter at position 2 is " + str1.charAt(2));

        System.out.println("Comparing " + str1 + " & " + str2 + "Distance: "+ str1.compareTo(str2));

        str1 = "AABBCABBAA";
        str2 = "JAVA String Functions";

        System.out.println("The string " + str1 + " is Starting with AAB " + str1.startsWith("AAB"));
        System.out.println("The string " + str1 + " is ends with ACA " + str1.endsWith("ACA"));

        System.out.println("First index of (BB) in  " + str1 + " is " + str1.indexOf("BB"));
        System.out.println("Last index of (BB) in  " + str1 + " is " + str1.lastIndexOf("BB"));

        System.out.println("Replacing (ABB) to (xy) in " + str1 + " is " + str1.replace("ABB", "xy"));

        System.out.println("Substring of " + str2 + " from 5 to 15 is " + str2.substring(5,15));

        str1 = "This-is-a-test-string";
        String[] splitArr = str1.split("-");

        System.out.println("The splitted parts are ");
        for(String sp : splitArr)
            System.out.println(sp);

        str2 = "          Lot of Spaces        ";
        System.out.println("Before Trimming " + str2);
        System.out.println("After Trimming " + str2.trim());
    }
}
