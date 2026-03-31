public class HeadTail {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        
        tail = head.next;

        System.out.println(head.data); // 1
        System.out.println(tail.data); // 2
    }
}