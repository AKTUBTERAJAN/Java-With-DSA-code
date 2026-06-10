import java.util.LinkedList;//java collection framework

public class LLCollection {
    public static void main(String args[]){
        //create-object
        LinkedList<Integer> list = new LinkedList<>();
        
        //add
        list.addLast(2);
        list.addLast(3);
        list.addFirst(1);
        list.addFirst(0);

        System.out.println(list);

        //remove
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
    }
}
