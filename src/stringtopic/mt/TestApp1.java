package stringtopic.mt;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		StringBuilder name1 =new StringBuilder("rahul");
		
		System.out.println("name1: "  + name1 + " " +name1.hashCode());

		name1 = name1.append(" Kirpekar");// rahul kirpekar
		
		System.out.println("name1: "  + name1+ " " +name1.hashCode());
		
		
		
	}

}
