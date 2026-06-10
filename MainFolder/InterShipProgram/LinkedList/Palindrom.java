
public class Palindrom {
   
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //STEP 1-SLOW FAST FIND
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1 AGE BADEGA
            fast = fast.next.next;//+2 AGE BADEGA
        }
        return slow; //MIDEL MIL GAYEGA
    }

    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null){ //LINKED LIST EMOTY AND  only one node are exist
            return true;
        }

        //step1: find mid
        Node mid = findmid(head);

        //step2: reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;

            //reverse main code
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;//head of reversed 2nd half
        Node left = head;
        
        //step3: check left half and right half

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        
        Palindrom p = new Palindrom();
        System.out.println(p.isPalindrome(head));
        
    }
}
