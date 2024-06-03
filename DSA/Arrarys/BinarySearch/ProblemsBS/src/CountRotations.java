public class CountRotations {
    public static void main(String[] args) {
        // to find the number of rotations in the rotated array
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(findPivot(arr));
        int target = 1;
        System.out.println(countRotations(arr,target));
    }
    static int countRotations(int[] arr, int target){
        int pivot =  findPivot(arr);
//        int pivot = findPivotWithDuplicates(new int[] {5,5,5,5,7,0,1,2,3,4});
        return pivot+1;
    }
    //func to find the pivot: the highest number after which all the consecutive numbers in the array are in ascending order
    //for non duplicates
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
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
    //for duplicates
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
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
