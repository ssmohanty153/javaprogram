package com.ssm.Pattern;

public class PatternPra 
{
public static void main(String[] args) 
{
	int n=3;
	for (int i = 1; i <=n; i++) 
	{
		for (int j = 1; j <=n; j++) 
		{
			if(j==1&&i!=2)
			{
				System.out.print(" ");
			}
			if(i==2&&j!=2)
			{
				System.out.print("x");
			}
			if(j==2)
			{
				System.out.print("*");
			}
			
			
		}
		System.out.println();
	}
	
}
}
