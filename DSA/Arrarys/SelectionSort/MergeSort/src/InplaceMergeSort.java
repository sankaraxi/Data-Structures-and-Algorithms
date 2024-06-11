import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        inplaceMergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void inplaceMergeSort(int[] arr, int start, int end){
        if(end-start == 1){ // base condition
            return;
        }
        int mid  = (start + end) / 2;

        inplaceMergeSort(arr,start,mid);
        inplaceMergeSort(arr,mid,end);

        mergeInplace(arr,start,mid,end);
    }

    static void mergeInplace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];

        int i = start; //for accessing first array
        int j = mid; //for accessing second array
        int k = 0; //for accessing new mix array that merges two arrays

        while (i < mid && j < end){
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete or larger than the other array
        //copy the remaining elements
        while (i < mid){
            mix[k] = arr[i]; //adding remaining elements to the new array
            i++;
            k++;
        }

        while (j < end){ // any one of the while loop will run based on the length of the array
            mix[k] = arr[j]; //adding remaining elements to the new array
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] =  mix[l];
        }
    }
}