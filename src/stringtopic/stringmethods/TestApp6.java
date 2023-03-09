package stringtopic.stringmethods;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		String value = "ABCDE";
//					    		
		byte b[] = value.getBytes();// 
		
		
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(value.charAt(i) + " - " + b[i]);
			
		}
		
		
	}
}
