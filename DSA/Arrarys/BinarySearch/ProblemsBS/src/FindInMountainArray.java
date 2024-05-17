public class FindInMountainArray {
    public static void main(String[] args) {
        //to find an element in the mountain array
        int[] arr ={1,2,3,5,6,4,3,1};
        int target = 4;
        System.out.println(search(arr,target));

    }
    static int search(int[]arr ,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid  = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                //you are in the descending part of the array
                //this may be the answer but look at the left
                //this is why end != mid -1
                end = mid;
            }else{
                //you are in the ascending part of the array
                start = mid + 1; // because we know that the mid+1 element is greater than the mid
            }
        }
        // in the end start == end and pointing to the largest number because of the 2 checks above
        // start and end are trying to find the maximum element in the above 2 checks
        // hence when they are pointing to the one element then that is the maximum one
        //detailed: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining,hence cuz of the above line then that is the best possible answer
        return start; // you can return start or end since both are equal

    }

    static int orderAgnosticBS(int[] arr, int target,int start, int end){

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
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
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
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
