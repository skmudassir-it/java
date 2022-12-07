public class stringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer();
        System.out.println("Capacity of Buffer is " + sBuffer.capacity());

        sBuffer = new StringBuffer(50);
        System.out.println("Capacity of Buffer is " + sBuffer.capacity());

        sBuffer = new StringBuffer("My String Buffer");
        System.out.println("Capacity of Buffer is " + sBuffer.capacity());

        System.out.println("String in sBuffer is " + sBuffer);

        StringBuilder sBuilder = new StringBuilder("My StringBuilder");
        System.out.println("String in sBuffer is " + sBuilder);

        sBuffer.append(". Append with StringBuffer.");
        sBuilder.append(". Append with StringBuilder.");
        System.out.println("String in sBuffer is " + sBuffer);
        System.out.println("String in sBuilder is " + sBuilder);

        sBuffer = new StringBuffer("AABBCABBC");
        sBuilder = new StringBuilder("abaabcabac");

        sBuffer.insert(5,"pqrst");
        sBuilder.insert(3, "XYZ");
        System.out.println("String in sBuffer is " + sBuffer);
        System.out.println("String in sBuilder is " + sBuilder);


        System.out.println("Reversed StringBuffer is " + sBuffer.reverse());
        System.out.println("Reversed StringBuilder is " + sBuilder.reverse());
    }
}
