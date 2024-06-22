public class RotatedBinarySearchDuplicates {
    public static void main(String[] args) {
        // to find an element in the rotated array that contains duplicate elements
        int[] arr = {5,5,5,5,7,1,2,3,5,5,5};
        System.out.println(findPivotWithDuplicates(arr));
        int target = 2;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int pivot = findPivotWithDuplicates(arr);
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
    // this wont work for duplicate values
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
    // for duplicate values
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid  = start + (end - start)/2;
            // 4 cases over here
            if (mid<end && arr[mid]>arr[mid+1]){ //mid < end to avoid index out of bound error
                return mid;
            } else if (mid > start && arr[mid]<arr[mid-1]){ // mid > start to avoid index out of bound error
                return mid-1;
            }

            // if the elements at start, mid and end are same the skip the duplicates

            if (arr[start] == arr[mid] && arr[mid] == arr [end]){
                // skip the duplicates
                //NOTE : What if the elements at the start and end are pivot
                // check if start is pivot
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted,so pivot should be in the right side
            else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid] > arr[end])){
                start =mid +1;
            }else{ // Right side is sorted, so pivot must be in left side
                end = mid -1;
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
