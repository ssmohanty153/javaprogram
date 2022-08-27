package org.ssm.teacher;

public class Steacher extends PhysicsTeacher
{
	   String mainSubject = "Physics";
	   public static void main(String args[]){
		Steacher obj = new Steacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	   }
	}


