package com.ssm.Array;
import java.util.Arrays;
import java.util.Scanner;
public class SortedFormat 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the first array");
		int arr1[]=readarr();
		System.out.println("enter the second  array");
		int arr2[]=readarr();
		System.out.println("write the array1");
		write(arr1);
		System.out.println("write the array2");
		write(arr2);
		System.out.println("after the sorting");
		int arr3[]=sortTwo(arr1,arr2);
		System.out.println();
		for (int j = 0; j < arr3.length; j++) 
		{
			System.out.print(arr3[j]+",");
		}

	}

	static int[] readarr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	static void write(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+",");

		}
		System.out.println();
	}

	static int[] sortTwo(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];
		for (int i = 0; i < x.length||i<y.length; i++)
		{
			if(i<x.length)
			{
				z[i]=x[i];
			}
			if(i<y.length)
			{
				z[x.length+i]=y[i];	
			}
		}
		//Arrays.sort(z);
		for (int i = 0; i < z.length; i++) 
		{
			for (int j = i; j > 0; j--) 
			{
				if(z[i]<z[j-1])
				{
					int temp=z[j];
					z[j]=z[j-1];
					z[j-1]=temp;

				}
			}
			
		}
		return z; 






			/*	int i=0,j=0,k=0;
		while(i<x.length&&j<y.length)
		{
			if(x[i]<y[j])
			{
				z[k++]=x[i++];
			}
			else
			{
				z[k++]=y[j++];
			}
		}

		while(i<x.length)

		{
			z[k++]=x[i++]; 
		}

		while(j<y.length)

		{
			z[k++]=y[j++]; 
		}
			 */

			
		}




	}


