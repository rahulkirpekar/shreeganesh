package iotopic.bytetopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		FileInputStream fin = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\shreeganesh\\src\\iotopic\\bytetopic\\TestFileOutputStream.java");

			int temp;
			
			while(	(temp = fin.read())	!= -1) 
			{
				char value = (char)temp;
				
				sb.append(value);
			}
			fin.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}
