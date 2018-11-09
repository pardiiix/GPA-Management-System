package mainTree.utility;

import mainTree.Node;

public class DefaultDataFeed extends Node
{
	public DefaultDataFeed(String key2)
	{
		super(key2);
	}
	
	//static int numberOfAssignments = 10;
	public boolean run() {
		int numberOfSites = 3;
		int[] numberOfStudents = {10, 5, 5};
		int sum = 0;
		int numberOfAssignments = 10;
		int numberOfProjects = 1;
		int numberOfExams = 2;
		System.out.println("This is default data feed!!!");
		System.out.println("****** Default Data ******\n");
		
		System.out.println("Number of Sites: " + numberOfSites +"\n");
		
		for (int i=0; i<numberOfSites; i++) {
			System.out.println("Number of Student Per site " + (i+1) +": " + numberOfStudents[i]);
		}
		
		for (int i=0; i<numberOfSites; i++) {
			sum +=  numberOfStudents[i];
		}
		System.out.println("\nTotal Class size: " + sum + "\n");
		System.out.println("Number of Assignments: " + numberOfAssignments +"\n");
		System.out.println("Number of Projects: " + numberOfProjects +"\n");
		System.out.println("Number of Exams: " + numberOfExams +"\n");
	return false;
	}
}