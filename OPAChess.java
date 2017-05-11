package main;
import java.util.ArrayList;
public class OPAChess {

  public static void main(String[] args) {
    //  UCI i = new UCI();
    // i.API();
    Board b = new Board();
    b.Board();

    //System.out.println("==========move b2b3==========");
    b.print_board(); 

    ArrayList<Piece> pieces=new ArrayList<Piece>();
    Piece p=new Piece("Rook",true,false,0,0);
    pieces.add(p);
    Piece p2=new Piece("Rook",true,true,0,7);
    pieces.add(p2);
    Piece p3=new Piece("Queen",true,true,0,3);
    pieces.add(p3);
    Piece p4=new Piece("Rook",true,false,7,3);
    pieces.add(p4);
    String move = "d1h5";
    System.out.println("Queen check_move (true) Result :"+p3.check_move(move,pieces));
    // int destX,int destY, ArrayList<Piece> pieces)
    Piece dead=p2.can_eat(7,3,pieces);
    if(dead!=null)
    {   
      b.apply_eat(p2,dead);
      System.out.println("==========move "+move+"==========");
      b.apply_move(move);

    }



    /* 
      Piece p3= new Piece ("King",true,true,3,7);
      pieces.add(p3);
      System.out.println("King check_move (false) Result :"+p3.check_move("d1c1",pieces));
      System.out.println("King check_move (true) Result :"+p3.check_move("d1c2",pieces));

      Piece p4 = new Piece("Queen",true,true,7,7);
      pieces.add(p4);
      System.out.println("Queen check move(false) Result :"+p4.check_move("h1a1",pieces));

      Piece p5 = new Piece("Knight",true,true,5,6);
      pieces.add(p4);
      System.out.println("Knight check move(false) Result :"+p5.check_move("f2h1",pieces));
      */
  }
}
