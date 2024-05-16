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

    static int Maximum2D(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
