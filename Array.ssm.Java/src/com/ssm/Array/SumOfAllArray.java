package com.ssm.Array;

import java.util.Scanner;

public class SumOfAllArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+"integer");
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < ar.length; i++) 
		{
			sum=sum+ar[i];
		}
		System.out.println("sum of the array :- "+sum);
	}
}
