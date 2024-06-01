public class BothNtoOneAndOneToN {
    public static void main(String[] args) {

        funcBoth(10);
    }

    static void funcBoth(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);


    }
}