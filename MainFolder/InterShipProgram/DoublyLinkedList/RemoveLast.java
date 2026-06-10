public class RemoveLast {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

     //remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        } 
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

     //print linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        RemoveLast dll = new RemoveLast();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        
        dll.print();
        System.out.println(dll.size);

        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
    }
}
