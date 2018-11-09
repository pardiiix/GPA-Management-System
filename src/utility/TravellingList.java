package mainTree.utility;

import mainTree.Node;

public class TravellingList extends Node{
	public TravellingList(String key2)
	{
		super(key2);
	}
	
	public boolean run() {
		System.out.println("This is Travelling List!!!");
		return false;
	}
}
