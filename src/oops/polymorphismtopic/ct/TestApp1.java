package oops.polymorphismtopic.ct;

// method overloadding ---CompileTime Polymorphims Example
public class TestApp1 
{
	public static void main(float no1,float no2) 
	{
		System.out.println("two args(float) --- Addition : " + (no1+no2));
	}
	public static void main(int no1,int no2) 
	{
		System.out.println("two args(int) --- Addition : " + (no1+no2));
	}
	public static void main(int no1,int no2,int no3) 
	{
		System.out.println("three args --- Addition : " + (no1+no2+no3));
	}
	public static void main(String[] args) 
	{
		main(20.345, 10.435);// Type Pramotion Rule
	}
}
