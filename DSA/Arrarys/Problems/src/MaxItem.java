public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,21};
        System.out.println(maxItem(arr));
        System.out.println(maxRange(arr,1,3));
    }

    static int maxItem(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    // work on edge cases here, like null values
    static int maxRange(int[] arr,int Start, int End) {

        if (End < Start){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxVal = arr[Start];
        for (int i = Start; i <= End; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
