import java.util.LinkedList;

public class NthNode {
    public static class Node {
        Node next;

        public Node(int data) {
            this.next = null;
        }
    }
    
    private Node head;
    
    public void deleteNthfromEnd(LinkedList<Integer> list, int n) {
        //calculate the size of the linked list
        int size = 0;
        Node temp =head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        //calculate the position of the node to be deleted from the start
        if(n == size) {
            head = head.next;
            return;
        }

        int i=1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        System.out.println(list);
        NthNode nthNode = new NthNode();
        nthNode.deleteNthfromEnd(list, 2);
        System.out.println(list);

        
    }
}
