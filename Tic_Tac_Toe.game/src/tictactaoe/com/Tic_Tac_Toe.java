package tictactaoe.com;

import java.util.Scanner;

public class Tic_Tac_Toe {
	static char[] board = new char[10];
	static char player , Computer;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		EmptyBorad();
		player = selectoption();
		System.out.println("Selected option by player is "+player);
	}

	static void EmptyBorad() {
		for (int a = 1; a < board.length; a++) {
			board[a] = ' ';
			
		}

	}

	static char selectoption() {
		while (true) {
			System.out.println("Select the option X or O");
			player = sc.next().charAt(0);
			if (player == 'X' || player == 'O') {
				return player;
			} else {
				System.out.println("invalid choice enter again");
				System.out.println("---------");
				continue;
			}
		}
	}

}
