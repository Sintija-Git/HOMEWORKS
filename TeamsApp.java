package Homeworks;

import java.util.Scanner;
public class TeamsApp{
/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students can fit in the group. The application
        should then calculate and display how many Students can be filled  in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        TeamsApp.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
*/
	    public static void main(String[] args){
	        // declare local variables
	    	int numberStudents;
	    	int teamSize;
	    	
	        //declare a variable called input and create an object of type Scanner
	    	Scanner input = new Scanner(System.in);
	    	
	    	//input "Please enter the number of students: "
	        //input "Please enter the size of the groups: "
	    	System.out.println("Please enter the size of the team: ");
	    	teamSize = input.nextInt();
	    	System.out.println ("Please enter the number of total applicicants: ");
	    	numberStudents = input.nextInt();
	    	
	    	// declare a variable called myTeams to be able to work with an object ..
	    	//of type Teams and create an object of type Teams
	    	Teams myTeams = new Teams ();
	       
	    
	        //process
	    	//set/update the value of the object instance variables called numStudents with the value provided by user
	    	myTeams.setNumberStudents(numberStudents);
	    	
	    	//set/update the value of the object instance variables called teamSize with the value provided by user
	    	myTeams.setTeamSize(teamSize);
	    	
	    	myTeams.calculateMetrics();
	    	
	    
//	    	DONT KNOW IF I NEED THIS STUFF AT ALL (does the same as line 49 only without text)
	    	
	        //output of getNumOfTeams, getRemainigs
//	    	System.out.println(myTeams.getNumberOfTeams());
//	    	System.out.println(myTeams.getLeftStudents());
	    	
	    	int value1 = myTeams.getNumberOfTeams();
	    	int value2 = myTeams.getLeftStudents();
	    	System.out.println("The size of the team is "+teamSize+" and in total there is "+numberStudents+" appliciants, which makes " + value1 + " teams and leaves us with " + value2 + " students remaining!");
	    }
	}

