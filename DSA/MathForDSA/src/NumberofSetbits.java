public class NumberofSetbits {
    public static void main(String[] args) {
        int a= 190;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(setBits(a));
    }
    static int setBits(int n){ //to find no. of ones in the binary representation
        int count = 0;
         while(n>0){
             count++;
             n -= (n & -n);
         }
//        while(n>0){
//            count++;
//            n = n & (n-1);
//        }
         return count;
    }
}
