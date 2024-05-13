import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
// find whether lower case or upper case
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
    }
}
