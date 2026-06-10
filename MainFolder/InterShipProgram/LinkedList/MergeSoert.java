public class MergeSoert {

    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Find middle node
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    public Node merge(Node left, Node right) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        //left half
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        //right half
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // Merge Sort
    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergesort(head);
        Node right = mergesort(rightHead);

        return merge(left, right);
    }

    // Print Linked List
    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {

        MergeSoert ll = new MergeSoert();

        ll.head = ll.new Node(5);
        ll.head.next = ll.new Node(4);
        ll.head.next.next = ll.new Node(3);
        ll.head.next.next.next = ll.new Node(2);
        ll.head.next.next.next.next = ll.new Node(1);

        System.out.println("Before Sorting:");
        ll.printList(ll.head);

        ll.head = ll.mergesort(ll.head);

        System.out.println("After Sorting:");
        ll.printList(ll.head);
    }
}