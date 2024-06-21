package singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListNew list = new LinkedListNew();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(21);
        list.insertFirst(5);
        list.insertLast(6);
        list.insertOf(100,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteOf(3));
        System.out.println(list.findNode(21));


        list.display();
    }
}