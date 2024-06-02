public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5,6,7,8};
//        System.out.println(sortedArrayOrNot(arr));
        System.out.println(sortedArrayOrNot1(arr,0));
    }
//my brute force solution
    static String sortedArrayOrNot(int[] arr){
        int i = 1;
        while(i<arr.length-1){
            if (arr[i]<arr[i+1]) {
                i++;
            }else{
                return "Unsorted Array";
            }
        }
        return "Sorted Array";
    }

    //using recursion
    static boolean sortedArrayOrNot1(int[] arr, int index){
        //base conditon
        if (index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sortedArrayOrNot1(arr,index+1);

    }

}
