//add school name, group number, and individual names

import java.util.Scanner;

public class Main {
	// Declares a scanner to read System.in, which is the terminal
	static Scanner scanner = new Scanner(System.in);
	
	static char[] answer;
	static char[] something;

	public static void main(String[] args) {
		answer = new char[]{'h', 'e', 'l', 'l', 'o'};
		
		System.out.println("Hello, what's your name?");
		String name = scanner.nextLine();
		System.out.println("Hi " + name);
	}
	
	// Get 1 char from the terminal
	public static char getChar() {
		return scanner.next().charAt(0);
	}
	
	/**
	 * This method checks if a character is in the word.
	 * 
	 * If the character is in the word, update the display word so that the character is filled in.
	 * @param char guess: the character to test
	 * @return true if the guess was in the word, false otherwise.
	 */
	public static boolean guessLetter(char guess) {
		// TODO: Implement this method!
		
		return true;
	}
	
	/**
	 * Check if the display word matches the answer, i.e. if the word is solved.
	 * 
	 * @return true if all the characters match, false otherwise
	 */
	public static boolean solved() {
		// TODO: Implement this method!

		return true;
	}
	
}
