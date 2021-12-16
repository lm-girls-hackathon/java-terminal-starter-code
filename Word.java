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
		
		char upperCased = Character.toUpperCase(guess);
		char lowerCased = Character.toLowerCase(guess);
		
		// loop over the word
		for (int i = 0; i < this.answer.length; i++) {
			// check if the character at the current index is equal to the guess.
			// we use the uppercased and lowercased version of the guess, so we can find all matches without
			// worrying if the character is upper or lowercase
			if (this.answer[i] == upperCased) {
				
				// update the display word with the guess
				this.displayWord[i] = upperCased;
				
				// signal that we've found a match
				found = true;
			} else if (this.answer[i] == lowerCased) {
				this.displayWord[i] = lowerCased;
				
				found = true;
			}
		}
		
		return found;
	}
	
	
	/**
	 * Check if the display word matches the answer, i.e. if the word is solved.
	 * 
	 * @return true if all the characters match, false otherwise
	 */
	public boolean solved() {
		// loop over the word
		for (int i = 0; i < this.answer.length; i++) {
			
			// if any character doesn't match, return false
			if (this.answer[i] != this.displayWord[i]) {
				return false;
			}
		}
		
		// if none of the characters don't match, that means all the characters do match
		// which means the word is solved!
		return true;
	}
	
	
	// return the length of the word
	public int length() {
		return this.answer.length;
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
