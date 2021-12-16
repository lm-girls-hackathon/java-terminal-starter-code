import java.util.Scanner;

public class Main {
	// Declares a scanner to read System.in, which is the terminal
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// creates a new word to guess
		Word word = new Word("Chrysanthemum");

		System.out.println("The word is " + word.size() + " characters long");
		
		System.out.println(word);
		
		char guess = getChar();
		
		word.guessLetter(guess);
		
		System.out.println(word);
	}
	
	// Get 1 char from input
	static char getChar() {
		return scanner.next().charAt(0);
	}
}
