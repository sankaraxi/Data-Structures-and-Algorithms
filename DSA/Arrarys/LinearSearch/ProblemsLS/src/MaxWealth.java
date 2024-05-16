//leetcode question

public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {
                {3,2,1},
                {7,5},
                {1,2,3}
        };
        System.out.println(maximumWealth(accounts));

    }
    static int maximumWealth(int[][] accounts){
        //person = rol
        //account = col
        int ans =0;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int elements : ints) {
                sum += elements;
            }
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
