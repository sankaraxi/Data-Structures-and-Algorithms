import java.util.Arrays;

public class MismatchNumbers {
    public static void main(String[] args) {
        // Amazon Question
        // find the number that is repeated twice and the number that is missing in the array of range [1,N] . Return the results in array.
        int[] arr ={5,3,1,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(setMismatch(arr)));
    }

    static int[] setMismatch(int[] arr){
        //cyclic sort
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        //search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return new int[] {arr[index],arr[index]+1};
            }
        }
        return new int[] {-1,-1};
    }
    //swap function
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}