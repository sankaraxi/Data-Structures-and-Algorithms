public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a+" "+b+" Before Swapping");
        swap(a, b);
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a+" "+b+" After Swapping");

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a+" "+b+" After Swapping");
    }
}
