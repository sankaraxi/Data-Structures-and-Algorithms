public class NumberOfStepsToZero {
    //leetcode question
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps1(14));
    }
    //my brute force solution
    static int numberOfSteps(int n){
        int count =0;
        while(n>0){
            if (n%2==0){
                n/=2; //n=n/2
                count++;
            }else{
                n-=1;
                count++;
            }
        }
        return count;
    }

    // using recursion
    static int numberOfSteps1(int n){
        return helper(n, 0); // another function is used because we need to pass to arguments
    }

    static int helper(int num, int count){
        if (num == 0){
            return count;
        }
        if (num%2==0){
            return helper(num/2,count+1);
        }
        return helper(num-1,count+1);
    }
}
