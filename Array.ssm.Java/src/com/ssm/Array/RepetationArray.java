package com.ssm.Array;

import java.util.Scanner;

public class RepetationArray {
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
		System.out.println("enter the element to search");
		int search=sc.nextInt();
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i]==search)
				count++;
		}
		System.out.println(search+" element is present  "+count+" times");
}
}
