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
//http://www.geeksforgeeks.org/problems/merge-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-sort

//class Solution
//{
//    void merge(int arr[], int l, int m, int r)
//    {
//        // Your code here
//        int temp[] = new int[r-l+1];
//        int i = l;
//        int j = m+1;
//        int k = 0;
//        while(i<=m && j<=r){
//            if(arr[i]<arr[j]){
//                temp[k]=arr[i];
//                i++;
//            }
//            else{
//                temp[k]=arr[j];
//                j++;
//            }
//            k++;
//        }
//        while(i<=m){
//            temp[k]=arr[i];
//            k++;
//            i++;
//        }
//        while(j<=r){
//            temp[k]=arr[j];
//            k++;
//            j++;
//        }
//        for(k=0,i=l;k<temp.length;k++,i++){
//            arr[i]=temp[k];
//        }
//    }
//    void mergeSort(int arr[], int l, int r)
//    {
//        //code here
//        if(l>=r) return;
//        int m = l+(r-l)/2;
//        mergeSort(arr,l,m);
//        mergeSort(arr,m+1,r);
//        merge(arr,l,m,r);
//    }
//}
