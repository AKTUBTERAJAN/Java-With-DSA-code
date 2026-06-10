
import java.util.LinkedList;

public class LinerSearch {
    public static int linerSearch(LinkedList<Integer> list, int target){
     for(int i=0; i<list.size(); i++){
          if(list.get(i) == target){
                return i;
          }
     }
     //key not found
     return -1;
    }
   public static void main(String args[]){
    LinkedList<Integer> list = new LinkedList<>();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(7);
    list.addFirst(4);
    list.addFirst(5);
    int target = 3;
    int ans = linerSearch(list, target);
    System.out.println(ans);
   }
}