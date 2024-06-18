package packages.a;


import static packages.b.Message.message;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Displaying from 'a' package");
        message();
    }
}
