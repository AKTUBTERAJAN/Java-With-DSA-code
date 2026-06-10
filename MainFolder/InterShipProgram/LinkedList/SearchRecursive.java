
import java.util.LinkedList;

public class SearchRecursive {
    
    public static int searchRecursive(LinkedList<Integer> list, int target, int index){
        if(index == list.size()){
            return -1;
        }
        if(list.get(index) == target){
            return index;
        }
        return searchRecursive(list, target, index+1);
    }
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(7);
        list.addFirst(4);
        list.addFirst(5);
        int target = 3;
        int ans = searchRecursive(list, target, 0);
        System.out.println(ans);
        
    }
}
