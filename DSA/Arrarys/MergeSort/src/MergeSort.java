import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){ // base condition
            return arr;
        }
        int mid  = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0; //for accessing first array
        int j = 0; //for accessing second array
        int k = 0; //for accessing new mix array that merges two arrays

        while (i < first.length && j < second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete or larger than the other array
        //copy the remaining elements
        while (i < first.length){
            mix[k] = first[i]; //adding remaining elements to the new array
            i++;
            k++;
        }

        while (j < second.length){ // any one of the while loop will run based on the length of the array
            mix[k] = second[j]; //adding remaining elements to the new array
            j++;
            k++;
        }

        return mix;
    }

}