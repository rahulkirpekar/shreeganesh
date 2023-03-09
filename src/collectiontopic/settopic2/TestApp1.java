package collectiontopic.settopic2;

import java.util.TreeSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("krunal");
		names.add("rahul");
		names.add("krunal");
		names.add("sagar");
		names.add("krunal");
		
		Iterator<String> itr =	names.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
