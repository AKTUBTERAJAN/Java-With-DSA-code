public class Passvalue {
    public static void update(int marks[],int  nancahngable) {
        nancahngable=10;
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nancahngable=5;
        update(marks,nancahngable);
        System.out.println(nancahngable+"");
        
        // Print our Marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
