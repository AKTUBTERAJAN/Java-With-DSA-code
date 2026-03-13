import  java.util.*;

public class UpdateElement {
     public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int element=list.set(2,10);

        System.out.println(element);
        System.out.println(list);
    }
}
