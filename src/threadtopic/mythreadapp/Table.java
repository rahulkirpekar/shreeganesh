package threadtopic.mythreadapp;

public class Table 
{
	// synchronized - "ThreadSafe"
	public void printTable(int no) 
	{
		synchronized (this) 
		{
			for (int i = 1; i <=10; i++) 
			{
				try 
				{
					Thread.sleep(100);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" -----"+  no + " * "+ i + " = " + (no*i));
			} 
		}
		for (int i = 1; i <=10; i++) 
		{
			System.out.println("===>"+"OutSider "+Thread.currentThread().getName()+" -----"+  no + " * "+ i + " = " + (no*i));
		} 
	}
}
