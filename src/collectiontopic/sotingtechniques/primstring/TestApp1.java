package collectiontopic.sotingtechniques.primstring;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list  = new ArrayList<Integer>();
		
		list.add(10); 
		list.add(43); 
		list.add(76); 
		list.add(21); 
		list.add(76); 
		list.add(32);
		System.out.println("List : " + list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting : ");
		System.out.println("List : " + list);
		
	}
}
