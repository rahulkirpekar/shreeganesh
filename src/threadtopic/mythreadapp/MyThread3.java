package threadtopic.mythreadapp;


public class MyThread3 extends Thread
{
	Table t = null;
	
	public MyThread3(Table t) 
	{
		this.t=t;
	}
	@Override
	public void run() 
	{
		t.printTable(20);
	}
}

