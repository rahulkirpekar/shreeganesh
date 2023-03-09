package oops.abstopic;
//switch -- default
//interface---default method---java--9
//scope -- scope not define  default
public interface Vehicle 
{
	// 1) Dm's --- public static final
	// 2) Mf's--- public abstract
	abstract void getSpec();// public

	// 3) static method---8
	public static void testStatic() 
	{
		System.out.println("Vehicle---testStatic()");
	}
	// 4) private method---9
	private void privateTest() 
	{
		System.out.println("Vehicle---privateTest");
	}
	// 5) default method---8
	public default void testDefault() 
	{
		privateTest();
		System.out.println("Vehicle---testDefault()");
	}
}




