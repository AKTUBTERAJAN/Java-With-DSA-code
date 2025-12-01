public class RemDupString {
    public static void removestring(String str,int idx,StringBuilder newstr,boolean map[]){
        //Base case
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //kam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate
            removestring(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            removestring(str, idx, newstr.append(currchar), map);
        }
    }
    public static void main(String arhs[]){
        String str="appnnacollege";
        removestring(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
