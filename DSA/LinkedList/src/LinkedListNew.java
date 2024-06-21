import java.util.NoSuchElementException;

public class LinkedListNew {

    private Node head; //private because i dont want people to access it directly
    private Node tail;

    private int size;

    public LinkedListNew() {
        this.size = 0;
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail==null){
            tail = head;
        }

        size = size + 1;
    }

    public void insertLast(int val) {

        if (tail==null){ //if no elements are present add the element at the first
            insertFirst(val);
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size + 1;
    }

    public void insertOf(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp=head;

        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next=node;

        size = size + 1;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = getNode(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next= null;
        size--;
        return val;
    }

    public int deleteOf(int index){
        if(index == 0){
            return  deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        Node prev = getNode(index-1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        size--;
        return val;
    }

    public Node getNode(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node findNode(int value){
        Node node = head;
        while (node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp!=null){
            System.out.print(temp + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
         private int value;
         private Node next;

         public Node(int value) {
             this.value = value;
         }

         public Node(int value, Node next) {
             this.value = value;
             this.next = next;
         }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
