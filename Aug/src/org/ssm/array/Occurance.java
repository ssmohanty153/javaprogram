package org.ssm.array;

import java.util.Scanner;

public class Occurance 
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
		System.out.println("----------__________-----------");
		for (int i = 0; i < arr1.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < arr1.length; j++) 
			{
				if(arr1[j]==arr1[i])
				{
					count++;
					arr1=del(arr1,j);
					j--;
				}
			}
			System.out.println(arr1[i]+"  "+count);
		}
	}
	static int[] del(int[] arr1, int j) 
	{
		int arr2[]=new int[arr1.length-1];
		for (int i = 0; i < arr2.length; i++) 
		{
			if(i<j)
				arr2[i]=arr1[i];
			else
				arr2[i]=arr1[i+1];
		}
		return arr2;
	}
}
