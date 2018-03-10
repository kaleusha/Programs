package com.bridgeit.program;

import java.util.Random;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class TicTacToe 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		TicTacToe tictactoe = new TicTacToe();

		String str[][] = new String[3][3];

		str[0][0] = "1";
		str[0][1] = "2";
		str[0][2] = "3";
		str[1][0] = "4";
		str[1][1] = "5";
		str[1][2] = "6";
		str[2][0] = "7";
		str[2][1] = "8";
		str[2][2] = "9";

		Utility.display(str);

		while (tictactoe.i <= 9) {
			// System.out.println(cg.i);

			if (tictactoe.i % 2 == 0)
			{
				Random r = new Random();
				int num = r.nextInt(9);

				if (num != 0 && tictactoe.checkDuplicate(num)) {
					tictactoe.computerTurn(str, num);
					tictactoe.computerWinTest(str);
				}

			} else {
				System.out.println("Enter your box Number");
				int box = scanner.nextInt();
				if (tictactoe.checkDuplicate(box)) {

					tictactoe.userTurn(str, box);
					tictactoe.userWinTest(str);
				} else {
					System.out.println("This box is Already filled");
				}
				System.out.println("----------------------------");
			}
		}

		System.out.println("Match Drawn!!!");
		
	}

	public void computerTurn(String[][] str, int r) {

		System.out.println("coumputer takes: " + r);

		if (r == 1 && str[0][0] != "X" && str[0][0] != "U")
			str[0][0] = "X";

		else if (r == 2 && str[0][1] != "X" && str[0][1] != "U")
			str[0][1] = "X";

		else if (r == 3 && str[0][2] != "X" && str[0][2] != "U")
			str[0][2] = "X";

		else if (r == 4 && str[1][0] != "X" && str[1][0] != "U")
			str[1][0] = "X";

		else if (r == 5 && str[1][1] != "X" && str[1][1] != "U")
			str[1][1] = "X";

		else if (r == 6 && str[1][2] != "X" && str[1][2] != "U")
			str[1][2] = "X";

		else if (r == 7 && str[2][0] != "X" && str[2][0] != "U")
			str[2][0] = "X";

		else if (r == 8 && str[2][1] != "X" && str[2][1] != "U")
			str[2][1] = "X";

		else if (r == 9 && str[2][2] != "X" && str[2][2] != "U")
			str[2][2] = "X";

		System.out.println("Coumpeter turn over");
		System.out.println("----------------------------\n\n");
		Utility.display(str);
	}

	public void userTurn(String[][] str, int box) {
		checkDuplicate(box);

		if (box == 1 && str[0][0] != "X" && str[0][0] != "U")
			str[0][0] = "U";

		else if (box == 2 && str[0][1] != "X" && str[0][1] != "U")
			str[0][1] = "U";

		else if (box == 3 && str[0][2] != "X" && str[0][2] != "U")
			str[0][2] = "U";

		else if (box == 4 && str[1][0] != "X" && str[1][0] != "U")
			str[1][0] = "U";

		else if (box == 5 && str[1][1] != "X" && str[1][1] != "U")
			str[1][1] = "U";

		else if (box == 6 && str[1][2] != "X" && str[1][2] != "U")
			str[1][2] = "U";

		else if (box == 7 && str[2][0] != "X" && str[2][0] != "U")
			str[2][0] = "U";

		else if (box == 8 && str[2][1] != "X" && str[2][1] != "U")
			str[2][1] = "U";

		else if (box == 9 && str[2][2] != "X" && str[2][2] != "U")
			str[2][2] = "U";

		Utility.display(str);
	}

	

	public void userWinTest(String[][] str) {
		if (str[0][0] == "U" && str[0][1] == "U" && str[0][2] == "U"
				|| (str[1][0] == "U" && str[1][1] == "U" && str[1][2] == "U")
				|| (str[2][0] == "U" && str[2][1] == "U" && str[2][2] == "U")
				|| (str[0][0] == "U" && str[1][0] == "U" && str[2][0] == "U")
				|| (str[0][1] == "U" && str[1][1] == "U" && str[2][1] == "U")
				|| (str[0][2] == "U" && str[1][2] == "U" && str[2][2] == "U")
				|| (str[0][0] == "U" && str[1][1] == "U" && str[2][2] == "U")
				|| (str[0][2] == "U" && str[1][1] == "U" && str[2][0] == "U")) {
			System.out.println("User Won");
			System.exit(0);
		}
	}

	public void computerWinTest(String[][] str) {
		if (str[0][0] == "X" && str[0][1] == "X" && str[0][2] == "X"
				|| (str[1][0] == "X" && str[1][1] == "X" && str[1][2] == "X")
				|| (str[2][0] == "X" && str[2][1] == "X" && str[2][2] == "X")
				|| (str[0][0] == "X" && str[1][0] == "X" && str[2][0] == "X")
				|| (str[0][1] == "X" && str[1][1] == "X" && str[2][1] == "X")
				|| (str[0][2] == "X" && str[1][2] == "X" && str[2][2] == "X")
				|| (str[0][0] == "X" && str[1][1] == "X" && str[2][2] == "X")
				|| (str[0][2] == "X" && str[1][1] == "X" && str[2][0] == "X")) {
			System.out.println("Computer Won");
			System.exit(0);
		}
		//scanner.close();
	}
	

	int i = 0;
	int[] store = new int[9];

	public boolean checkDuplicate(int num) 
	{
		for (int j = 0; j < i; j++) {
			// System.out.println("Val "+store[j]);
			if (store[j] == num) {
				return false;
			}
		}
		store[i] = num;
		if (i <= 9)
			i++;

		return true;
	}
	
	

}
