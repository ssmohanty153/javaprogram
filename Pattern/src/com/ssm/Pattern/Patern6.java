/*
pattern is like that:-
*****
 ****
  ***
   **
    *
 */



package com.ssm.Pattern;

import java.util.Scanner;

public class Patern6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for (int i = 0; i <n; i++)
		{
			//for (int j = n; j>n-i ; j--)
				
				for (int j=0; j<i ; j++)
			{
				System.out.print(" ");
				
			}
			//for (int k = 0; k <n-i; k++) 
				for(int k=1;k<=n-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
