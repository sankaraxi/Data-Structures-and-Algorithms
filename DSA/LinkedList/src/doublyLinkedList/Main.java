package doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(21);
        list.insertFirst(5);
        list.insertLast(332);
        list.insertAfter(21,23);


        list.display();
    }
}
