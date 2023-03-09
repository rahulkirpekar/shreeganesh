package oops.abstopic;

public class TwUser implements Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("TwUser----getSpec()");
		
		Vehicle.testStatic(); 
		
		TwUser tw = new TwUser();
		
		tw.testDefault();
		
	}
}
