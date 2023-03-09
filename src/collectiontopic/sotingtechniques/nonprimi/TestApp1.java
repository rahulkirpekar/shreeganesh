package collectiontopic.sotingtechniques.nonprimi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "ankur", 11);
		Student s3 = new Student(3, "brijesh", 10);
		Student s4 = new Student(4, "sagar", 9);
		Student s5 = new Student(5, "chetan", 8);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Collections.sort(list, new StdWiseStudentComparator());
		System.out.println("Stdwise Comparator : ");
		Iterator<Student> itr =  list.iterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		System.out.println("NameWise Student Sorting : ");
		Collections.sort(list, new NameWiseStudentComparator());
		
		itr =  list.iterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
	}
}
