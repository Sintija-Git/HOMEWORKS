package Homeworks;
import Lab3.GuessNumber;
import java.util.Scanner;

/**
Problem 3
GuessApp3 
	uses the instantiable class GuessNumber
	allows the user to guess the number, and then ask the user whether would they like to guess again. 
	If they answer yes, the application should run again, if they answer no, the application should end.
*/
public class GuessApp3 {

	public static void main(String[] args) {
		// declare local varibles
		int guess = 0;
		int secret = 0;
		String ans = "yes"; 
	
		Scanner input = new Scanner(System.in);
		GuessNumber checker = new GuessNumber();
		
		while (ans.contentEquals("yes")) {
		System.out.println("Please enter your guess number here: ");
		guess = input.nextInt();
		
		checker.setGuess(guess);
		
		checker.compare(); 
		
		String m = checker.getMessage();
		System.out.println(m);
		
		if (m.contentEquals("Congrats!")) {
			break;
			}
		
		System.out.println("Would you like to guess again? Enter: yes or no");
		ans = input.next();
		ans = ans.toLowerCase();
		
		
		if (ans.contentEquals("no")) {
			ans = ans.toLowerCase();
			System.out.println ("See you next time!");
			break;
			}
				
		}
		
		int s = checker.getSecret();
		System.out.println("secret: " + s);	

		
		
	
}
}


