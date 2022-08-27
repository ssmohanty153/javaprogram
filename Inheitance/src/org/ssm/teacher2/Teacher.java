package org.ssm.teacher2;

public class Teacher 
{
	public String designation = "Teacher";
	public   String collegeName = "Beginnersbook";
	public char[] mainSubject;
	public String getDesignation() 
	{
		return designation;
	}
	
	protected void setDesignation(String designation)
	{
		this.designation = designation;
	}
	protected String getCollegeName()
	{
		return collegeName;
	}
	protected void setCollegeName() 
	{
		this.collegeName = collegeName;
	}
	public void does()
	   {
		System.out.println("Teaching");
	   }
}
