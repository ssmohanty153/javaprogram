package org.ssm.array;

import java.util.Scanner;

public class Merge 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the first element");
		int arr1[]=read();
		System.out.println("Enter the second element");
		int arr2[]=read();
		System.out.println("write array1");
		write(arr1);
		System.out.println("write array2");
		write(arr2);
		int array3[]=zigzag(arr1,arr2);
		for (int j = 0; j < array3.length; j++) 
		{
			System.out.print(array3[j]+",");
		}
	}
	static int[] zigzag(int[] arr1, int[] arr2)
	{

		int arr3[]=new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length||i<arr2.length; i++)
		{

			if(i<arr1.length)
			{
				arr3[i]=arr1[i];
			}
			if(i<arr2.length)
			{
				arr3[i+arr1.length]=arr2[i];
			}

		}

		return arr3;
	}
	static void write(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}
	static int[] read() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
}


