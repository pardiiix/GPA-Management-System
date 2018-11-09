package mainTree.utility;

import mainTree.Node;

public class Exit extends Node
{
	public Exit(String key2)
	{
		super(key2);
	}
	
	public boolean run() {
		System.out.println("Exiting the program!");
		System.exit(0);
		return false;
	}
}
