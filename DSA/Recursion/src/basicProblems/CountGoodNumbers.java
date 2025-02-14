package basicProblems;

public class CountGoodNumbers {
    // 1922. Count Good Numbers
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }

    public static int countGoodNumbers(long n) {
        long mod = 1000000007;
        long odd = (n + 1) / 2;
        long even = n / 2;
        return (int) (Math.pow(5, odd, mod) * Math.pow(4, even, mod) % mod);
    }
}
