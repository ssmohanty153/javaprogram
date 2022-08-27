 package com.ssm.recurtation;

import java.util.Scanner;

public class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the element");
	int d=sc.nextInt();
	sc.close();
	int s=sumOfdigit(d);
	System.out.println(s);

	}
	static int sumOfdigit(int d)
	{
		if(d<1)
			return 0;
		return (d%10)+sumOfdigit(d/10);
	}
}
