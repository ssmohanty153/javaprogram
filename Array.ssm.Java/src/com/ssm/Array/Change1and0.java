package com.ssm.Array;

import java.util.Scanner;

public class Change1and0 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+" integer");
		
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]%2==0)
			{
				ar[i]=0;
			}
			else
				ar[i]=1;
		}
		System.out.print("[");
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i]);
			if(i<ar.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
}
