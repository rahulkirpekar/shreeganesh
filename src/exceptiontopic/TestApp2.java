package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans=0; 
		try 
		{
			try 
			{
				ans = no1/no2;// ArithmeticException
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = "abc";
				System.out.println(name.length());// NullpointerException
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			int a[] = new int[5];
			try 
			{
				a[4] = 100;// ArrayIndexOutofBoundException

			} catch (Exception e) 
			{
				e.printStackTrace();
			}		
		
			try 
			{
				String value="dfg3244";
				int no = Integer.parseInt(value);
				System.out.println("No : " + no);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} catch (ArithmeticException | NullPointerException |  ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArithmeticException/NullPointerException /ArrayIndexOutOfBoundsException  Block :: Exception Handled : " + e.getMessage());
			e.printStackTrace();
		}catch(Exception e) 
		{
			System.out.println("Exception :: Exception Handled : " + e.getMessage());
			e.printStackTrace();
		}		
		System.out.println("Addition : " + ans);
	}
}
