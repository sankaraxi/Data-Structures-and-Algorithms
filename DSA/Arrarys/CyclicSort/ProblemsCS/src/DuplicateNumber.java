import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        //Amazon Question
        //find the duplicate element in the array of range [1,N] that contains one duplicate element
        int[] arr ={5,3,1,6,6,8,7,4,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate(arr));

    }
    static int findDuplicate(int[] arr){
        int i = 0;
        while(i<arr.length){

            if (arr[i] != i+1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
