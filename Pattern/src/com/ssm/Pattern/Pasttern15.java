package com.ssm.Pattern;

import java.util.Scanner;

public class Pasttern15 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for (int i = 1; i <n; i++)
		{
			for (int j = 1; j <n; j++) 
			{
				if(j==1||j==n-1||(i==j||i+j==n)&&i>=n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}

}
