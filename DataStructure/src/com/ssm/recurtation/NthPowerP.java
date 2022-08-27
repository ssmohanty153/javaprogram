package com.ssm.recurtation;

import java.util.Scanner;

public class NthPowerP 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the element");
	int n=sc.nextInt();
	System.out.println("enter the element of power");
	int p=sc.nextInt();
	sc.close();
	
	int f=power(n,p);
	System.out.println(f);

	}
	
	static int power(int n,int p)
	{
		if(p<=0)
		{
			return 1;
		}
		else
		{
			return n*power(n,p-1);
		}
	}
}
