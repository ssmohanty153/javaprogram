package org.ssm.static_program;
public class Student 
{
	String name;
	static String CollegeName;
	int roolNo;
	static int count=0;
	public Student(String name)
	{
		this.name=name;
		this.roolNo=setRoolNo();
	}
	static int setRoolNo() 
	{
		count++;
		return count;
	}
	static void setCollege(String name)
	{
		CollegeName=name;
	}
	void getStudentInfo()
	{
		System.out.println("name:- "+this.name);
		System.out.println("roolname:- "+this.roolNo);
		System.out.println("CollegeName:-"+ CollegeName);
	}
}
