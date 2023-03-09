package iotopic.chartopic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		FileWriter fw = null;
		try 
		{
			fw = new FileWriter("charstring.txt");

			fw.write(name);
			
			fw.close();
			
			System.out.println("sucess");
		
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
