import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // in java we call functions as methods
        Scanner in = new Scanner(System.in);

        int num1 , num2 , sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.println("The Sum = "+ sum);
    }
}