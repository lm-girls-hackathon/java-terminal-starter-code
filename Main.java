import java.util.Scanner;

public class Main {
	// Declares a scanner to read System.in, which is the terminal
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hello, what's your name?");
		String name = scanner.nextLine();
		System.out.println("Hi " + name);
	}
	
	// Get 1 char from the terminal
	static char getChar() {
		return scanner.next().charAt(0);
	}
}
