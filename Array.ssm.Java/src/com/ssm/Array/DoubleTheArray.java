package com.ssm.Array;

import java.util.Scanner;

public class DoubleTheArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the string :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("entet the "+size+" number");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=ar[i]*2;
		}
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}


	}

}
