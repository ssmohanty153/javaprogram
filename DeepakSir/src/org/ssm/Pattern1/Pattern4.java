package org.ssm.Pattern1;

public class Pattern4 
{
public static void main(String[] args) 
{
	for (int i = 0; i < 5; i++) 
	{
		for (int j = 0; j < 5-i-1; j++) 
		{
			System.out.print(" ");
		}
		for (int j = 0; j < 1+i; j++) 
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
}
}
