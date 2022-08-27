package com.ssm.Array;

import java.util.Scanner;

public class Smallest 
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
	int smallest=ar[0];
	for (int i = 0; i < ar.length; i++) 
	{
		if(smallest>ar[i])
		{
			smallest=ar[i];
		}
	}
	System.out.println("saallest number in this string is:-"+smallest);
}
}
