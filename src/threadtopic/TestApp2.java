package threadtopic;

public class TestApp2 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getId() + " - " + Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		TestApp2 th1 = new TestApp2();

		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th1);
		Thread t3 = new Thread(th1);
		Thread t4 = new Thread(th1);
		Thread t5 = new Thread(th1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
