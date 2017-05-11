package main;

import java.util.Scanner;

public class UCI {
  

    private static String NAMEVERSION = "OPA-Chess AlphaBeta v0.01";
    private static String AUTHOR = "OPA";
  
    void UCI(){
      
    }

    public static void API() {
        Scanner input = new Scanner(System.in);
        while (true) {
            String inputline = input.nextLine();
            if (inputline.equals("uci")) {
                UCIoption();
            } else if (inputline.startsWith("debug")) {
                DEBUGoption();
            } else if (inputline.equals("isready")) {
                ISREADYoption();
            } else if (inputline.equals("ucinewgame")) {
                UCINEWGAMEoption();
            } else if (inputline.startsWith("position")) {
                POSITIONoption(inputline);
            } else if (inputline.startsWith("go")) {
                GOoption();
            } else if (inputline.equals("print")) {
                PRINToption();
            } else if (inputline.equals("quit")) {
                break;
            }
        }

    }

    private static void UCIoption() {
        System.out.println("id name " + NAMEVERSION);
        System.out.println("id Author " + AUTHOR);
        //options available
        System.out.println("uciok");
    }

    private static void DEBUGoption() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ISREADYoption() {
        System.out.println("readyok"); //To change body of generated methods, choose Tools | Templates.
    }

    private static void UCINEWGAMEoption() {
        //clear hash + other stuff if needed
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void GOoption() {
        //search for best move
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void PRINToption() {
        //print Board
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void POSITIONoption(String Input) { //position startpos moves b2b3  
                                                         
        Input = Input.replace("position ", "");
        System.out.println(Input);
        if (Input.startsWith("startpos")) {
            if (Input.contains("startpos ")) {
                Input = Input.replace("startpos ", "");
            } else {
                Input = Input.replace("startpos", "");
            }
            //start position generation
        } else if (Input.startsWith("fen")) {
            Input = Input.replace("fen ", "");
        }
        System.out.println(Input);
        if (Input.startsWith("moves")) {
            Input = Input.replace("moves ", "");
            //make moves
        }
        
        System.out.println(Input);
    }

}
