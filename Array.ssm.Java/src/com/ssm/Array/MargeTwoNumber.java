package com.ssm.Array;

import java.util.Scanner;

public class MargeTwoNumber 
{
	static int[] readarray()
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
		return ar;	
	}
	static void disarr(int ar[])
	{
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println(ar[i]+",");
		}
		System.out.println();
	}
	static int[] merge(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];
		for (int i = 0; i < x.length||i<y.length; i++)
		{
			if(i<x.length)
			{
				z[i]=x[i];
			}
			if(i<y.length)
			{
				z[x.length+i]=y[i];	
			}
		}
		return z;
	}
	public static void main(String[] args)
	{
		System.out.println("read first array element");
		int x[]=readarray();
		System.out.println("read second array element");
		int y[]=readarray();
		System.out.println("array first element are");
		disarr(x);
		System.out.println("array second element are");
		disarr(y);
		System.out.println("marge the array elements are :");
		int mar[]=merge(x,y);

		for (int i = 0; i < mar.length; i++)
		{
			System.out.print(mar[i]+",");

		}

	}
}