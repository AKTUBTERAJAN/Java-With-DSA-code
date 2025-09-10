public class AccessModifirs {
    public static void main(String args []){
        BankAccount myAcc= new BankAccount();
        myAcc.username="Rajan";
        System.out.println(myAcc.username);
        myAcc.setPassword("abcde");
        
    }
}

class BankAccount{
     public String username;
     private String Password ;
     public  void setPassword(String Pwd){
        Password=Pwd;
     }
}
