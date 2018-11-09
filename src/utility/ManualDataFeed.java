package mainTree.utility;

import mainTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManualDataFeed extends Node
{
	public ManualDataFeed(String key2)
	{
		super(key2);
	}
	
	public boolean run() {
		List<Integer> numberOfStudents = new ArrayList<Integer>();
		int sum = 0;
		System.out.println("This is manual data feed!!!");
		System.out.println("****** Manual Data Input******");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Number of Sites: ");
		int numberOfSites = input.nextInt();

		for (int i=0; i<numberOfSites; i++) {
		System.out.print("Number of Student Per site " + (i+1) +": ");
		numberOfStudents.add(input.nextInt());
		}
		
		for (int i=0; i<numberOfStudents.size(); i++) {
			sum += numberOfStudents.get(i);
		}
		System.out.println("\nTotal class size: " + sum + "\n");
		
		System.out.print("Number of Assignments: ");
		numberOfAssignments = input.nextInt();
		
		System.out.print("Number of Projects: ");
		int numberOfProjects = input.nextInt();
		
		System.out.print("Number of Exams: ");
		int numberOfExams = input.nextInt();
		
		return false;
	}
}
