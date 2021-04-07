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
	}
}
