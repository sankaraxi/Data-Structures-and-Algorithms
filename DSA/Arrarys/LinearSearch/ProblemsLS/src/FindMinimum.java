public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, -87, 99, 21, 66, 93};
        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
