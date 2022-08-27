package org.ssm.array;

import java.util.Scanner;

public class Sorting 
{
	public static void main(String[] args) 
	{
		System.out.println("Enater the size of the String");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();

		}
		for (int i = 1; i < arr.length; i++) 
		{
			for (int j = i; j > 0; j--) 
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}

			}

		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] +" ");	
		}

	}

}
