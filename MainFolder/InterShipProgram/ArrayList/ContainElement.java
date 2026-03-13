import  java.util.*;

public class ContainElement {
     public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

         boolean element=list.contains(2);

        System.out.println(list);
        System.out.println(element);
    }
}
