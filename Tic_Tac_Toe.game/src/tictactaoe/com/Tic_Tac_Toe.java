package tictactaoe.com;

import java.util.Scanner;

public class Tic_Tac_Toe {
	static int index;
	static char[] board = new char[10];
	static char player, computer;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		CreateBorad();
		player = selectOption();
		computer = player == 'X' ? 'O' : 'X';
		System.out.println(player + " is player " + computer + " is computer");
		showBoard();
	}

	static void CreateBorad() {
		for (index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}

	static char selectOption() {
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

	static void showBoard() {
		for (index = 1; index < board.length; index = index + 3) {
			System.out.println("[" + board[index] + "|" + board[index + 1] + "|" + board[index + 2] + "]");
		}
	}
}
