package stringtopic.stringmethods;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name = "royal";
		
		System.out.println("name.length() - " + name.length());
		
		for (int i = 0; i < name.length(); i++) 
		{
			System.out.println(i + " - "+ name.charAt(i));// r
		}
	}
}
