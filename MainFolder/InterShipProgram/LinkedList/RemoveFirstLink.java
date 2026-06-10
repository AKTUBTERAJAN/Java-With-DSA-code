import java.util.LinkedList;

public class RemoveFirstLink {
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

    public int removefirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
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
        
        System.out.println("Removed element: " + list.removeFirst());
        System.out.println(list);
        System.out.println("Size of the linked list: " + list.size());

    }
}
