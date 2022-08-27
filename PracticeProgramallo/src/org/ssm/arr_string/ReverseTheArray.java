package org.ssm.arr_string;

import java.util.Scanner;

public class ReverseTheArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the "+size +" element");
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
			System.out.println(arr[i]);
		}
		
		sc.close();


	}
}
