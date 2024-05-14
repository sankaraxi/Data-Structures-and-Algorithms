public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//
//        System.out.println(message);

        String personal_message = myGreet("Sankar");
        System.out.println(personal_message);
    }

    static String myGreet(String a) {
        return "How are you "+ a + " ?";
    }

    static String greet(){
        String greeting = "My name is Sankar. I Welcome you all.";

        return greeting;
    }
}
