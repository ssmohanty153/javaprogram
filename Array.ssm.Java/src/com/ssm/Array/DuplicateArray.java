package com.ssm.Array;

import java.util.Scanner;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		
		int arr2[]=arr; 
		arr2[2]=22;
		System.out.println("change 2nd reference array");
		
		for (int i = 0; i < arr2.length; i++) 
		{
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		System.out.println("after the copy");
		int arr3[]=duplicatearray(arr2);
		for (int i = 0; i < arr3.length; i++)
		{
			System.out.print(arr3[i]+",");
		}
	}
	static int[] duplicatearray(int a[])
	{
		int b[]=new int[a.length];
		for (int i = 0; i < b.length; i++)
		{
			b[i]=a[i];
		}
		return b;
	}
}
