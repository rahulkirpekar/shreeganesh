package oops;
public class Student
{
	// 1) Dm's
	int rno;//0
	String name;// null
	int std;// 0
	// Default Constructor
	public Student()
	{
		System.out.println("START :: Default Constructor");
		rno=1;
		name="rahul";
		std=12;
		System.out.println("EXIT :: Default Constructor");
	}
	// para Constructor
	public Student(int rno,String name,int std)
	{
		System.out.println("START :: PARA Constructor");
		this.rno = rno;
		this.name=name;
		this.std=std;
		System.out.println("EXIT :: PARA Constructor");
	}
	// COPY Constructor
	public Student(Student s)
	{
		System.out.println("START :: COPY Constructor");
		rno=s.rno;
		name=s.name;
		std=s.std;
		System.out.println("EXIT :: COPY Constructor");
	}	
	public void disp()
	{
		System.out.println(rno + " "+name + " "+std + " " + this);// Object class---toString()
	}
	public static void main(String args[])
	{
		//Student s1 = new Student();
		Student s2 = new Student(2,"Krunal",12);

		//s1.disp();
		s2.disp();
	
	//	Student s3 = new Student(s2);
	//	s3.disp();
	
	}
}