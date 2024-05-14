public class Overloading { // method overloading or function overloading refers to two or more functions with same name but accepts different types of aruguments
    public static void main(String[] args) {
        fun(67);
        fun("Sankar");
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static void fun(int a) {
        System.out.println(a);

    }
}
