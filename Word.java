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
	
	public boolean solved() {
		
		// loop over the word
		for (int i = 0; i < this.answer.length; i++) {
			
			// if any character doesn't match, return false
			if (this.answer[i] != this.displayWord[i]) {
				return false;
			}
		}
		
		// if none of the characters don't match, that means all the characters do match
		// that means the word is solved!
		return true;
	}
	
	
	public String toString() {
		String output = "";
		
		// Concatenate all chars into a string to display.
		for (int i = 0; i < this.displayWord.length; i++) {
			output += displayWord[i];
		}
		
		return output;
	}
}
