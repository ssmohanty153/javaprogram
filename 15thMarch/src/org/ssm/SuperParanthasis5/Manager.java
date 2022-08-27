package org.ssm.SuperParanthasis5;

public class Manager extends Employee 
{

	Manager()
	{
		super(20,300);
	}

	public static void main(String[] args)
	{
		System.out.println("app start");
		new Manager();
		System.out.println("app end");

	}
}
