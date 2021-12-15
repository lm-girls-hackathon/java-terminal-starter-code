import java.util.Scanner;

public class Main {
	
	// Declares a scanner to read System.in, which is the terminal
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("What's your name?");
		
		// This line waits for the user to input something and press Enter
		String name = scanner.nextLine();
		
		
		System.out.println("Hello " + name);
	}

}

class Word {
	private char[] displayWord;
	private char[] answer;
	
	public Word(char[] answer) {
		this.answer = answer;
		
		// Create a new char array the same length as the answer
		char[] word = new char[answer.length];
		
		// Set all values to underscore
		for (int i = 0; i < answer.length; i++) {
			word[i] = '_';
		}
		this.displayWord = word;
	}
	
	
	/**
	 * This method checks if a character is in the answer
	 * If the character is in the answer, update the display word so that the character is filled in.
	 * @param guess: the character to test
	 * @return true if the guess was in the word, false otherwise.
	 */
	public boolean guessLetter(char guess) {
		// initialize a boolean to store whether or not the character is in the word
		boolean found = false;
		
		// loop over the word
		for (int i = 0; i < this.answer.length; i++) {
			// check if the character at the current index is equal to the guess
			if (this.answer[i] == guess) {
				
				// update the display word with the guess
				this.displayWord[i] = guess;
				
				// signal that we've found a match
				found = true;
			}
		}
		
		return found;
	}
}
