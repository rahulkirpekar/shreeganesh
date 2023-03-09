package collectiontopic.listtopic;

import java.util.LinkedList;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		LinkedList<String> mainCntrList = new LinkedList<String>();
		mainCntrList.add("India");
		mainCntrList.add("China");
		mainCntrList.add("UK");
		mainCntrList.add("US");

		LinkedList<String> childCntrList = new LinkedList<String>();
		childCntrList.add("Japan");
		childCntrList.add("Rassia");
		childCntrList.add("Bangladesh");
		childCntrList.add("India");
//		mainCntrList.addAll(childCntrList);
//		mainCntrList.addAll(1, childCntrList);
//		mainCntrList.set(1, "SouthAfrica");// update
//		mainCntrList.remove(1);
//		mainCntrList.retainAll(childCntrList);
		
		for (int i = 0; i < mainCntrList.size(); i++) 
		{
			String cntr = mainCntrList.get(i);
			System.out.println(cntr);
		}
		
	}
}
