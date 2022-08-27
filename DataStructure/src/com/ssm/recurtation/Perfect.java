package com.ssm.recurtation;

import java.util.Scanner;

public class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  first element");
		int m=sc.nextInt();
		sc.close();
		boolean n=isPerfect(m,1,0);
		if(n)
			System.out.println(m+" is perfect");
		else
			System.out.println(m+" is not perfect");
	}

	static boolean isPerfect(int n, int i, int sum) 
	{
		if(i>n/2)
		{
			return sum==n;
		}
		if(n%i==0)
			sum=sum+i;
		return isPerfect(n, i+1, sum);



	}
}
