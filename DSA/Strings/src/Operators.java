import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //prints 97 + 98 = 195
        System.out.println("a"+ "b"); //prints ab


        System.out.println('a' + 3); //prints 97 + 3 = 100
        System.out.println((char)('a' + 3)); // prints d character value of 100 is d

        System.out.println("a" + 1); //prints a1
        //integer will be converted to Integer that will call toString() i.e, "a" + "1"

//        System.out.println(new Integer(54) + new ArrayList<>()); wont work
        // because + operator can be used with primitives or operands that has any one operand as string
        System.out.println(new Integer(54) +""+ new ArrayList<>()); // it will work now
        // in java we cannot add two or more complex datatypes except string
    }
}
