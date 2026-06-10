public class RemoveCycle {
     // head of the linked list
    static Node head;

    // simple Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     public static  boolean isCycle(){ //FLOYD'S CYCLE DETECTION ALGORITHM
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle detected
    }

    public static void removeCycle(){
        // Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(!cycle){
            return; // no cycle
        }

        // Find the meeting point 
        slow = head;
        Node previous = null; // To keep track of the node before the meeting point
        while(slow != fast){
            previous = fast; // Update previous to the current position of fast
            slow = slow.next; // +1
            fast = fast.next; // +1
        }
        // Remove cycle -> last.next = null
        previous.next = null;
    }

    public static void main(String args[]){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // Creating a cycle


        //1->2->3->2
        System.out.println(isCycle()); // Output: true
        removeCycle(); // Remove the cycle
        System.out.println(isCycle()); // Output: false
    }
}
