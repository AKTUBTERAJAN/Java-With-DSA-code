public class Zig_Zag {
     public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null) {
            sb.append(curr.data);
            if (curr.next != null) {
                sb.append(" -> ");
            }
            curr = curr.next;
        }
        return sb.toString();
    }

    public void zigzag(){
        
        //step1: find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;//+1 AGE BADEGA
            fast = fast.next.next;//+2 AGE BADEGA
        }
        Node mid = slow;

        //step2: reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        //step3: alt merge - zig zag merge
        while(left != null && right != null){
            //zig zag merge
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            //update
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]){

       Zig_Zag list = new Zig_Zag();
       list.addLast(1);
       list.addLast(2);
       list.addLast(3);
       list.addLast(4);
       list.addLast(5);
       list.addLast(6);

       System.out.println(list);
       list.zigzag();
       System.out.println(list);

    }
}
