package mainTree.utility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import mainTree.Node;
import mainTree.utility.DefaultDataFeed;
import mainTree.utility.ManualDataFeed;

public class GradeInput extends Node {
	List<String> gradesList;
//	public static List<String> firstName = new ArrayList<>();
	
	public GradeInput(String key2)
	{
		super(key2);
	}
	
	public static List<String> getFirstName() {
		System.out.println(firstName);
		return firstName;
		}


	public boolean run() {	

	try{

		List<String> gradesList = new ArrayList<>();
		List<String> classNumber = new ArrayList<>();
		List<Integer> siteNumber = new ArrayList<>();
		List<String> homework = new ArrayList<>();
		List<String> project = new ArrayList<>();
		List<String> midterm = new ArrayList<>();
		List<String> finalExam = new ArrayList<>();
		FileInputStream fstream = new FileInputStream("C:\\Users\\Pardis\\Desktop\\IIT\\IIT courses\\CS401- introduction to advance studies\\project\\GPAMS\\grades.txt");
//			DataInputStream in = new DataInputStream (fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		
			String strLine;
			while ((strLine = br.readLine()) != null) {
				String[] tokens = strLine.split(" ");
				
				firstName.add(tokens[0]);
				lastName.add(tokens[1]);
				SID.add(tokens[2]);
				classNumber.add(tokens[3]);
				siteNumber.add(Integer.parseInt(tokens[4]));
				for (int i=5; i<(numberOfAssignments + 5) ; i++)
					homework.add(tokens[i]);
				project.add(tokens[15]);
				midterm.add(tokens[16]);
				finalExam.add(tokens[17]);
					
				
				
				gradesList.add(strLine);
				
			}
			br.close();
			System.out.println("The default Grades List is:\n" + gradesList);
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();

			
		FileInputStream newFile = new FileInputStream("C:\\Users\\Pardis\\Desktop\\IIT\\IIT courses\\CS401- introduction to advance studies\\project\\GPAMS\\newGrades.txt");
		BufferedReader newBR = new BufferedReader(new InputStreamReader(newFile));
		
		String strLine2;
		while ((strLine2 = newBR.readLine()) != null) {
			String[] tokens2 = strLine2.split(" ");
			
			firstName.add(tokens2[0]);
			lastName.add(tokens2[1]);
			SID.add(tokens2[2]);
			classNumber.add(tokens2[3]);
			siteNumber.add(Integer.parseInt(tokens2[4]));
			for (int i=5; i<(DefaultDataFeed.numberOfAssignments + 5) ; i++)
				homework.add(tokens2[i]);
			project.add(tokens2[15]);
			midterm.add(tokens2[16]);
			finalExam.add(tokens2[17]);
				
			
			
			gradesList.add(strLine2);
			}
		System.out.println("The updated Grades List is:\n" + gradesList);

	}catch (Exception e){
	     System.err.println("Error: " + e.getMessage());
	}
	
	


	
	
	
//	@Override
//	public void add(int index, T element) {
//		tokens[index] = (String) element;
//		
//	}
//	@Override
//	public T set(int index, T newElement) {
//		// throws IndexOutOfBoundsException. 
//		//replaces element on this list at position index with newElement, and returns the replaced element
//		if ((index < 0))
//				throw new IndexOutOfBoundsException ("illegal index of " + index);
//		String hold = tokens[index];
//		tokens[index] = (String) newElement;
//		return (T) hold;
//	}
			return false;
		}
//	@Override
//	public T get(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public int indexOf(Object target) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public T remove(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
