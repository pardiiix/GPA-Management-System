package mainTree.utility;

import mainTree.Node;

public class LastNameSearch extends Node {
	public LastNameSearch(String key2)
	{
		super(key2);
	}
	
	public boolean run() {
		System.out.println("This is last name search!!!");
		System.out.println(lastName);
		return false;
	}
}
