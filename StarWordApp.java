package Homeworks;
import java.util.Scanner;
public class StarWordApp {

	public static void main(String[] args) {
		//declare local variables
		String word;
		StringBuffer sb;
		int m;
		
		// declare scanner Obj
		Scanner sc = new Scanner (System.in);
		
		Boolean toContinue = true;
		
		do {
		
		//declare StarWord class Obj
		StarWord myStar = new StarWord ();
		
		
		//outprint pls enter the word and store in our local variable
			System.out.println ("Please enter the word you want to use: ");
		word = sc.next().toLowerCase();
		
		//"pls choose which method from instantible classes gonna use 1 --> ; 2-->; 3--> "+ default if none is correct "check input"
		System.out.println ("Now choose the method you want to use");
		System.out.println ("For computeVowels --> 1 ");
		System.out.println ("For computeStars --> 2 ");
		System.out.println ("For compute computePigLatin --> 3 ");
		System.out.println ("For reverseWord --> 4 ");
		m = sc.nextInt();
		
		//process
		myStar.setWord(word);
		myStar.setChosenMethod(m);
		
		
	
		if (m == 1) {
		myStar.computeVowels();
		} else if (m==2) {
		myStar.computeStars();
		} else if (m==3) {
		myStar.computePigLatin();
		}else if (m==4) {
		myStar.reverseWord ();
		} else {
			System.out.println ("You have entered invalid number!");
			
		}
		
		//output
		String res = myStar.getStringbuffer();
		if (m==1) {
			System.out.println ("The word " + word + " with method Vowels is: "+ res);
		} else if (m==2) {
			System.out.println ("The word " + word + " with method Stars is: "+ res);
		} else if (m==3) {
			System.out.println ("The word " + word + " with method PigLatin is: "+ res);
		} else if (m==4) {
			System.out.println ("The word " + word + " with method Reverse is: "+ res);
		}
	
		System.out.println("_________________________________");
		System.out.println ("Do you wish to continue? y/n");
		String ans = sc.next().toLowerCase();
		if (ans.equalsIgnoreCase("n")){
			toContinue = false;
			System.out.println ("See you next time!");
		}
		
		
		} while (toContinue);	 //do while method 
		
	
	} //end main

}//end class
