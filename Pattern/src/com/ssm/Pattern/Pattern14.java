package com.ssm.Pattern;

import java.util.Scanner;

public class Pattern14 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for (int i = 1; i <n; i++)
		{
			for (int j = 1; j <n; j++) 
			{
				if(i==1||j==1||i==n-1||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
}
