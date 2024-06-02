import java.util.ArrayList;

public class ReturningArrayList {
    public static void main(String[] args) {
        int [] arr = {34,546,67,23,352,21,90,21,100};
        int target = 21;
        System.out.println(findAllIndexArrayList(arr,target,0,new ArrayList<>()));
    }

    static ArrayList<Integer> findAllIndexArrayList(int[] arr, int target, int index ,ArrayList<Integer> list) {//list is passed by reference value
        if (index == arr.length){
            return list;
        }
        if ( target == arr[index]){
            list.add(index);
        }
        return findAllIndexArrayList(arr, target, index+1,list);

    }
}
