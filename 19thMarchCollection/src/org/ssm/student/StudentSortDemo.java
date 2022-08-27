package org.ssm.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSortDemo 
{
public static void main(String[] args) 
{
	Student s1=new Student("subhransu", 75.33);
	Student s2=new Student("hari", 89.25);
	Student s3=new Student("rama", 75.01);
	Student s4=new Student("muna", 63.25);
	Student s5=new Student("little", 66.13);
	List<Student> l1=new ArrayList<Student>();
	l1.add(s5);
	l1.add(s4);
	l1.add(s3);
	l1.add(s2);
	l1.add(s1);
	System.out.println(l1);
	for (Student s:l1)
	{
		
			System.out.println(s);
		}	
	
}
}
