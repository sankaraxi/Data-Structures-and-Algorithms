public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(1342));
    }

    static int productOfDigits(int n) {
        if (n%10==n){
            return n;
        }
        int rem = n % 10;
//        return rem + sumOfDigits(n/10);
        return (n%10)*productOfDigits(n/10);
    }
}
