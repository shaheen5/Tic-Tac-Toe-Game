package Tic_Tac_Toe_Problem;

import java.util.Scanner;

public class TicTacToeGame {
	//declare & allocate memory to character array of size 10
	static char[]board = new char[10];
	
	//initialize board to empty spaces
	private static void createBoard() {
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
	}
	
	//get user input character & return it's UpperCase character 
	private static char getPlayerLetter(Scanner userInput) {
		System.out.print("Choose your letter :");
		return userInput.next().toUpperCase().charAt(0);
	}
	
	//display game board
	private static void showBoard() {
		System.out.println("|---|---|---|"); 
        System.out.println("| " + board[1] + " | "
                           + board[2] + " | " + board[3] 
                           + " |"); 
        System.out.println("|-----------|"); 
        System.out.println("| " + board[4] + " | "
                           + board[5] + " | " + board[6] 
                           + " |"); 
        System.out.println("|-----------|"); 
        System.out.println("| " + board[7] + " | "

        		+ board[8] + " | " + board[9] 
                           + " |"); 
        System.out.println("|---|---|---|"); 
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game !!!");
		createBoard();
		Scanner userInput=new Scanner(System.in);
		char playerLetter=getPlayerLetter(userInput);
		while(playerLetter!='X'&& playerLetter!='O') {
			System.out.println("Invalid Input ! Choose Either 'X' or 'O':-");
			playerLetter=getPlayerLetter(userInput);
		}
		char computerLetter=( playerLetter=='X')?'O': 'X' ;
		System.out.println("\n*********** Welcome to 3x3 Tic Tac Toe.**********");
		showBoard();
	}
}
