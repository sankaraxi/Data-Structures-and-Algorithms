import java.util.Arrays;

public class FloorProblem {
    public static void main(String[] args) {
        //to find the fooor of the target number given in the array
        //floor of the number refers to the greatest number that is smaller than or equal to the target in the given array
        int[] arr ={2,3,4,21,22,55,66,78};
//        int target = 21;
        int target = 1;
        int[] ans = floorBinarySearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] floorBinarySearch(int[] arr, int target) {
        // but what if the target is the smaller than the smallest element in the sorted array

        if (target < (arr[0])){
            return new int[]{-1,-1};
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
                return new int[]{mid,arr[mid]};
            }
        }
        return new int[]{end,arr[end]};

    }

}
