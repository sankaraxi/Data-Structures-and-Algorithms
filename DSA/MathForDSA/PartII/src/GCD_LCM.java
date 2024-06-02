public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(12,36));
        System.out.println(lcm(3,7));
    }

    static int gcd(int a, int b) { //greatest common divisor or highest common factor
        if (a==0){
            return b;
        }

        return gcd(b%a,a);
    }

    static int lcm(int a,int b){
        return a*b/(gcd(a,b));
    }
}
