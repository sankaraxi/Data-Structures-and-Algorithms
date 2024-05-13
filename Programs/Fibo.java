import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        // find nth fibonacci number

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0; // Previous index
        int i = 1; // Current index
        int count = 2;

        while (count <= n){
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
