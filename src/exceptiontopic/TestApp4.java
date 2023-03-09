package exceptiontopic;

import java.io.IOException;

public class TestApp4 
{
	public static void isValidForVote(int age) //throws InvalidAgeException
	{
		if (age < 18) 
		{
//			throw --- raise exception
			throw new InvalidAgeException("\n\"Invalid age,\n\tPlease enter grater than 18.\"");
		} else 
		{
			System.out.println("Welcome for Vote....!");
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			isValidForVote(10);
		} catch (InvalidAgeException e) 
		{
			System.out.println("Catch block handled Exception");
			e.printStackTrace();
		}
		System.out.println("After Catch block");
	}
}
