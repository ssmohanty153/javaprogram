package com.Static.block;

public class StaticBlock1 {
	static int num=10;
	static String mystr;
	
	static{
		mystr="my pirst program";
		num=100;
		System.out.println("enter the string :");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("the number :"+num);
		System.out.println("enter the number :"+mystr);
	}

}
