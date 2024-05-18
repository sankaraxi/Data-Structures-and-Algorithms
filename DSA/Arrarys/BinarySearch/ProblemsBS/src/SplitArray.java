public class SplitArray {
    public static void main(String[] args) {
        // to split the given array into m parts , that has minimum of the largest sum of each split arrays
        int[] arr = {4,5,2,8,10};
        int m =2;
        System.out.println(splitArray(arr,m));

    }
    static int splitArray(int[] nums , int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]); // in the end of this loop , this will contain the max item from the array
            end+=nums[i];
        }
        //binary search
        while (start < end){
            // try for the middle as the potential answer
            int mid = start + (end - start)/2;
            //calculate how many pieces you can divide this in with this maximum sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums){
                if(sum+num > mid){
                    // you cannot add this in the subarray, make new one
                    // say this you add this num in the new subarray, then sum =num
                    sum = num;
                    pieces++;
                }else{
                    sum+=num;
                }

                if (pieces>m){
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }
        }
        return end;
    }
}
