package org.ssm.array;

import java.util.Scanner;

public class NthBiggestNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter tye size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{

			arr[i]=sc.nextInt();

		}
		System.out.println("Enter the biggest number");
		int n=sc.nextInt();

		for (int i = 0; i < arr.length; i++) 
		{
			int count=0;
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[j]>arr[i])
					count++;
			}
			if(count==n-1)
				System.out.println(arr[i]);
			}

		}

	}


