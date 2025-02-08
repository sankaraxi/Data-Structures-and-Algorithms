package refresher;

public class Basics {
    public static void main(String[] args) {
        print(0);
    }

    // example of a recursive function
    public static void print(int count){
        if(count<=4){
            System.out.println(count);
            print(count+1);
        }
    }

    // example of a function calling another function
    public static void print0(int count){
        System.out.println(count);
        print1(count+1);
    }
    public static void print1(int count){
        System.out.println(count);
        print2(count+1);
    }
    public static void print2(int count){
        System.out.println(count);
        print3(count+1);
    }
    public static void print3(int count){
        System.out.println(count);
        print4(count+1);
    }
    public static void print4(int count){
        System.out.println(count);
    }
}
