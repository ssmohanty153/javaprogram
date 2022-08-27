package org.ssm.teacher2;

public class P extends JavaExapmle
{
   String mainSubject = "Physics";
   public static void main(String args[])
   {
	   JavaExapmle obj = new JavaExapmle();
	
	System.out.println(obj.getCollegeName());
	System.out.println(obj.getDesignation());
	//System.out.println(obj.mainSubject);
	obj.does();
   }
}
