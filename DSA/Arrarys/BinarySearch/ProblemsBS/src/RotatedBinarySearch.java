public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(findPivot(arr));
        int target = 1;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        // if you did not find the pivot, that means the array is not rotated
        if (pivot == -1){
            // just do the normal binary search
            return binarySearch(arr,target,0, arr.length-1);
        }
        // if pivot is found, you have found 2 asc sorted arrays
        if (target > arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1, arr.length-1);
    }

    //func to find the pivot: the highest number after which all the consecutive numbers in the array are in ascending order
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=0){
            int mid  = start + (end - start)/2;
            // 4 cases over here
            if (mid<end && arr[mid]>arr[mid+1]){ //mid < end to avoid index out of bound error
                return mid;
            } else if (mid > start && arr[mid]<arr[mid-1]){ // mid > start to avoid index out of bound error
                return mid-1;
            } else if (arr[mid]<=arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    //binary search
    static int binarySearch(int [] arr, int target,int start, int end){
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
