package interfaces.extendDemo2;


public class Main implements intfA,intfB {
    @Override
    public void fun() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        intfA.greeting();
        main.greet();
    }
}
