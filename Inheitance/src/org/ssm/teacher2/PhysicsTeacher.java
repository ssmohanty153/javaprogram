package org.ssm.teacher2;

public class PhysicsTeacher extends Teacher
{
	 String mainSubject = "Physics";
	public static void main(String[] args)
	{
	PhysicsTeacher o=new PhysicsTeacher();
	System.out.println(o.setCollegeName());
	System.out.println(o.setDesignation());
	System.out.println(o.mainSubject);
	o.does();
}
}
