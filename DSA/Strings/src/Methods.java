import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sankar Gnanasekar Palani";
        System.out.println(Arrays.toString(name.toCharArray()));// converts all the characters into an array
        System.out.println(name.toLowerCase()); // new object created
        System.out.println(name); // original object remains unchanged
        System.out.println(name.indexOf('G'));
        System.out.println("     Sankar    ".strip());// removes extra space
        System.out.println(Arrays.toString(name.split(" ")));
    }

}
