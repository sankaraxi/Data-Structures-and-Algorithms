import java.util.Arrays;

public class CeilingProblem {
    public static void main(String[] args) {
        //to find the ceiling of the target number given in the array
        //ceiling of the number refers to the smallest number that is greater than or equal to the target
        int[] arr ={1,2,3,4,21,22,55,66,78};
//        int target = 55;
        int target = 21;
        int[] ans = ceilingBinarySearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] ceilingBinarySearch(int[] arr, int target){
        // but what if the target is the greater than the greatest element in the array

        if (target > arr[arr.length -1]){
            return new int[] {-1, -1};
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
//            int mid = (start + end) /2; //this formula may exceeds the integer range if the the values are larger
            int mid  = start + (end - start)/2; // (2start + end - start)/2; gives the optimised mid value

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                // ans found
                return new int[]{mid,arr[mid]}; //returns if the target element itself is found
            }
        }
        return new int[]{start,arr[start]}; // this returns the ceiling of the target number

    }
}
