package org.ssm.Sorting;

public class RescINsertion 
{
	public static void main(String[] args) 
	{
		int arr[]= {20,24,-16,55,11,1,-22};
		insertSort(arr,arr.length);
		for (int j = 0; j < arr.length; j++)
		{
			System.out.print(arr[j]+" , ");
			
		}

	}

	public static void insertSort(int[] arr, int length) 
	{
		if(length<2)
		{
			return;
		}
		insertSort(arr,length-1);
		int a=arr[length-1];
		int i;
		for (i = length-1; i >0&&arr[i-1]>a; i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[i]=a;
		
	}

}
