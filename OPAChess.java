package main;

public class OPAChess {

    public static void main(String[] args) {
        /*UCI i = new UCI();
        i.API();*/
      //  Board b = new Board();
       // b.Board();
       // b.print_board();
       // b.apply_move("b2b3");
        //System.out.println("==========move b2b3==========");
        //b.print_board();
        Piece p = new Piece("Pawn",true,1,6);
        System.out.println("Pawn Valid Move:"+p.check_move("b2b3"));
        
        p = new Piece("Pawn",true,1,6);
        System.out.println("Pawn InValid Move:"+p.check_move("b2b5"));
      
        p = new Piece("Queen",true,3,7);
        System.out.println("Queen InValid Move:"+p.check_move("d1c3"));
        
        p = new Piece("King",true,4,0);
        System.out.println("King Valid Move:"+p.check_move("e1e2"));
        
        p = new Piece("King",false,4,8);
        System.out.println("King Valid Move:"+p.check_move("e8e7"));  
        
        p = new Piece("King",false,4,8);
        System.out.println("King inValid Move:"+p.check_move("e8e6")); 
          
        p = new Piece("Bishop",false,0,7);
        System.out.println("Bishop Valid Move:"+p.check_move("a1c3"));
        
        p = new Piece("Rook",false,0,7);
        System.out.println("Rook inValid Move:"+p.check_move("a1c3"));
    }
}
