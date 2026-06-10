import java.util.LinkedList;

public class ReverseLink {
    class Node {
        int data;
        Node next;
    }
    Node head;
    Node tail;
    
    public void reversed(){
        Node prev = null;
        Node current = tail = head; 
        Node next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        System.out.println("Before reverse: " + list);
        
        System.out.println("After reverse: " + list.reversed());

    }
    
    
}
