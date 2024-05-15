public class Main {
    public static void main(String[] args) {
        //Arrays Syntax

        // datatype[] variable_name = new datatype[size];

        // to store 5 rollnos
        // int[] rollnos = new int[5];
        //or directly
        // int[] rollnos = {1,2,3,4,5};

        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialization of array. actually object is being created in the heap

        System.out.println(ros[3]); //prints 0

        String[] names = new String[4];
        System.out.println(names[3]); // prints null
    }
}