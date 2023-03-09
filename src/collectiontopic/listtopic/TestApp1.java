package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listobject = new ArrayList();

		listobject.add(true);// 0 <===itr
		listobject.add('R');//1
		listobject.add(12);// 2
		listobject.add(12.1234f);// 3
		listobject.add("Royal");//4
		listobject.add(234L);// 5
		listobject.add(12);// 6
		listobject.add(12);// 7
		listobject.add(12);// 8
		
		Student s = new Student(1, "rahul", 12);
		listobject.add(s);//9

		System.out.println("listobject.size() - " + listobject.size());//10
		System.out.println("listobject.get(2) : "+listobject.get(2));
//-------------------------------------------------------------------		
//		for(int i=0;i<listobject.size();i++) 
//		{
//			Object obj = listobject.get(i);
//			System.out.println(obj);
//		}
//-------------------------------------------------------------------		
//		for(Object obj : listobject) 
//		{
//			System.out.println(obj);
//		}
//-------------------------------------------------------------------		
		
		// iterator way
		Iterator itr =  listobject.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			System.out.println(obj);
		}
	}
}
