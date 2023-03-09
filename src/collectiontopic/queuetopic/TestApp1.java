package collectiontopic.queuetopic;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String>queue = new PriorityQueue<String>();
		queue.add("krunal");
		queue.add("prakas");
		queue.add("rahul");
		queue.add("ankur");
		queue.add("sagar");
		
		Iterator<String> itr =	queue.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}

}
