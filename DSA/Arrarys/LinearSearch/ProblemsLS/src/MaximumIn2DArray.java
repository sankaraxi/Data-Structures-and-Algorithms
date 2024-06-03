public class MaximumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {55,66,77,88,99},
                {11,21,31,41,51,61},
                {90,80,70,60,50,40,30,100}
        };

        System.out.println(Maximum2D(arr));

    }
    // to find the maximum value in the 2D array
    static int Maximum2D(int[][] arr) {
        int max = Integer.MIN_VALUE; // gives the minimum integer value i.e -2147483648
        for (int[] ints : arr) { // for each row in array arr
            for (int element : ints) { // for each element in that particular row
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
