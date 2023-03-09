package iotopic.chartopic;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestFileReader 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new  StringBuilder();
		FileReader fr = null;
		try 
		{
			fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\shreeganesh\\charstring.txt");
		
			int temp =0;
			while(	(temp =fr.read())	!= -1	) 
			{
				sb.append((char)temp);
			}
			fr.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String - " + sb);
	}
}
