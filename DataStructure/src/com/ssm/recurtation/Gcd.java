package com.ssm.recurtation;

import java.util.Scanner;

public class Gcd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  first element");
		int m=sc.nextInt();
		System.out.println("enter the second element");
		int n=sc.nextInt();
		sc.close();
		int num= gcd(m,n);
		System.out.println(num+" is gcd of "+ m+" and "+n);
	}

	private static int gcd(int m, int n) 
	{
		if(m>n)
			return gcd(n,m);
		if(m==0)
			return n;


		return gcd(n%m,m);

	}
}
