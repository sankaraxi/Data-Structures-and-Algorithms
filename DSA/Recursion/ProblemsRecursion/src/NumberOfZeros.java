public class NumberOfZeros {
    public static void main(String[] args) {
        System.out.println(numberOfZeros(1007));
        System.out.println(numberOfZeros1(100313400));
    }
    // using loop
    static int numberOfZeros(int n){
        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem == 0){
                count++;
            }
            n/=10;
        }

        return count;
    }

    //using recursion

    static int numberOfZeros1(int n){

        return helper(n,0);

    }

    static int helper(int n, int count){
        if (n == 0){
            return count;
        }

        int rem = n%10;
        if (rem == 0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);

    }
}
