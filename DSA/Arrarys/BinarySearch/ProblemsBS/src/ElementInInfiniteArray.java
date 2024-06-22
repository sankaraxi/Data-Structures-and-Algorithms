public class ElementInInfiniteArray {
    public static void main(String[] args) {
        //to find an element in the infinite array (you don't know the length of the array)
        // without using arr.length
        int[] arr = {23,34,56,78,90,100,120,230,456,567,
                789,900,999,1000,1500,1721};
        int target = 120;
        System.out.println(answer(arr,target));

    }
    static int answer(int[] arr, int target){
        // first find the range
        //first start with the box of 2
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            //temp variable for start
            int newStart = end +1; //creating new start because we are using old start value in the below formula
            //double the box--finding range value
            //end  = previous_end + size_of_box*2
            end = end + (end-start+1)*2; // originally int newEnd = end + (end-(start-1))*2
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int [] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length-1;

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
