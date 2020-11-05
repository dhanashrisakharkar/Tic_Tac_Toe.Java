package tictactaoe.com;

import java.util.Scanner;

public class Tic_Tac_Toe {
	static char[] board = new char[10];
	static char player , Computer;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		EmptyBorad();
	}

	static void EmptyBorad() {
		for (int a = 1; a < board.length; a++) {
			board[a] = ' ';
			player = selectoption();
			Computer = player == 'X' ? 'O' : 'X';
			System.out.println(player +" Comte is "+Computer);
		}

	}

	static char selectoption() {
		while (true) {
			System.out.println("Select the option X or 0");
			player = sc.next().charAt(0);
			if (player == 'X' || player == '0') {
				return player;
			} else {
				System.out.println("invalid choice enter again");
				player = '-';
				break;
			}
		}
		return player;
	}

}
