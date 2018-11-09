package mainTree.utility;

import mainTree.Node;
import mainTree.utility.DefaultDataFeed;
import mainTree.utility.GradeInput;

public class FirstNameSearch extends Node 
{
	public FirstNameSearch(String key2)
	{
		super(key2);
	}
	
	public boolean run() {
		System.out.println("This is first name search!!!"); 
		System.out.println(firstName);
		return false;
	}
}
