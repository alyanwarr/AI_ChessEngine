package main;

import java.util.ArrayList;
import main.Piece;

public class Board {
    
    char[][] board = new char[][]{
        { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
        { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
        { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
        { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
        { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
        { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
        { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
        { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
    };
    
    private ArrayList<Piece> pieces = new ArrayList<Piece>();
    void Board(){        
        board_init();
    }
    private void board_init(){
        /*for(int i = 0; i < 8 ;i++){
            board[i] = new char[8];
            for(int j = 0; i < 8 ; j++){
                board[i][j] = ' ';
            }
        }*/
       for(int i = 0 ; i < 8 ; i++){
            Piece pawn = new Piece("Pawn",false,i,6);
            pieces.add(pawn);
            pawn = new Piece("Pawn",true,i,1);
            pieces.add(pawn);
       }
       for(int i = 0 ; i < 2 ; i++){
           Piece piece;
           if(i==0){
            piece = new Piece("Bishop",true,0,0);
            pieces.add(piece);
            piece = new Piece("Bishop",true,7,0);
            pieces.add(piece);
            piece = new Piece("Knight",true,1,0);
            pieces.add(piece);
            piece = new Piece("Knight",true,6,0);
            pieces.add(piece);
            piece = new Piece("Rook",true,2,0);
            pieces.add(piece);
            piece = new Piece("Rook",true,5,0);
            pieces.add(piece);
            piece = new Piece("Queen",true,3,0);
            pieces.add(piece);
            piece = new Piece("King",true,4,0);
            pieces.add(piece);
           }
           if(i==1){   
            piece = new Piece("Bishop",false,0,7);
            pieces.add(piece);
            piece = new Piece("Bishop",false,7,7);
            pieces.add(piece);
            piece = new Piece("Knight",false,1,7);
            pieces.add(piece);
            piece = new Piece("Knight",false,6,7);
            pieces.add(piece);
            piece = new Piece("Rook",false,2,7);
            pieces.add(piece);
            piece = new Piece("Rook",false,5,7);
            pieces.add(piece);
            piece = new Piece("Queen",false,3,7);
            pieces.add(piece);
            piece = new Piece("King",false,4,7);
            pieces.add(piece);
           }
       }
       update_board();
    }
    void print_board(){
        for(int i = 0; i < 8 ; i ++){
            System.out.print("[ ");
            for(int j = 0; j < 8 ; j++){
                System.out.print(board[j][i]);
                if(j < 7){
                    System.out.print(" , ");
                }
            }
            System.out.println(" ]");
        }    
    }
    void apply_move(String move){
        if(move.length() == 4){
            char x1 = move.charAt(0);
            char y1 = move.charAt(1);
            char x2 = move.charAt(2);
            char y2 = move.charAt(3);
            char p;
            int X1,X2,Y1,Y2;
            X1 = CommonMethods.convert(x1);
            Y1 = CommonMethods.convert(y1);
            X2 = CommonMethods.convert(x2);
            Y2 = CommonMethods.convert(y2);
            for(int i=0;i<pieces.size();i++){
              if(pieces.get(i).get_x()  == X1 && pieces.get(i).get_y() == Y1 ){
                pieces.get(i).set_x(X2);
                pieces.get(i).set_y(Y2);
              }else if(pieces.get(i).get_x() == X2 && pieces.get(i).get_y() == Y2){
                pieces.remove(i);
              }
            }
            update_board(X1,Y1,X2,Y2);
        }
    }
    private void update_board(){
      for(int i =0 ; i< pieces.size();i++){
           String name = pieces.get(i).get_type();
           int X = pieces.get(i).get_x();
           int Y = pieces.get(i).get_y();
           switch (name) {
               case "Pawn":
                   board[X][Y] = 'p';
                   break;
               case "Bishop":
                   board[X][Y] = 'b';
                   break;
               case "Rook":
                   board[X][Y] = 'r';
                   break;
               case "Knight":
                   board[X][Y] = 'k';
                   break;
               case "Queen":
                   board[X][Y] = 'Q';
                   break;
               case "King":
                   board[X][Y] = 'K';
                   break;
           }
       }
    }
    private void update_board(int x1,int y1,int x2,int y2){
       char p = board[x1][y1];
       board[x2][y2] = p;
       board[x1][y1] = ' ';
    }
}

