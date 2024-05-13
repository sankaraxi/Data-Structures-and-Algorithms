import java.util.Scanner;
        
public class Conditionals {
    public static void main(String[] args) {
        //print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n ; num++) {
//            System.out.print(num + " ");
            System.out.println("For loop ran "+ num + " times.");
        }

        int num1=1;
        while (num1 < 6){
            System.out.println(num1);
            num1++;
        }
    }
}
