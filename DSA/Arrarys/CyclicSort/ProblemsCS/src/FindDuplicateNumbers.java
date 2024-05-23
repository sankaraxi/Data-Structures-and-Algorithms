import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        //Amazon / Microsoft Question
        //find the duplicates in the array of range [1,N] that contains one or more duplicate element
        int[] arr ={6,3,1,6,8,7,5,5,9};
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
