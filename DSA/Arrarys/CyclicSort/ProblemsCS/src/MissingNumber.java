import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        // Amazon Question
        // find the missing number in the array of range [0,N]
        int[] arr ={5,3,1,0,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        //cyclic sort
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        //search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    //swap function
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}