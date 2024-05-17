public class MountainArray {
    public static void main(String[] args) {
        /*mountain array - bitonic array : the elements in this type of array
        first increases to a peak number and then decreases
         */
        // to find the peak element in the mountain array

        int[] arr ={1,2,3,4,5,6,4,3,1};
        System.out.println(peakIndexInMountainArray(arr));
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
}
