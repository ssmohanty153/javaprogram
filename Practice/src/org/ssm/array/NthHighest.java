package org.ssm.array;

import java.util.Scanner;

public class NthHighest 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the array");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the highest number");
		int n=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the "+size+" number");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();	
		}
		sc.close();
		
		
		for (int i = 0; i < arr.length; i++)
		{
			int count=0;
			for (int j = 1; j < arr.length; j++) 
			{
				if(arr[j]>arr[i])
					count++;
			}
		
		if(count==n-1)
		{
		System.out.println(arr[i]);
		}
		}
	}

}
