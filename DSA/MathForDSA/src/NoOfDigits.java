public class NoOfDigits {
    public static void main(String[] args) {
        int num = 454;
        int base = 10; // 10 for decimal, 2 for binary

        int ans = (int)(Math.log(num)/Math.log(base))+1;

        System.out.println(ans);
    }
}
