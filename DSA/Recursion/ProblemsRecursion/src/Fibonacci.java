public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    static int fibo(int n){

        if (n<2) return n; // base condition : fibo(0) = 0 , fibo(1) = 1

        return fibo(n-1)+fibo(n-2);
    }
}