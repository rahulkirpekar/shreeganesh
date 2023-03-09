package threadtopic;

// 1) By extending Thread class
public class TestApp1 extends Thread
{
	// thread----job---defined----run()
	@Override
	public void run() 
	{
//		if (Thread.currentThread().isDaemon()) 
//		{
//			System.out.println("Hi I am Daemon Thread---Service Provider of Normal Thread");
//		} else 
//		{
			for (int i = 1; i<=5; i++) 
			{
				try 
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println(i + " - "+ Thread.currentThread().getId() +" - " + Thread.currentThread().getName());
//			}
		}
	}
	public static void main(String[] args) 
	{
		TestApp1  th1 = new TestApp1();
		TestApp1  th2 = new TestApp1();
		TestApp1  th3 = new TestApp1();
		TestApp1  th4 = new TestApp1();
		TestApp1  th5 = new TestApp1();
		
		th1.setDaemon(true);
		
		th1.setName("DhirajSir");
		th2.setName("MadhusudhanSir");
		th3.setName("Tejassir");
		th4.setName("Sameersir");
		th5.setName("Rahul Sir");

		th1.setPriority(Thread.MAX_PRIORITY);//10
		th2.setPriority(Thread.MIN_PRIORITY);//1
		th3.setPriority(Thread.NORM_PRIORITY);//5
		
		
		
//		try 
//		{
//			th1.join();
//		} catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
		
		th1.start();//Thread-0
		th2.start();//Thread-1 
		th3.start();//Thread-2
		th4.start();//Thread-3
		th5.start();//Thread-4
	}
}
