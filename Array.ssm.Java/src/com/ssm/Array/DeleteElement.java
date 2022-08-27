package com.ssm.Array;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) 
	{
		System.out.println("enter the first string");	
		int arr1[]=readArr();
		System.out.println("write the first array element");
		write(arr1);
		for (int i = 0; i < arr1.length; i++) 
		{
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.println("new array is");
		//Scanner sc=new Scanner(System.in);
		//System.out.println("insert index at which u want to insert the element");
		//int n=sc.nextInt();
		//System.out.println("enter the insert element");
		//int ele=sc.nextInt();
		int ssm[]=deleteArray(arr1,2);
		for (int i = 0; i < ssm.length; i++)
		{
			System.out.print(ssm[i]+",");
		}
	}
	static int[]readArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of string");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the "+size+" element");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}

		return arr;
	}
	static void write(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+",");

		}
		System.out.println();

	}

	static int[] deleteArray(int a7[],int n)
	{
		if(n<0||n>a7.length)
		{

			return a7;
		}
		int a4[]=new int[a7.length-1];
		for (int i = 0; i < a7.length; i++) 
		{
			if(i<n)
				a4[i]=a7[i];
			else

				a4[i-1]=a7[i];
		}
		return a4;
	}
}
