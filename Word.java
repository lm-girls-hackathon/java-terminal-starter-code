public class Word {
	private char[] displayWord;
	private char[] answer;
	
	public Word(String answer) {
		this.answer = answer.toCharArray();
		
		// Create a new char array the same length as the answer
		char[] word = new char[answer.length()];
		
		// Set all values to underscore, which signify blank letters
		for (int i = 0; i < answer.length(); i++) {
			word[i] = '_';
		}
		this.displayWord = word;
	}
	
	
	/**
	 * This method checks if a character is in the word.
	 * 
	 * If the character is in the word, update the display word so that the character is filled in.
	 * @param char guess: the character to test
	 * @return true if the guess was in the word, false otherwise.
	 */
	public boolean guessLetter(char guess) {
		// TODO: Implement this method!
		
		return true;
	}
	
	
	/**
	 * Check if the display word matches the answer, i.e. if the word is solved.
	 * 
	 * @return true if all the characters match, false otherwise
	 */
	public boolean solved() {
		// TODO: Implement this method!

		return true;
	}
	
	public int length() {
		return this.answer.length;
	}
	
	
	public String toString() {
		// TODO: Implement this method to return a string representation of the Word
		
		return super.toString();
	}
}
