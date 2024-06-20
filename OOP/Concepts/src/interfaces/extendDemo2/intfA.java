package interfaces.extendDemo2;

public interface intfA {

    static void greeting(){
        System.out.println("Hellow form static method");
    }
    default void greet(){
        System.out.println("I am in interface A");
    }
}
