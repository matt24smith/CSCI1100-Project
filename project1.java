import java.util.Scanner;
import java.util.Arrays;

/**
 * CSCI 1100 - Project 1
 * Educational Game
 * Due Date: 2014/12/02 
 * 
 * Authors:
 * Matt Smith
 * Rebecca Ansems
 * Pascha Protter
 * Adbullah Negahban
 * 
 */

public class project1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out
				.println("Welcome to <INSERT GAME NAME HERE>!\nHow many players are playing?");
		// This is the int assigned to the number of players playing.
		int numOfPlayers = s.nextInt(); 
		
		//This is the int assigned to the number of questions there are
		int numOfQuestions = 10; 
		
		//Array Declaration
		int playerArray[] = new int[numOfPlayers];
		int correct[] = new int[numOfQuestions];
		String question[][] = new String[numOfQuestions][5];

		int answer;
		int score = 0;

		//Uses a seperate method to initialize values in multidimensional array 
		//These are used to display question and answers
		arrayDeclaration(question);
		
		//Sets the correct answer for each question
		correct[0] = 2;
		correct[1] = 4;
		correct[2] = 1;
		correct[3] = 2;
		correct[4] = 2;
		correct[5] = 3;
		correct[6] = 1;
		correct[7] = 4;
		correct[8] = 2;
		correct[9] = 3;

		//Actual game
		for (int i = 0; i < numOfPlayers; i++) {
			for (int q = 0; q < numOfQuestions; q++) {
				answer = 0;
				score = 0;
				System.out.println("\n\nIt is now player " + (i + 1)
						+ "'s turn.");

				System.out.println("\n\nHello Player " + (i + 1) + "! "
						+ question[q][0] + " \nChoose answer 1, 2, 3, or 4.");
				System.out.println("Answer 1: " + question[q][1]);
				System.out.println("Answer 2: " + question[q][2]);
				System.out.println("Answer 3: " + question[q][3]);
				System.out.println("Answer 4: " + question[q][4]);
				System.out.print("The answer is choice number: ");
				answer = s.nextInt();
				if (answer == correct[q]) {
					System.out.println("Correct!");
					score += 10;
				} else {
					System.out.println("WRONG.");
				}
				answer = 0;

				// The following code completes the while loop before it
				// repeats.
				playerArray[i] += score;
			}
		}
		scores(numOfPlayers, playerArray);
	}

	
	//Method to handle scores
	public static void scores(int numOfPlayers, int[] playerArray) {
		System.out.println("\n\n\n\nSCORES");
		int i = 0;
		
		while (i < numOfPlayers) {
			System.out.print("Player " + (i + 1) + ": ");
			System.out.println(playerArray[i]);
			i++;
		}
	}

	//Method to initialize questions and answers to be displayed
	public static String[][] arrayDeclaration(String question[][]) {
		// Question 1
		question[0][0] = "(20 - 7) x 12 - 5?";
		question[0][1] = "156";
		question[0][2] = "151";// Correct
		question[0][3] = "60";
		question[0][4] = "148";

		// Question 2
		question[1][0] = "(12 + 5) + 15 ÷ 5?";
		question[1][1] = "17";
		question[1][2] = "3";
		question[1][3] = "18";
		question[1][4] = "20";// Correct

		// Question 3
		question[2][0] = "(8 + 40) ÷ (19 - 3)?";
		question[2][1] = "3";// Correct
		question[2][2] = "48";
		question[2][3] = "16";
		question[2][4] = "1";

		// Question 4
		question[3][0] = "(14 + 13 - 3) ÷ 2?";
		question[3][1] = "2";
		question[3][2] = "12";// Correct
		question[3][3] = "24";
		question[3][4] = "36";

		// Question 5
		question[4][0] = "(16 - 3) x 13 - 3?";
		question[4][1] = "169";
		question[4][2] = "166";// Correct
		question[4][3] = "152";
		question[4][4] = "175";

		// Question 6
		question[5][0] = "6 x 7 x (9 + 3)?";
		question[5][1] = "484";
		question[5][2] = "42";
		question[5][3] = "504";// Correct
		question[5][4] = "564";

		// Question 7
		question[6][0] = "(8 + 4) + 8 ÷ 4?";
		question[6][1] = "14";// Correct
		question[6][2] = "12";
		question[6][3] = "2";
		question[6][4] = "16";

		// Question 8
		question[7][0] = "(13 + 33 - 6 ) ÷ 5?";
		question[7][1] = "40";
		question[7][2] = "6";
		question[7][3] = "9";
		question[7][4] = "8";// Correct

		// Question 9
		question[8][0] = "9 x 12 x (10 - 7 )?";
		question[8][1] = "301";
		question[8][2] = "324";// Correct
		question[8][3] = "312";
		question[8][4] = "354";

		// Question 10
		question[9][0] = "(10 + 38) ÷ (3 + 3)?";
		question[9][1] = "6";
		question[9][2] = "12";
		question[9][3] = "8";// Correct
		question[9][4] = "4";

		return question;
	}

}
