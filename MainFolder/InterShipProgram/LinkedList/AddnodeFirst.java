import java.util.*;

public class AddnodeFirst {
    
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
        public String data;
        public AddnodeFirst next;

        public void addfirst(int data){
            //step1 create new node
            Node newNode = new Node(data);
           
            if(head==null){
                head = tail = newNode;
                return;
            }

          

            //step2 newNode next = head
            newNode.next = head;
           
            //step3  head = newNode
            head = newNode;

        }
    
        public static void main(String args[]){
        AddnodeFirst ll = new AddnodeFirst ();
        ll.addfirst(1);
        ll.addfirst(2);

    }
}
