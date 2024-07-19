package problems;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2};
        int n = 3;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // Check if the key exists in the map
            if (mpp.containsKey(arr[i])) {
                // If it exists, increment the value
                mpp.put(arr[i], mpp.get(arr[i]) + 1);
            } else {
                // If it doesn't exist, initialize it with 1
                mpp.put(arr[i], 1);
            }
        }
        // iterate over the map
        mpp.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Print the frequency of the number n
        System.out.println(mpp.getOrDefault(n, 0));
    }
}
