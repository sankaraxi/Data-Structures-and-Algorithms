public class PalindromeOfNumber {
    static int reverse(int n){
        //sometimes you might need additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    static int helper(int n, int digits) {
        if (n%10==n){ // if the number is one digit
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) +  helper(n/10,digits-1);
    }

    static boolean palindrome(int n){
        return n==reverse(n);
    }
    public static void main(String[] args) {
        System.out.println(palindrome(8976798));
    }
}
