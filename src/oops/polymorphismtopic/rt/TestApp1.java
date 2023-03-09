package oops.polymorphismtopic.rt;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter vehicle user  choice : ");
		System.out.println("1) For TW Vechile User");
		System.out.println("2) For LMV Vechile User");
		System.out.println("3) For HMV Vechile User");
		int choice = sc.nextInt();
	
		Vehicle vehicle = null;
		switch(choice) 
		{	
			case 1 : vehicle =  new TwUser();
					 vehicle.getSpec();
					 break;
			case 2 : vehicle =  new LmvUser();
					 vehicle.getSpec();
					 break;
			case 3 : vehicle =  new HmvUser();
					 vehicle.getSpec();
			 		 break;
		}
	}
}
