/*
Enter the number
6

*   *
 * * 
  *  
 * * 
*   *

 */




package com.ssm.Pattern;

import java.util.Scanner;

public class Patern9 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for (int i = 1; i <n; i++)
		{
			for (int j = 1; j <n; j++) 
			{
				if(i==j||i+j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
}
