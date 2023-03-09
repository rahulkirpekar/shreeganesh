package oops.finaltopic;

public class Dog extends Animal // C.E
{
	@Override
	public void eat()// C.E 
	{
		System.out.println("Dog---eat()");
	}
	public static void main(String[] args) 
	{
		Dog dog = new Dog();
		dog.eat();
	}
}