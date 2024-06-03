//leetcode question

public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {
                {3,2,1}, //person1's accounts
                {7,5}, //person2's accounts
                {1,2,3} //person3's accounts
        };
        System.out.println(maximumWealth(accounts));

    }
    static int maximumWealth(int[][] accounts){
        //person = rol
        //account = col
        int ans =0;
        for (int[] ints : accounts) { // for each person in the array
            int sum = 0;
            for (int elements : ints) { // for each account wealth belongs to the person
                sum += elements; // add all the accounts of the person
            }
            if (sum > ans) {
                ans = sum; // storing the greatest wealth in ans
            }
        }

        return ans;
    }
}
