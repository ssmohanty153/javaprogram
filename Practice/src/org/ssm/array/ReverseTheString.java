package org.ssm.array;

import java.util.Scanner;

public class ReverseTheString 
{
	public static void main(String[] args) 
	{


		System.out.println("Enter the array");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length/2; i++)
		{
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);
		}
		
		
		
		
		
		sc.close();

	}
}
