
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from the user till user does not press x or X
        int ans = 0;
        while(true){
            //take operator as the input
            System.out.print("Enter the operator: ");
            char ch = in.next().trim().charAt(0);
            if (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                System.out.print("Enter two numbers: ");
                int num1= in.nextInt();
                int num2 = in.nextInt();

                if (ch=='+'){
                    ans = num1 + num2;
                } else if (ch=='-'){
                    ans = num1 - num2;
                } else if (ch=='*'){
                    ans = num1 * num2;
                }else if (ch=='%'){
                    ans = num1 % num2;
                }else if (ch=='/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                }

                }
            }else if (ch=='x'||ch=='X'){
                break;
            }else{
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }
    }
}
