
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2 ,34,355, 9};

        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] nums) {
        nums[3] = 99; //if we make change to this reference variable, same object will be changed
    }
}
