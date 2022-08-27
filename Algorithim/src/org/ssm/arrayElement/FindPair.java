package org.ssm.arrayElement;
public class FindPair 
{
	public static void main(String[] args) 
	{
		int arr[]={8,7,3,4,2,1};
		int sum=10;
		findPair(arr,sum);
	}
	static void findPair(int[] arr, int sum) 
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("index is"+arr[i]+"+"+arr[j]);
				}
			}
		}
	}
}
