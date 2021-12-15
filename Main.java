import java.util.Scanner;

public class Main {
	// Declares a scanner to read System.in, which is the terminal
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// creates a new word to guess
		Word word = new Word("hangman");
		System.out.println(word);
		
		char guess = scanner.next().charAt(0);
		
		
		word.guessLetter(guess);
		
		
		System.out.println(word);
	}
}
