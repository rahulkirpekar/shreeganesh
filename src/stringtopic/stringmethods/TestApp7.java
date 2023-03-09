package stringtopic.stringmethods;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		 String str = new String("hello James Gosling how r u");  
	     //                       012345678901234567890123456
		 char[] ch = new char[20];  
	      try
	      {  
	         str.getChars(6, 19, ch, 0);  
	         
	         System.out.println(ch);  
	      
	      }catch(Exception ex)
	      {
	    	  System.out.println(ex);
	      }  
	}
}
