package mainTree.utility;

import mainTree.Node;

public class MainMenu extends Node{
	public MainMenu(String key2)
	{
		super(key2);
	}
	
	public boolean run() {
		System.out.println("This is Main Menu!!!");
		return false;
	}
}
