import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
////        for (int i = 0; i < arr.length; i++) {
////            System.out.print(arr[i]+ " ");
////        }
//        for (int num : arr) {  // for every element in the array (arr)
//            System.out.print(num + " "); // here num represents the element of the array
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//

        //array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[3] = "Sankar";
        System.out.println(Arrays.toString(str));


    }
}
