package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        // INSERT YOUR CODE HERE (UPDATED -Samantha)

        System.out.println("Enter the row and column number with a space between to choose your move: ");

        int rowNum = keyboard.nextInt();
        int colNum = keyboard.nextInt();

        if ((rowNum >= 0 && colNum >= 0) && (rowNum <= 2 && colNum <= 2)){

            TicTacToeMove Move = new TicTacToeMove(rowNum, colNum);

                return Move;
        }
        else{

            showInputError();

            return getNextMove(isXTurn);

        }
    
    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
