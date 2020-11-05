package tictactaoe.com;

import java.util.Scanner;

public class Tic_Tac_Toe {
	static int index;
	static char[] board = new char[10];
	static char player, computer;
	static Scanner sc = new Scanner(System.in);

	// Main method for Calling the User Methods
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		CreateBorad();
		selectOption();
		showBoard();
	}

	// Create empty Board using array length unto 10
	static void CreateBorad() {
		for (index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}

	// Select Option from X and O and print it
	static void selectOption() {
		while (true) {
			System.out.println("Select the option (X,x) or (O,o)");
			player = sc.next().charAt(0);
			if ((player == 'X' || player == 'x') || (player == 'O' || player == 'o')) {
				computer = player == 'X' ? 'O' : 'X';
				System.out.println(player + " is player " + computer + " is computer");
				break;
			} else {
				System.out.println("invalid choice enter again");
				System.out.println("---------");
				continue;
			}
		}
	}

	// Create a Current Board with the Matrix of 3x3
	static void showBoard() {
		for (index = 1; index < board.length; index = index + 3) {
			System.out.println("[" + board[index] + "|" + board[index + 1] + "|" + board[index + 2] + "]");
		}
	}
}
