package com.ssm.Array;
import java.util.Scanner;

public class InsideOneAnather 
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
		int ssm[]=insertArray(arr1,arr2,1);
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
	static int[] insertArray(int a1[],int a2[],int index)
	{
		if(index<0||index>a1.length)
		{
			System.out.println("no element insrert in the array");

			return a1;
		}
		int a3[]=new int[a1.length+a2.length];
		for (int i = 0; i < a1.length; i++) 
		{
			if(i<index)
				a3[i]=a1[i];
			else
				a3[i+a2.length]=a1[i];
		}
		for (int i = 0; i < a2.length; i++) 
		{
			a3[i+index]=a2[i];
		}
		return a3;
	}
}


