public class OneToN {
    public static void main(String[] args) {

        funcRev(10);
    }

    static void funcRev(int n){
        if (n==0){
            return;
        }
        funcRev(n-1);
        System.out.println(n);


    }
}