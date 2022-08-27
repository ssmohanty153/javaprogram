package com.ssm.Array;

import java.util.Scanner;

public class ReverseTheString 
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
		for (int i = 0; i < ar.length/2; i++)
		{
			int t=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=t;
		}
		System.out.print("[");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]);
			if(i<ar.length-1)
			System.out.print(",");
		}
		System.out.print("]");
	}
	
}
