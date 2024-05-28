public class NumbersExampleRecursion {
    public static void main(String[] args) {

        print(1);
    }
    // a function that calls itself
    static void print(int n){
        System.out.println(n);
        if (n==5) return; // base condition to stop the recursion - which stops making new calls
        print(n+1); // tail recursion since this is the last function call
    }

}
