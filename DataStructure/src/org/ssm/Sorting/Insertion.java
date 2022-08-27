package org.ssm.Sorting;

public class Insertion 
{
	public static void main(String[] args) 
	{
		int arr[]= {20,24,-16,55,11,1,-22};

		for (int i = 1; i < arr.length; i++) 
		{

			int a=arr[i];
			int j;
			for (j = i; j>0&&arr[j-1]>a; j--) 
			{
				arr[j]=arr[j-1];
			}
			arr[j]=a;

		}

		for (int k = 0; k < arr.length; k++)
		{
			System.out.print(arr[k]+" , ");

		}
	}



}
