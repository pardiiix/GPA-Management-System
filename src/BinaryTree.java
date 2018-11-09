package mainTree;

//A Java program to introduce Binary Tree 
public class BinaryTree 
{ 
	// Root of Binary Tree 
	Node root; 

 	// Constructors 
 	BinaryTree(String key) 
 	{ 
 		root = new Node(key); 
 	} 

 	BinaryTree() 
 	{ 
 		root = null; 
 	} 

 	/* function to print level order traversal of tree*/
 	public void printLevelOrder() 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    } 

	/* Compute the "height" of a tree -- the number of 
	nodes along the longest path from the root node 
	down to the farthest leaf node.*/
	int height(Node root) 
	{ 
	    if (root == null) 
	       return 0; 
	    else
	    { 
	        /* compute  height of each subtree */
	        int lheight = height(root.left); 
	        int rheight = height(root.right); 
	          
	        /* use the larger one */
	        if (lheight > rheight) 
	            return(lheight+1); 
	        else return(rheight+1);  
	    } 
	} 

	/* Print nodes at the given level */
	void printGivenLevel (Node root ,int level) 
	{ 
	    if (root == null) 
	        return; 
	    if (level == 1) 
	        System.out.print(root.key + " "); 
	    else if (level > 1) 
	    { 
	        printGivenLevel(root.left, level-1); 
	        printGivenLevel(root.right, level-1); 
	    } 
	}
}
