
import java.util.LinkedList;

public class AddMildel {
     public static class Node{
        Node next;

        public Node(int data){
            this.next=null;
        }
    }
    
    private Node head;

    public void addfirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

   public void add(int idx,int data){
    
    if(idx==0){
        addfirst(data);
        return;
    }
    Node newNode = new Node(data);
    Node temp = head;
    int i=0;
    while(i<idx-1){
        temp = temp.next;
        i++;
    }

    //i=idx-1 temp->prev
    newNode.next = temp.next;
    temp.next = newNode;


   }
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.add(2, 9);
        System.out.println(list);
    }
}
