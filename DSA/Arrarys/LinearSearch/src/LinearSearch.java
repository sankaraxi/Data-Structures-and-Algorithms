public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {234,654,64111,21,799,45,2,1,0};
        int target = 21;
        System.out.println(LinearSearch1(arr,target)); //func call to return the index of the target element
        System.out.println(LinearSearch2(arr,target)); //func call to return the target element if exists
        System.out.println(LinearSearch3(arr,target)); //func call to return true or false
    }
    //search in the array and return the index if the item found
    // otherwise return -1 in case of element not found
    static int LinearSearch1(int[] arr, int target){
        //returns -1 if no elements are present in the array
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length ; index++) {
            if (arr[index] == target){
                return index;
            }
        }
        // this line will be executed if the element is not found in the given array
        return -1;
    }
    // Program to return the element itself
    static int LinearSearch2(int[] arr, int target){
        //returns -1 if no elements are present in the array
        if (arr.length == 0){
            return -1;
        }

        for (int i : arr) {
            if (i == target) {
                return i;
            }
        }
        // this line will be executed if the element is not found in the given array
        return Integer.MAX_VALUE;
    }
    // Program to return true or false if the item exist
    static boolean LinearSearch3(int[] arr, int target){
        //returns -1 if no elements are present in the array
        if (arr.length == 0){
            return false;
        }

        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        // this line will be executed if the element is not found in the given array
        return false;
    }
}
