public class PrintData {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String args[]){
        AddnodeFirst head = new AddnodeFirst ();
        head.addfirst(1);
        head.addfirst(2);

        //print data
        AddnodeFirst temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
