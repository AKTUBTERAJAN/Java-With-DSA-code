import java.util.LinkedList;

public class SizeOfLink {
     public static class Node{
        Node next;

        public Node(int data){
            this.next=null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;

       if(head==null){
        head=tail=newNode;
       }
    }

   public void add(int idx,int data){
    
        if(idx==0){
            addfirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
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
        list.add(4, 9);
        System.out.println(list);
        System.out.println("Size of the linked list: " + list.size());
    }
}
