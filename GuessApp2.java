package Homeworks;
import java.util.Scanner;
import Lab3.GuessNumber;

/**
Problem 2
GuessApp2 
	uses the instantiable class GuessNumber
	allows the user to guess the number. User can enter the guess number!
*/
public class GuessApp2 {

	public static void main(String[] args) {
		int n;// number of guesses
		int guess; //users input/guess number
		 
		Scanner input = new Scanner(System.in); //creating Scanner
		
		GuessNumber checker = new GuessNumber(); // to access the class GuessNumber
		
		// prompt the user to enter how many times he/she wants to guess
		System.out.println("how many times you'd like to guess?");
		n = input.nextInt(); // the number of times the user wants to guess the number
		
		//create a for loop
		for( int i = 0; i < n; i++) {
			
			//input
			System.out.println ("Enter your guess number: ");
			guess = input.nextInt();
			
			checker.setGuess(guess); //access set 
			
			//processing -> call compare meth
			checker.compare();
			
			//output
			String m = checker.getMessage();
			System.out.println(m);	
			
			if (m.contentEquals("Congrats!")) {
				break;
			}
			
//			int s = checker.getSecret();  SHOWS AFTER EACH GUESS
//			System.out.println("secret: " + s);	
		}
	}
}