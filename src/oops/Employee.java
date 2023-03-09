package oops;

public class Employee 
{
	int id;
	String name;
	int salary;
	String dsgn;
	String orgName;
	
	public Employee() 
	{
		System.out.println("Default Constructor");
		id=1;
		name="rahul";
		salary=1222;
		dsgn="SE";
		orgName="ABC";
	}
	public Employee(int id,String name) 
	{
		this();
		this.id=id;
		this.name=name;
	}
	public Employee(int id,String name,int salary) 
	{
		this(id,name);
		this.salary=salary;		
	}
	public Employee(int id,String name,int salary,String dsgn) 
	{
		this(id,name,salary);	
		this.dsgn=dsgn;
	}
	public Employee(int id,String name,int salary,String dsgn,String orgName) 
	{
		this(id,name,salary,dsgn);
		this.orgName=orgName;
	}
	public void disp() 
	{
		System.out.println(id + " " +name + " "+ salary + " "+ dsgn + " "+ orgName);
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee(2,"Krunal");
		Employee e3 = new Employee(3,"Ganesh",1234);
		Employee e4 = new Employee(4,"Krishna",12344,"Dr");
		Employee e5 = new Employee(5,"Sagar",23144,"SE","Google");
		
		e1.disp();
		e2.disp();
		e3.disp();
		e4.disp();
		e5.disp();
	} 
}