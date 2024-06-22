public class LinearSearchREC {
    public static void main(String[] args) {

        int [] arr = {34,546,67,23,352,21,90,100};
        int target = 21;
        System.out.println(linearSearch1(arr,target,0));
        System.out.println(linearSearch2(arr,target,0));

    }
    //to find whether the element exists or not
    static boolean linearSearch1(int[] arr, int target,int index){
        if (index == arr.length){ //base condition
            return false;
        }
        return target == arr[index] || linearSearch1(arr, target, index+1);
    }
    //to return the index of the target element
    static int linearSearch2(int[] arr, int target,int index){
        if (index == arr.length){
            return -1;
        }
        if ( target == arr[index]){
            return index;
        }else{
            return linearSearch2(arr, target, index+1);
        }
    }
}
