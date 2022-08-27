package org.ssm.org;

public class SelectionSorting
{
	public static void main(String[] args) 
	{

		int []arr= {23,45,1,90,56,583,2};
		for (int i =0; i <arr.length; i++) 
		{
		//	int a=i;
			for (int j =i+1; j <arr.length; j++) 
			{
				if(arr[i]>arr[j])
				/*{
					a=j;
				}*/
				{

					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
			}

		}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+",");
		}


	}

}
