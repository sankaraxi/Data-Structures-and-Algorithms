import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,21};
//        System.out.println(Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
        //REVERSE
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
