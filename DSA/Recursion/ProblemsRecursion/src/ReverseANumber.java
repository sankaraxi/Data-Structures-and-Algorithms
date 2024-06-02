public class ReverseANumber {
    static int sum = 0;
    static void reverseNumRec2(int n){
        if (n==0){
            return;
        }
        int rem = n % 10;
        sum = sum*10+rem;
        reverseNumRec2(n/10);
    }

    public static void main(String[] args) {
//        reverseNum(567);
//        reverseNumRec1(567);
//        reverseNumRec2(489903);
//        System.out.println(sum);
        System.out.println(reverseNumRec3(503489884));
    }

    static void reverseNum(int n){
        int rem;
        while (n>0){
            rem = n%10;
            System.out.print(rem);
            n/=10;
        }
    }

//    static String reverseNumRec1(int n){ //using strings
//        if (n==0){
//          return n;
//        }
//        return (n%10)+""+reverseNumRec1(n/10);
//    }
    static int reverseNumRec3(int n){
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
}
