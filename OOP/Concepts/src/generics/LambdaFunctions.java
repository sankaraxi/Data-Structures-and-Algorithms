package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    // lambda function are one / in line functions
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
//        arr.forEach((item) -> System.out.println(item * 2));

        //an operation that accepts a single input argument and returns no result.
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);
        System.out.println();
        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;


        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(5, 3, prod));
        System.out.println(myCalculator.operate(5, 3, sub));
    }
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}
interface Operation { // we are created interface instead of class because Consumer is an interface by default
    int operation(int a, int b);
}



//
//
//
//
//    LambdaFunctions myCalculator = new LambdaFunctions();
//        System.out.println(myCalculator.operate(5, 3, sum));
//        System.out.println(myCalculator.operate(5, 3, prod));
//        System.out.println(myCalculator.operate(5, 3, sub));
//}
//

//}
//}
//
