public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n){
        if (n <= 1){ // factorial of 0 is also 1
            return 1;
        }
         return n * fact(n-1);
    }
}
