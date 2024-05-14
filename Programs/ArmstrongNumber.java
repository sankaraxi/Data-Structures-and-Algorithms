import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // check whether the given number is armstrong number
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));
// print all three digit armstrong number
        for (int i = 100; i <= 999 ; i++) {
            if (isArmstrong(i)){
                System.out.print(i+ " ");
            }

        }

    }


    static boolean isArmstrong(int n) {
        int Original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;

            sum = sum + rem*rem*rem;
        }
        return sum == Original;
    }


}
