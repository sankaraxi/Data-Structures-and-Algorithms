public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,21,55,66,78};
        int target = 21;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end]; // assigns true if array is sorted in ascending otherwise false
      /*
        if (arr[start] < arr[end]){
            isAsc = true;
        }else{
            isAsc =false;
        }
    */
        while (start <= end){
//            int mid = (start + end) /2; //this formula may exceeds the integer range if the the values are larger
            int mid  = start + (end - start)/2; // (2start + end - start)/2; gives the optimised mid value

            if (arr[mid] == target){
                //ans found
                return mid;
            }
            if (isAsc){ // for ascending ordered array
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{// for descending ordered array
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
