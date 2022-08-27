package org.ssm.student;

public class Student
{
	String name;
	Double perc;
	public Student(String name, Double perc) 
	{
		
		this.name = name;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", perc=" + perc + "]";
	}
	
	
	

}
