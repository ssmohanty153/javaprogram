package one;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,5,7,7,8,3,9};
		//Set<Integer> set=new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for (int j = i+1; j <arr.length; j++) 
			{
				if(arr[j]==arr[i])
				{
					count++;
					arr=seletr(arr,j);

					j--;
				}
				


			}
			System.out.println(arr[i]);
			
			//	set.add(arr[i]);
		}
		//System.out.println(set);


	}

	static int[] seletr(int[] arr, int j)
	{
		int arr1[]=new int[arr.length-1];
		for (int i = 0; i < arr1.length; i++) 
		{
			if(i<j)
			{
				arr1[i]=arr[i];

			}
			else
				arr1[i]=arr[i+1];

		}

		return arr1;
	}

}
