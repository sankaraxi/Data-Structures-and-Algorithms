public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,55,66,78};
        int target = 2;
        System.out.println(binarySearch(arr,target,0,arr.length-1));

    }
    //return the index

    static int binarySearch(int [] arr, int target, int start, int end){
        // base condition
        if (start>end){ // start should be always less than or equal to end
            return -1;
        }
        int mid = start+(end-start)/2;
        if (arr[mid]==target){ // if the target is found at the middle index
            return mid;
        }
        if (target < arr[mid]){ // if target is less than the mid element
            return binarySearch(arr,target,start,mid-1); // target is found in left side of the array
        }
        // if target id greater than the mid element
        return binarySearch(arr,target,mid+1,end); // target is found in right side of the array
    }
}
