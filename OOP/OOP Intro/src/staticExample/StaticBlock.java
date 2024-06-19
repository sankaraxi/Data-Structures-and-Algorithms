package staticExample;

public class StaticBlock {
    // this is a demo to show initialisation of static variables
        static int a = 4;
        static int b;

        // will only run once, when the first obj is create i.e. when the class is loaded for the first time
        static {
            System.out.println("I am in static block");
            b = a * 5;
        }

        public static void main(String[] args) {
            StaticBlock obj = new StaticBlock();
            System.out.println(StaticBlock.a + " " + StaticBlock.b);

            StaticBlock.b += 3;
            a+=32; // this also will work
            System.out.println(a + " " + b);

            StaticBlock obj2 = new StaticBlock();
            System.out.println(StaticBlock.a + " " + StaticBlock.b);
//            System.out.println(a + " " + b); // this also will display the same
        }

}

