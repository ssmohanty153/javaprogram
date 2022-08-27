package org.ssm.static_program;
public class StudentDemo 
{
	public static void main(String[] args) 
	{
		Student.setCollege("gift");
		Student s1=new Student("Hare Krishna");
		Student s2=new Student("Hare Ram");
		s1.getStudentInfo();
		s2.getStudentInfo();
		s2.getClass();
	}
}
