package mainTree;

import java.util.ArrayList;
import java.util.List;

/* Class containing left and right child of current 
node and key value*/

public class Node {
	//left is child, right is sibling
	 String key;
	 Node left, right;
	 
	 // shared static memory for sub-classes 
	 public static List<String> firstName = new ArrayList<>();
	 public static List<String> lastName = new ArrayList<>();
	 public static List<String> SID = new ArrayList<>();
	 
	 public static int numberOfAssignments;
	 
	 public Node(String key2) 
	 { 
	     key = key2; 
	     left = right = null; 
	 } 
	 public Node getChild() {
		 return left;
	 }
	 public Node getSibling() {
		 return right;
	 }
	 public void setChild(Node newNode) 
	 {
		 left = newNode;
	 }
	 public void setSibling(Node newNode)
	 {
		 right = newNode;
	 }
	public boolean hasNextSibling() {
		if (right==null)
			return false;
		else
			return true;
	}
	
	public boolean hasNextChild() {
		if (left==null)
			return false;
		else
			return true;
	}
	public boolean run() {
		if (this.left!=null) {
			Node subMenu = this;
			
			//prints the first child of selected sub-menu
			System.out.println(subMenu.getChild().key);
			subMenu = subMenu.getChild();
			
			//prints siblings if available
			while (subMenu.hasNextSibling())
			{
				subMenu = subMenu.getSibling();
				System.out.println(subMenu.key);
			}
			System.out.println("\nEnter a number from the menu:");
			
			return true;
		}else {
			System.out.println("This Node has no child");
			return false;
		}
	}
}
