package com.ssm.Array;

import java.util.Scanner;

public class AverageOfArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+"integer");
		int count=0;
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		int sum=0;
		for (int i = 0; i < ar.length; i++) 
		{
			count++;
			sum=sum+ar[i];
		}
		System.out.println("sum of averagr of the array :- "+sum/count);
	}
}
