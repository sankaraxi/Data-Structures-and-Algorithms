import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DisapperedNumbers {
    public static void main(String[] args) {
        //Google Question
        //find all the missing numbers in the array of range [1,N]
        int[] arr ={5,3,3,1,6,6,8,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(findAllNumbers(arr));
    }

    static List<Integer> findAllNumbers(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //find all missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(index+1);
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
