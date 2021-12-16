import java.util.Scanner;

public class Main {
	// Declares a scanner to read System.in, which is the terminal
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// creates a new word to guess
		Word word = new Word("Chrysanthemum");

		System.out.println("The word is " + word.length() + " characters long");
		
		// loop until the user has guessed all characters successfully
		while (!word.solved()) {
			System.out.println(word);
			
			// use the getChar function to take 1 char from the terminal
			char guess = getChar();
			
			word.guessLetter(guess);
		}
		
		System.out.println("tada");
	}
	
	// Get 1 char from the terminal
	static char getChar() {
		return scanner.next().charAt(0);
	}
}
