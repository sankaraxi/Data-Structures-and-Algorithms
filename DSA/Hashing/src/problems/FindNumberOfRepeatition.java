package problems;

public class FindNumberOfRepeatition {
    // to find how many time the given number appear in the given array
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2};
        int n = 1;

        int[] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println(hash[n]);
    }
}
