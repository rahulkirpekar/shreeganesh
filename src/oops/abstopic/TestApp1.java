package oops.abstopic;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 1) for TWUser ");
		System.out.println("Enter 2) for LmvUser ");
		System.out.println("Enter 3) for HmvUser ");
		int choice = sc.nextInt();
		Vehicle vehicle = null;
		switch(choice) 
		{
			case 1: vehicle = new TwUser();
					vehicle.getSpec();
					break;
			case 2: vehicle = new LmvUser();
					vehicle.getSpec();
					break;
			case 3: vehicle = new HmvUser();
					vehicle.getSpec();
					break;
		}
	}
}
