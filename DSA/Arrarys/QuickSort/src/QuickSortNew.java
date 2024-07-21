import java.util.Arrays;

public class QuickSortNew {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high){
        if (low < high){ // this condition verifies that the array has elements more than 1
            int partitionIndex = pivot(arr,low,high);
            quickSort(arr,low, partitionIndex -1);
            quickSort(arr, partitionIndex + 1, high);
        }

    }

    static int pivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j){
            while (arr[i]<= pivot && i <= high - 1){
                i++;
            }
            while (arr[j] > pivot && j >= low + 1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr [j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr [j];
        arr[j] = temp;
        return j;
    }


}
