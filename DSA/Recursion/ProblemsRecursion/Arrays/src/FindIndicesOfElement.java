import java.util.ArrayList;

public class FindIndicesOfElement {
    public static void main(String[] args) {
        int [] arr = {34,546,67,23,352,21,90,21,100};
        int target = 21;
        findAllIndex(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){

        if (index == arr.length){
            return;
        }
        if ( target == arr[index]){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    //returning an array list
//    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
//
//        if (index == arr.length){
//            return list;
//        }
//        if ( target == arr[index]){
//            list.add(index);
//        }
//        findAllIndex(arr, target, index+1);
//    }

}
