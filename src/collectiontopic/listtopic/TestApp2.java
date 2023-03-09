package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>listofNames = new ArrayList<String>();

		listofNames.add("rahul");
		listofNames.add("sagar");
		listofNames.add("krunal");
		listofNames.add("ankur");
		listofNames.add("ramesh");
		listofNames.add("rahul");
		listofNames.add("ankur");
		listofNames.add("sagar");
		listofNames.add("krunal");
		
		System.out.println("listofNames.size : "+ listofNames.size());
		
		Iterator<String> itr =	listofNames.iterator();
		while(itr.hasNext()) 
		{
			String name  = itr.next();
			System.out.println(name);
		}
	}
}
