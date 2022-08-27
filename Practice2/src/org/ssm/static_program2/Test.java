package org.ssm.static_program2;

public class Test 
{
	static int a=10;
  int b=20;
	static void m1()
	{
		a=20;
		System.out.println("from m1");
		//compilation error;
		//b=0;
		//we can not use nonstatic method 
		//m2();
		//we cant use super
		//System.out.println(super.a);
		
		
	}
	void m2()
	{
		System.out.println("from m2");
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
	}
	

}
