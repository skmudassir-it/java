import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Delhi");
        cityList.add("Kolkata");
        cityList.add("Hyderabad");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Bengluru");

        System.out.println("The size of the array list is " + cityList.size());

        System.out.println("cities are " + cityList);

        for(String city : cityList) {
            System.out.println(city);
        }
        cityList.add(2,"Kerala");

        System.out.println("Cities are " + cityList);
    }
}
