package staticExample;

import java.rmi.NoSuchObjectException;

public class NonStaticFunctions {
    public static void main(String[] args) {
        NonStaticFunctions funn = new NonStaticFunctions();
        funn.fun2();
        fun();
    }


    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        NonStaticFunctions obj = new NonStaticFunctions();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun(); // can have static function call in nonstatic function
        System.out.println("Hello world");
    }
}
