package com.ssm.recurtation;

import java.util.Scanner;

public class SumOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  size element");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("enter the "+size+"integer");
		
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		int s=sumOfArr(ar,0);
		System.out.println(s);
	}
	static int sumOfArr(int[] arr, int i)
	{
		if(i==arr.length-1)
			return arr[i];
		return arr[i]+sumOfArr(arr, i+1);
	}
}