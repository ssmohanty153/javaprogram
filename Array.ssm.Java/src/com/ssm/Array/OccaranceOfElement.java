package com.ssm.Array;
import java.util.Scanner;
public class OccaranceOfElement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[j]==arr[i])
				{
					count++;
					arr=deleteArray(arr,j);
					j--;
				}
			}
			System.out.println(arr[i]+"--->"+count);	
		}
	}
	static int[] deleteArray(int arr[],int n)
	{
		int na[]=new int[arr.length-1];
		for (int i = 0; i < na.length; i++)
		{
			if(i<n)
				na[i]=arr[i];
			else 
				na[i]=arr[i+1];
		}
		return na;
	}
}