package stringtopic.imt;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 ="rahul";
		
		System.out.println("name1: "  + name1 + " " +name1.hashCode());

		name1 = name1.concat(" Kirpekar");// rahul kirpekar
		
		System.out.println("name1: "  + name1+ " " +name1.hashCode());
		
		
	}

}
