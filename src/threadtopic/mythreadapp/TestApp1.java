package threadtopic.mythreadapp;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// resource ---Table--object
		Table resource = new Table();
		
		MyThread1 t1 = new MyThread1(resource);
		MyThread2 t2 = new MyThread2(resource);
		MyThread3 t3 = new MyThread3(resource);
		MyThread4 t4 = new MyThread4(resource);

		t1.setName("5ThTable");
		t2.setName("15ThTable");
		t3.setName("20ThTable");
		t4.setName("25ThTable");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
