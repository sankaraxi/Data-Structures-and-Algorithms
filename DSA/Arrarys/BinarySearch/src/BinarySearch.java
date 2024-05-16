public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,21,55,66,78};
        int target = 21;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    //retrun the index
    // return -1 if does not exist
    static int binarySearch(int [] arr, int target){
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
                return mid;
            }
        }
        return -1;
    }
}

