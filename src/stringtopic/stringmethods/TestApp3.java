package stringtopic.stringmethods;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name1 : ");
		String name1 = sc.nextLine();// Royal
		System.out.println("Enter Name1 : ");
		String name2 = sc.nextLine();// Techno

		String name3 = name1.concat(name2);// Royal Techno
		
		System.out.println("name3 - " + name3);
		
//		if (	(name1.compareTo(name2))	== 0	) 
//		{
//			System.out.println("Both Names are same : " + name1 + " - " + name2);
//		} else 
//		{
//			System.out.println("Both Names are not same : " + name1 + " - " + name2);
//		}
	}
}
