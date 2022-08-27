package com.ssm.Array;

import java.util.Scanner;

public class InsertTheElement 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the first string");	
		int arr1[]=readArr();
		System.out.println("enter the second string");	
		int arr2[]=readArr();
		System.out.println("write the first array element");
		write(arr1);
		System.out.println("write the second array element");
		write(arr2);
		int arr[]=sortTwoArray(arr1,arr2);

		System.out.println("the old array is");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+",");
		}
		System.out.println("new array is");
		//Scanner sc=new Scanner(System.in);
		//System.out.println("insert index at which u want to insert the element");
		//int n=sc.nextInt();
		//System.out.println("enter the insert element");
		//int ele=sc.nextInt();
		int ssm[]=insertArray(arr,2,155);
		for (int i = 0; i < ssm.length; i++)
		{

			System.out.println(ssm[i]+",");

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
	static int[] sortTwoArray(int a1[],int a2[])
	{
		int a3[]=new int[a1.length+a2.length];
		for (int i = 0; i < a1.length||i<a2.length; i++)
		{
			if(i<a1.length)
			{
				a3[i]=a1[i];
			}
			if(i<a2.length)
			{
				a3[a1.length+i]=a2[i];	
			}

		}
		return a3;

	}
	static int[] insertArray(int a7[],int n,int ele)
	{
		//System.out.println(a7.length);
		if(n<0||n>a7.length)
		{
			//System.out.println("no element insert in the array");

			return a7;
		}
		int a4[]=new int[a7.length+1];
		a4[n]=ele;
		for (int i = 0; i < a7.length; i++) 
		{
			if(i<n)
				a4[i]=a7[i];
			else
				a4[i+1]=a7[i];
		}
		return a4;




	}




}
