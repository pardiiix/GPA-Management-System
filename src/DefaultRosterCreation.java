//package mainTree;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class DefaultRosterCreation {
//	static BinaryTree RosterTree;
//	static Stack<Node> RosterStack;
//	static Node current_Rnode;
//	private static String listOfClasses;
//	private static String listOfStudents;
//	
//	static void getChildPushToStack() {
//		current_Rnode = current_Rnode.getChild();
//		RosterStack.push(current_Rnode);
//	}
//	
//	//gets the sibling and pushes to stack
//	static void getSiblingPushToStack() {
//		current_Rnode = current_Rnode.getSibling();
//		RosterStack.push(current_Rnode);
//		
//	}
//	
//	public static class Classes{
//		private static ArrayList<Integer> listOfClasses = new ArrayList<Integer>(3);
//	 
//
//		public static void put(Integer n) {
//				listOfClasses.add(n);
//		}
//	 
//		public Integer take() {
//			Integer res = listOfClasses.get(0);
//			listOfClasses.remove(0);
//			
//			return res;
//		} 
//		
//	}
//	
//	public static class Students{
//		private static ArrayList<String> listOfStudents = new ArrayList<String>();
//	 
//		public static void put(String name) {
//				listOfStudents.add(name);
//		}
//	 
//		public String take() {
//			String res = listOfStudents.get(0);
//			listOfStudents.remove(0);
//			
//			return res;
//		} 
//		
//	}
//
//	
//	static void DefaultRoster() {
//		RosterTree = new BinaryTree(); 
//		
//		RosterTree.root= new Node("Default Roster Creation");
//		
//		//create a stack to determine where we are pointing at
//		RosterStack = new Stack<Node>();
//		
//		//set the root to be our current Node and push it to the stack
//		current_Rnode = RosterTree.root;
//		RosterStack.push(current_Rnode);
//		
//
//		//set child (left) to the current node
//		current_Rnode.setChild(listOfClasses);
////Classes.put(01);
////Classes.put(02);
////Classes.put(03);
//
//		
//		//class 01 becomes current node and top of stack 
//		getChildPushToStack();
//		
//		//Set current_Rnode's child
//		//Current Rnode is class 01.
//		current_Rnode.setChild(listOfStudents);
////Students.put("Amy");
//		
//		//current node and top of stack is now listOfStudents
//		getChildPushToStack();
//		
//		//listOfAssignments is now the child of listOfStudents
//		current_Rnode.setChild(listOfAssignments);
//		
//		//listOfAssignments becomes current node and top of stack 
//		getChildPushToStack();
//		
//		//set sibling of listOfAssignments
//		current_Rnode.setSibling(listOfProjects);
//		
//		getSiblingPushToStack();
//		
//		current_Rnode.setSibling(listOfExams);
//		
//		
//		
//
//	}
//}
