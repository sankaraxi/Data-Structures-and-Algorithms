import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(Arrays.toString(arr));
        System.out.println(firstMissingPositive(arr));

    }
    static int firstMissingPositive(int[] arr){
        //cyclic sort
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        //search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length + 1;
    }

    //swap function
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
