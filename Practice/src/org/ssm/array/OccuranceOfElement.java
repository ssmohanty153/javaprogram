package org.ssm.array;
import java.util.Scanner;
public class OccuranceOfElement
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
		for (int i = 0; i < arr.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[j]==arr[i])
				{
					count++;
					arr=delArr(arr,j);
					j--;
				}
			}
			System.out.println(arr[i]+"-->"+count);
		}
	}
	private static int[] delArr(int[] arr, int j) 
	{
		int na[]=new int[arr.length-1];
		for (int i = 0; i < na.length; i++) 
		{
			if(i<j)
				na[i]=arr[i];
			else
				na[i]=arr[i+1];
		}
		return na;
	}
}
