
public class MissingNumber {
    public static void main(String[] args) {
        // Amazon Question
        // find the missing number in the array of range [0,N]

    }

    static int missingNumber(int[] nums){

    }
    //cyclic sort
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}