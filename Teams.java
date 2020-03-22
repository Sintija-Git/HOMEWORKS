package Homeworks;
/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students that can fit in the group. The application
        should then calculate and display how many Students can be filled in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        Teams.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
        hint is in the TeamsApp.java System.out.println
*/
public class Teams{
    //declare data members
	private int numberStudents;
	private int teamSize;
	
	private int numberOfTeams;
	private int leftStudents;
	
    //constructor
	
	public Teams () {
	}

    //constructor taking in two parameters numberStudents, teamSize
	public Teams (int number, int size) {
		numberStudents = number;
		teamSize = size;	
		
	}
	
    //setters for setNumOfStudents and setTeamSize
	public void setNumberStudents(int numberStudents) {
		this.numberStudents = numberStudents;
	}
	
	public void setTeamSize (int TeamSize) {
	this.teamSize = TeamSize;
	}
	
    //compute method
	public void calculateMetrics () {
		numberOfTeams = numberStudents / teamSize;
		leftStudents = numberStudents - teamSize * numberOfTeams;
	}

    //getters for getNumOfTeams and getLeftStudents
	
	public int getNumberOfTeams() {
	return numberOfTeams;
	
	}
	
	public int getLeftStudents() {
	return leftStudents;
	}


}

