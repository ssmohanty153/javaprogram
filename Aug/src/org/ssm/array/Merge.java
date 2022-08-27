package org.ssm.array;

import java.util.Scanner;

public class Merge 
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
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length||i<arr2.length;i++)
		{
			if(i<arr1.length)
			{
				arr3[i]=arr1[i];

			}
			if(i<arr2.length)
			{
				arr3[i]=arr2[i];

			}

		}
		System.out.println("_________---------_______");
		for (int i = 0; i < arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");

		}
	}

}
