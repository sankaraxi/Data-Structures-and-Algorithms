import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner in =new Scanner(System.in);
//        int[][] arr = new int[3][];//[rows][columns] specifying rows is important

        //or directly

        int[][] arr = {
                {1,2,3},//0th index
                {4,5,6},//1st index
                {7,8,9},//2nd index
        };

        int[][] arr2D = new int[3][3];
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col]= in.nextInt();
            }
            
        }
        // printing each element in matrix form
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr2D.length; row++) { // printing as array
            System.out.println(Arrays.toString(arr2D[row]));
        }

        for (int[] ints : arr2D) { // printing as array us enhanced for loop
            System.out.println(Arrays.toString(ints));
        }

    }
}
