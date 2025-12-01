public class InterFacess {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();

        Rook r=new Rook();
        r.moves();
        
    }
}

interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,daigonal(in all four 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,daigonal(by 1 step)");
    }
}

