public class Logical {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Logical And(Check only False Value then Print False Otherwise Print True)
        System.out.println("Logical AND");
        System.out.println( (3>2) && (5>3));
        System.out.println( (3>2) && (5>3) && (8>5));
        System.out.println( (3>2) && (5>3) && (8<5));
        System.out.println( (3<2) && (5<3) && (8<5)); 
        
        // Logical And (Check Only True Value Then Print True OtherWise Print False )
        System.out.println();
        System.out.println("Logical OR");
        System.out.println( (3>2) || (5>3));
        System.out.println( (3>2) || (5>3) && (8>5));
        System.out.println( (3>2) || (5>3) && (8<5));
        System.out.println( (3<2) || (5<3) && (8<5));

        // Logical Not
        System.out.println();
        System.out.println("Logical NOT");
        System.out.println(!(3>2));
        System.out.println(!(3>5));
        
    }
    
}
