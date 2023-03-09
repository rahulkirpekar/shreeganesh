package oops;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		// 1 By Scanner
//		System.out.println("Enter Character1 : ");
//		char value = sc.next().charAt(0);// R
//		System.out.println("value - " + value);

		// 2) By System.in.read();
		System.out.println("Enter Character2 : ");
		char charValue2 = (char) System.in.read();// 65<--ASCII<---A
		System.out.println("charValue2 - " + charValue2);
	}
}
