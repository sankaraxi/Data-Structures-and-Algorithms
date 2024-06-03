public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 87, 99, 21, 66, 93};
        int target = 21;
        System.out.println(LinearSearch(arr,target,3,5));

    }

    // to find target element in the given range in the array
    static int LinearSearch(int[] arr, int target,int start,int end){
        //returns -1 if no elements are present in the array
        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end ; index++) {
            if (arr[index] == target){
                return index;
            }
        }
        // this line will be executed if the element is not found in the given array / or in the given range
        return -1;
    }
}
