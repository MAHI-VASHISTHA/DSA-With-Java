package Array;

import java.util.Scanner;

public class MovieGuessingGame {

	private static final String MOVIE_NAME = "ram";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("🎬 Welcome to Movie Guessing Game!");
		System.out.println("Type 'quit' anytime to exit.\n");

		while (true) {
			System.out.print("Guess the movie name: ");
			String guess = sc.nextLine().trim();

			if (guess.equalsIgnoreCase("quit")) {
				System.out.println("🚪 You quit the game. Better luck next time!");
				break;
			} 
			else if (guess.equalsIgnoreCase(MOVIE_NAME)) {
				System.out.println("🎉 Correct! You guessed the movie.");
				break;
			}
			else {
				System.out.println("❌ Wrong guess, try again!\n");
			}
		}

		sc.close();
	}

}
