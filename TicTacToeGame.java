package Tic_Tac_Toe_Problem;

public class TicTacToeGame {
	//declare & allocate memory to character array of size 10
	static char[]board = new char[10];
	
	//initialize board to empty spaces
	private static void createBoard() {
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
	}
		
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game !!!");
		createBoard();
	}
}
