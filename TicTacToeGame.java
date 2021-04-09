package Tic_Tac_Toe_Problem;

import java.util.Scanner;

public class TicTacToeGame {
	//declare & allocate memory to character array of size 10
	static char[]board = new char[10];
	//static constants
	static final int  HEADS=0;
	static final int TAILS=1;
	
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
	
	//Select the index from 1 to 9 to make the move.
	private static int getIndex(Scanner userInput) {
		System.out.print("Enter index position:-");
		int index=userInput.nextInt();
		while(!(index>0 && index <10)) {
			System.out.println("Invalid Input!");
			System.out.println("Please re-enter number between [1-9]");
			index=userInput.nextInt();

		}
		return index;
	}
     //Ensure index is free
	private static boolean isEmptyIndexPosition(int index) {
		if(board[index]== ' ')
				return true;
		else
			return false;
	}
	 //Check if the free space is available for the move. In case available make the move
	private static void makeMove(int index,char letter) {
		if(isEmptyIndexPosition(index))
			board[index]=letter;
	}
	//toss using random method to find who plays first
	private static int toss() {
		return (int)(Math.random()*10)%2;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game !!!");
		createBoard();
		Scanner userInput=new Scanner(System.in);
		System.out.print("Enter Player Name :-");
		String playerName=userInput.nextLine();
		char playerLetter=getPlayerLetter(userInput);
		while(playerLetter!='X'&& playerLetter!='O') {
			System.out.println("Invalid Input ! Choose Either 'X' or 'O':-");
			playerLetter=getPlayerLetter(userInput);
		}
		char computerLetter=( playerLetter=='X')?'O': 'X' ;
		char turn =' ';
		System.out.println("\n*********** Welcome to 3x3 Tic Tac Toe.**********");
		showBoard();
		System.out.println(playerName+"'s Letter :-"+playerLetter);
		System.out.println("Computer's Letter :-"+computerLetter+"\n");
		int toss=toss();
		switch(toss) {
		case HEADS:System.out.println(playerName+" Won The Toss !");
		           turn=playerLetter;
				   break;
		case TAILS:System.out.println("Computer Won The Toss !");
		           turn=computerLetter;
		           break;
	    default:System.out.println("Some Error Occurred !");
		}
		
		for(int i=1;i<=9;i++) {
			System.out.println("\n******"+turn+"'s Turn*********");
		    int index=getIndex(userInput);
		    makeMove(index,turn);
		    turn=(turn==playerLetter)?computerLetter : playerLetter;
			showBoard();		
		}
	}
}
