package oops.finaltopic;

public class TestApp2 
{
	// Data Members -- create object
	final int no1;
	
	public TestApp2() 
	{
		no1=100;
	}
	public TestApp2(int no1) 
	{
		this.no1=no1;
	}
	public static void main(String[] args) 
	{
		TestApp2 app = new TestApp2(3000);

		System.out.println("NO1 : " + app.no1);
	}
}
