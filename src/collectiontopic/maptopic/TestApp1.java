package collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> mapObj = new TreeMap<Integer,String>();
		
		mapObj.put(3, "rakesh");//2
		mapObj.put(1, "rahul");//0 --[ENTRY]
		mapObj.put(5, "dhaval");//4
		mapObj.put(2, "krunal");//1
		mapObj.put(4, "aman");//3
		
		
		for( Map.Entry<Integer, String>	e : mapObj.entrySet()) 
		{
			System.out.println(e.getKey()  + " " +e.getValue());
		}
	}

}
