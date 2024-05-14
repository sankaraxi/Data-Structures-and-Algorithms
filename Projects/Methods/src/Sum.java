import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//       int ans =  sum();

        int ans = sum3(20 , 30);
        System.out.println(ans);
    }
    /*
        SYNTAX OF METHODS:

                access_modifier return_type name(arguments){
                //body of the function
            }
   */
//    static void sum(){ //void does not return any thing
//        Scanner in = new Scanner(System.in);
//        int num1 , num2 , sum;
//
//        System.out.print("Enter number 1: ");
//        num1 = in.nextInt();
//
//        System.out.print("Enter number 2: ");
//        num2 = in.nextInt();
//
//        sum = num1 + num2;
//
//        System.out.println("The Sum = "+ sum);
//    }
    static int sum(){ // returns an integer value
        Scanner in = new Scanner(System.in);
        int num1 , num2 , sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        sum = num1 + num2;

        return sum;
//        System.out.println("This statement will never run");
    }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
