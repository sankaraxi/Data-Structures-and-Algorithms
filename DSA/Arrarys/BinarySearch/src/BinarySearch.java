public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr ={1,2,3,4,21,55,66,78};

        int[] arr ={1,2,3,4,5};
//        int target = 21;
        int target = 4;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    //return the index of the target element if found
    // return -1 if does not exist
    static int binarySearch(int [] arr, int target){
        int start = 0; //stating index
        int end = arr.length-1; //ending index of the given array

        while (start <= end){ // start must be always less than end
//            int mid = (start + end) /2; //this formula may exceeds the integer range if the the values are larger
            int mid  = start + (end - start)/2; // (2start + end - start)/2; gives the optimised mid value

            if (target < arr[mid]){ //if element is at the left to middle element
                end = mid - 1;
            } else if (target > arr[mid]) { //if element is at the right to middle element
                start = mid + 1;
            }else{ // if mid is the target
                // ans found
                return mid;
            }
        }
        return -1;
    }
}

