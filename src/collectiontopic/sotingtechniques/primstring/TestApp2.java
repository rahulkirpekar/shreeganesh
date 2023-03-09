package collectiontopic.sotingtechniques.primstring;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list  = new ArrayList<String>();
		
		list.add("rahul"); 
		list.add("ankur"); 
		list.add("brijesh"); 
		list.add("sagar"); 
		list.add("dhaval"); 
		list.add("chetan");
		System.out.println("List : " + list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting : ");
		System.out.println("List : " + list);
		
	}

}
