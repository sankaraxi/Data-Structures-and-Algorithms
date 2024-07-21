import java.util.ArrayList;
import java.util.Arrays;
//http://www.geeksforgeeks.org/problems/merge-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-sort

public class MergeSortNewApproach {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        mergeSortNew(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortNew(int[] arr, int low, int high){
        if(low == high){ // base condition
            return;
        }
        int mid  = (low + high) / 2;

        mergeSortNew(arr,low,mid); //left side array
        mergeSortNew(arr,mid+1,high); //right side array

        merge(arr,low,mid,high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid) {
                temp.add(arr[left]);
                left++;
        }

        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high ; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
