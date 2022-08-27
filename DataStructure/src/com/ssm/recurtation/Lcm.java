package com.ssm.recurtation;

import java.util.Scanner;

public class Lcm 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  first element");
		int m=sc.nextInt();
		System.out.println("enter the second element");
		int n=sc.nextInt();
		sc.close();
		int l=lcm(m,n,m,n);
		System.out.println(l+" is lcm");
	}

	static int lcm(int m, int n, int m1, int n1) 
	{
		if(m1==n1)
			return m1;
		if(m1<n1)
			return lcm(m,n,m1+m,n1);
		else
			return lcm(m,n,m1,n1+n);
	}
}
