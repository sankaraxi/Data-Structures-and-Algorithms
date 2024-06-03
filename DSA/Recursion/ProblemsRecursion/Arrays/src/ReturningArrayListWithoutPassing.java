import java.util.ArrayList;

public class ReturningArrayListWithoutPassing {
    public static void main(String[] args) {
        int [] arr = {34,546,67,23,352,21,90,21,100};
        int target = 21;
        System.out.println(findAllIndexArrayList1(arr,target,0));
    }

    static ArrayList<Integer> findAllIndexArrayList1(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        //this will contain answer for that function call only
        if ( target == arr[index]){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls =  findAllIndexArrayList1(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
