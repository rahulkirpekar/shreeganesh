package iotopic.bytetopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\shreeganesh\\studentrecord.txt");
		
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s = (Student)oin.readObject();
			
			s.disp();

			oin.close();
			
			fin.close();
			
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
