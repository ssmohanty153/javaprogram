package org.ssm.array;

import java.util.Scanner;

public class InsertIntoOneAnather 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter tye size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the second size");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter the index wherev you wontr to enter the string");
		int n=sc.nextInt();
		int arr3[]=new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) 
		{
			if(i<n)
			{
				arr3[i]=arr1[i];
			}
			else
				arr3[i+arr2.length]=arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) 
		{
			
			arr3[i+n]=arr2[i];
		}
		for (int j = 0; j < arr3.length; j++) 
		{
			System.out.println(arr3[j]);
			
		}
		


	}
}
