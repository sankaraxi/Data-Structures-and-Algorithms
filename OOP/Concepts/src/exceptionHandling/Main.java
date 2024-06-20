package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 21;
        int b = 0;
        int c;
        try {
//            divide(a,b);
            // mimicing
            String name = "Sankar";
            if (name.equals("Sankar")) {
                throw new MyException("name is sankar");
            }
        }catch (MyException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
//            System.out.println("Infinity");
        }catch (Exception e){
            System.out.println("normal exception");
//            System.out.println("Infinity");
        }finally {
            System.out.println("this will always execute");
        }

    }
    //it means it may throw an exception
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("please do no divide by zero");
        }

        return  a / b;
    }
}
