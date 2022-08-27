package com.ssm.Array;
import java.util.Scanner;
public class NthBiggest 
{
	public static void main(String[] args)
	{
		System.out.println("enter the first array :");
		int arr1[]=readarr();
		int n=2;
		System.out.println("The " + n+" biggest no is");
		int arr=biggestElement(arr1,n);
		System.out.print(arr);
	}	
	static int[] readarr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the "+size+" value");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static int biggestElement(int arr[],int n)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int count=0;
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[j]>arr[i])
					count++;
			}
			if(count==n-1)
				return arr[i];
		}
		System.out.println("nth no not found");
		return -1;
	}
}
