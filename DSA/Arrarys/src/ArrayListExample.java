import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5 );

//        list .add(21); //adds 21 to the arrayList
//        list.add(31);
//        list.add(41);
//        list.add(51);
//        list.add(61);
//        list.add(71);
//
//        list.contains(21); //checks whether 21 contains in the list
//        System.out.println(list.contains(21));
//        System.out.println(list);
//        list.set(5,91); //changes the fifth index element to 91
//        System.out.println(list);
//        list.remove(3); // the element in the index 3 will be deleted
//        System.out.println(list);

        //getting input from the user
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass the index to print the element
        }
        System.out.println(list);
    }
}
