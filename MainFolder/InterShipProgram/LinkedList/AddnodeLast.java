import java.util.*;
public class AddnodeLast {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;

        public void addlast(int data){
            //step1 create new node
            Node newNode = new Node(data);
           
            if(head==null){
                head = tail = newNode;
                return;
            }

          

            //step2 tail next = newNode
            tail.next = newNode;
           
            //step3  tail = newNode
            tail = newNode;

        }
    
        public static void main(String args[]){
        AddnodeLast ll = new AddnodeLast ();
        ll.addlast(1);
        ll.addlast(2);

    }
}
