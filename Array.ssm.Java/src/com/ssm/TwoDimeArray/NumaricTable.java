package com.ssm.TwoDimeArray;
public class NumaricTable 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j=3;
		int[][] arr=new int[i][j];
		for (int k1 = 0; k1 < arr.length; k1++)
		{
			for (int k2 = 0; k2 < arr[k1].length; k2++) 
			{
				if(k2==0)
				{
					arr[k1][k2]=j;
				}
				else if(k2==1)
				{
					arr[k1][k2]=k1+1;
				}
				else
				{
					arr[k1][k2]=3*(k1+1);
				}
			}
		}
		for (int k1 = 0; k1 < arr.length; k1++)
		{
			for (int k2 = 0; k2 < arr[k1].length; k2++) 
			{
				if(k2>0&&k2<2)
				{
					System.out.print("*");
				}

				else if(k2==2)
				{
					System.out.print("=");
				}

				System.out.print(arr[k1][k2]);
			}
			System.out.println();
		}
	}
}
