package abstractDemo;

public abstract class Parent {
//you cannot create final abstract classes
    int age;
    final int VALUE; // a final value can be created in abstract class

    public Parent(int age) {
        this.age = age;
        VALUE =245235475;
    }
//    abstract parent(); //abstract constructors are not allowed

    static void hello(){ // but static methods are allowed in abstract classes
        System.out.println("Hello all");
    }

    void normal(){ // normal methods are allowed
        System.out.println("this is a normal method");
    }

    abstract void career(String name);
    abstract void partner(String name,int age);
}
