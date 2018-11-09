package mainTree;

import java.util.Stack;
import java.util.Scanner;

import mainTree.utility.*;

public class GPAMS {
	static BinaryTree tree;
	static Stack<Node> nodeStack;
	static Node current_node;
	
	static void buildTree() {
		tree = new BinaryTree(); 

		tree.root= new Node("IIT CS401 GPAMS Main Menu");

		//create a stack to determine where we are pointing at
		nodeStack = new Stack<Node>();

		//set the root to be our current Node and push it to the stack
		current_node = tree.root;
		nodeStack.push(current_node);

		//set child (left) to the current node
		current_node.setChild(new Node("1. Roster Creation"));

		//since the current node has a sibling and a child, we must go to its child
		//to add child and sibling.
		//Therefore, current_node.getChild becomes our new current node.
		//The current Node gets pushed into nodeStack.
		//current node is Roster Creation
		getChildPushToStack();

		//Set current_node's child and  sibling
		//level 2: left subtree level 1's child and sibling.
		current_node.setChild(new ManualDataFeed("1. manual data feed"));
		current_node.setSibling(new GradeInput("2. Grade input"));
		
		//current node and top of stack is now manual data feed
		getChildPushToStack();
		
		current_node.setSibling(new DefaultDataFeed("2. default"));

		// we pop our current node in stack,
		//the top is now the parent of previous current node. (Roster creation)
		//set the top of stack's sibling to be our new current node.
		nodeStack.pop();
		
		//current node is now Roster creation
		current_node = nodeStack.peek();
		
		//current Node and top of stack is now Grade input
		getSiblingPushToStack();

		//set Grade input's siblings
		current_node.setSibling(new Node("3. record search"));
		//current node and top of stack is now record search
		getSiblingPushToStack();
		
		//set record search child
		current_node.setChild(new FirstNameSearch("1. Search by First Name"));
		//current node and top of stack is now Search by First Name
		getChildPushToStack();
		
		//set search by first name's sibling
		current_node.setSibling(new LastNameSearch("2. Search by Last Name"));
		//current node and top of stack is now Search by Last Name
		getSiblingPushToStack();
		
		//set search by last name's sibling
		current_node.setSibling(new SIDSearch("3. Search by SID"));
		//current node and top of stack is now Search by SID
		getSiblingPushToStack();		

		//set search by SID's sibling
		current_node.setSibling(new TravellingList("4. Travelling list"));
		//current node and top of stack is now Travelling list node
		getSiblingPushToStack();
		
		//set travelling list's sibling
		current_node.setSibling(new MainMenu("5. Main Menu"));
		//current node and top of stack is now Travelling list node
		getSiblingPushToStack();
		
		//pop all stack entries
		popAll();
		
		//main menu is current node and top of stack
		resetStack();
		
		
		//set current node to record search
		current_node = tree.root.left.right.right;
		
		current_node.setSibling(new Node("4. Show list"));
		getSiblingPushToStack();
		
		//add child to show list
		current_node.setChild(new Node("0. Scoring Weight per item"));
		//current node and top of stack is now scoring weight per item
		getChildPushToStack();
		
		//add sibling to scoring weight
		current_node.setSibling(new Node("1. Sorted list by last name"));
		//current node and top of stack is now SL by last name
		getSiblingPushToStack();

		//add sibling to SL by last name
		current_node.setSibling(new Node("2. Rankings by total score"));
		//current node and top of stack is now Rankings by TS
		getSiblingPushToStack();

		//add sibling to Rankings by TS
		current_node.setSibling(new Node("3. Rankings by homework average"));
		//current node and top of stack is now Rankings by HA
		getSiblingPushToStack();
		
		//add sibling to Rankings by HA
		current_node.setSibling(new Node("4. Rankings by project score"));
		//current node and top of stack is now Rankings by PS
		getSiblingPushToStack();

		//add sibling to Rankings by PS
		current_node.setSibling(new Node("5. Rankings by grade"));
		//current node and top of stack is now Rankings by grade
		getSiblingPushToStack();

		//add sibling to Rankings by grade
		current_node.setSibling(new Node("6. Main Menu"));
		//current node and top of stack is now main menu
		getSiblingPushToStack();
		
		popAll();
		
		resetStack();
		
		current_node = tree.root.left.right.right.right;

		
		current_node.setSibling(new Node("5. Change Record"));
		getSiblingPushToStack();
		
		//add child to change record
		current_node.setChild(new Node("1. Add record"));
		//current node and top of stack is now add record
		current_node = current_node.getChild();
		nodeStack.push(current_node);
		
		//add sibling to add record
		current_node.setSibling(new Node("2. Remove record"));
		//current node and top of stack is now remove record
		getSiblingPushToStack();

		//add sibling to remove record
		current_node.setSibling(new Node("3. Change record"));
		//current node and top of stack is now change record
		getSiblingPushToStack();
		
		//add sibling to change record
		current_node.setSibling(new Node("4. Main Menu"));
		//current node and top of stack is now main menu
		getSiblingPushToStack();
		
		popAll();
		
		resetStack();
		current_node = tree.root.left.right.right.right.right;
		
		current_node.setSibling(new Node("6. Statistics"));
		getSiblingPushToStack();
		
		//add child to statistics
		current_node.setChild(new Node("1. Average score of class"));
		//current node and top of stack is now Average score of class
		current_node = current_node.getChild();
		nodeStack.push(current_node);
		
		//add sibling to average score of class
		current_node.setSibling(new Node("2. Percentage of Grade"));
		//current node and top of stack is now Percentage of grade
		getSiblingPushToStack();
		
		//add sibling to percentage of grade
		current_node.setSibling(new Node("3. Main Menu"));
		//current node and top of stack is now Main Menu
		getSiblingPushToStack();
		
		popAll();
		
		resetStack();
		current_node = tree.root.left.right.right.right.right.right;
		
		
		current_node.setSibling(new Exit("7. Exit"));
		current_node = current_node.getSibling();
		nodeStack.push(current_node);
	}
	
	
	static void getSiblingPushToStack() {
		current_node = current_node.getSibling();
		nodeStack.push(current_node);	
	}
	
	static void getChildPushToStack() {
		current_node = current_node.getChild();
		nodeStack.push(current_node);
	}
	
	private static void resetStack() {
		//main menu is current node and top of stack
		current_node = tree.root;
		nodeStack.push(current_node);
		
	}
	public static void popAll() {

		//pop all stack entries
		while (!nodeStack.isEmpty()) {
			nodeStack.pop();
		}
	}
 
	
	//shows the submenu that user selected
	private static boolean runSubmenu(Node selectedNode) {
		
		System.out.println("\n========================================");
		System.out.println("You are at: ("+selectedNode.key+")\n");
		return selectedNode.run();
	}
	

	
	public static int getNumber() {
		final Scanner userInput = new Scanner(System.in);
		int userNumber = userInput.nextInt();
		userInput.close();
		return userNumber;
	}
	
	
	public static void main(String[] args) {
		buildTree();
		Node currentNode = tree.root;
		
		while(true) {
			boolean isMenu = runSubmenu(currentNode);
			if(isMenu) {
				int selected = getNumber();
				currentNode = currentNode.getChild();
				for(int it = 0; it < selected - 1; it++) {
					currentNode = currentNode.getSibling();
				}
			} else {
				currentNode = tree.root;
			}
		}
	}
}

