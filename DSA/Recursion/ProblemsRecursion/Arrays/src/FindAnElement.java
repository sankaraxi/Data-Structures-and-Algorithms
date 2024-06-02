public class FindAnElement {
    public static void main(String[] args) {
        int [] arr = {34,546,67,23,352,21,90,100};
        int target = 21;
//        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearch1(arr,target,0));
        System.out.println(linearSearch2(arr,target,0));
    }

    //my brute force solution
    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    //using recrsion
    //finding whether an element exist
    static boolean linearSearch1(int[] arr, int target,int index){
        if (index == arr.length){ //base condition
            return false;
        }
        return target == arr[index] || linearSearch1(arr, target, index+1);
    }

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
