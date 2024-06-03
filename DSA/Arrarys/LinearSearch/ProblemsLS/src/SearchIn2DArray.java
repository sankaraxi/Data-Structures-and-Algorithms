import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {55,66,77,88,99},
                {11,21,31,41,51,61},
                {90,80,70,60,50,40,30}
        };
        int target = 21;

        System.out.println(search2D(arr,target)); //returns the element
        System.out.println(Arrays.toString(search2DArray(arr,target))); // returns the row and column of the element
    }

    //to find an element in the 2D array

    static int search2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) { // for each row in the array
            for (int col = 0; col < arr[row].length; col++) {// for each column of that particular row
                if (arr[row][col] == target){
                    System.out.println("element found and the element is "+ arr[row][col]);
                    return arr[row][col];
                }
            }
        }
        System.out.println("Element not found");
        return Integer.MAX_VALUE; // returns the maximum integer value if the element is not found
    }
    //function to return the row and column of the element as an array
    static int[] search2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    System.out.println("element found and the element is "+ arr[row][col]);
                    return new int[] {row,col};
                }
            }
        }
        System.out.println("Element not found");
        return new int[]{-1,-1}; // returns this if the element is not found
    }
}
