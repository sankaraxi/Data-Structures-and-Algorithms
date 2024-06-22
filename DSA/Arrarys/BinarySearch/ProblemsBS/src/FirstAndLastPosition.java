import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] arr = {1,6,6,6,7,7,7,7,8,9};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};

        //check for the first occurrence of the target first
        ans[0] = search(arr,target,true);
        if (ans[0]!=-1) ans[1] = search(arr,target,false);
        /* if statement can be written in single line if the body of if is only one line
        if (ans[0]!=-1){
         ans[1] = search(arr,target,false);
         }
         */


        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1; //potential answer

        int start = 0;
        int end = nums.length-1;

        while (start <= end){
//            int mid = (start + end) /2; //this formula may exceeds the integer range if the the values are larger
            int mid  = start + (end - start)/2; // (2start + end - start)/2; gives the optimised mid value

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else{
                //potential ans found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
}
