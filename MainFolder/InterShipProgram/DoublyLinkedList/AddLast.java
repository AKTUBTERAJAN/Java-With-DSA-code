public class AddLast {
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
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
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
        AddLast dll = new AddLast();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        
        dll.print();
        System.out.println(dll.size);

        dll.addLast(4);
        dll.print();
        System.out.println(dll.size);
    }
}
