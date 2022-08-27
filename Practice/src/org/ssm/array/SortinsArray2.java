package org.ssm.array;
import java.util.Scanner;
public class SortinsArray2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array");
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the"+size+" element");

		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		sc.close();

		for (int i = 1; i < arr.length; i++) 
		{
			for (int j = i; j >0; j--) 
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
			System.out.println(arr[i]);
		}
		
			
		}
	}

