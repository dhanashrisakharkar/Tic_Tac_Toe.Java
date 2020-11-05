package tictactaoe.com;

public class Tic_Tac_Toe {
	static char[] board = new char[10];

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");

		EmptyBorad();

	}

	    static void EmptyBorad() {
		for (int a = 1; a < 10; a++) {
			board[a] = ' ';
		}

	}
}
