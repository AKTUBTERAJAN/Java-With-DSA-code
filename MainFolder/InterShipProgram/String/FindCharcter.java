public class FindCharcter {
    public static void printletter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstname="Rajan";
        String lastname="Kushwaha";
        String fullname= firstname + " "+ lastname;
        
        printletter(fullname);
    }
}
