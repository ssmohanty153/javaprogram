package com.ssm.recurtation;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int d=sc.nextInt();
		sc.close();
		boolean s=primeOfNum(d,2);
		if(s)
			System.out.println(d+"is prime");	
		else
			System.out.println(d+ " not prime");

	}
	static boolean primeOfNum(int d,int i)
	{
		if(i>d/2)
			return true;
		if(d%2==0)
			return false;
		return  primeOfNum(d,i+1);




	}
}
