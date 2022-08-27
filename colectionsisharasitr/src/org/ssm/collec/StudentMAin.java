package org.ssm.collec;

import java.util.ArrayList;

public class StudentMAin 
{
public static void main(String[] args) 
{
	Student s1=new Student("raghu",89.23);
	Student s2=new Student("ssm",56.23);
	Student s3=new Student("krishna",71.23);
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	for(Student s:al)
	{
		System.out.println(s);
	}
	
}
}
