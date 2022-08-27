/*
 pattern like that:- 
    *
   **
  ***
 ****
*****

 */
package com.ssm.Pattern;

import java.util.Scanner;

public class Pattern5 {
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			for (int i = 0; i <n; i++)
			{
				//for (int j = 1; j <n-i; j++)
				for (int j =i; j <n-1; j++)
				{
					System.out.print(" ");
				}
				for (int k = 0; k <=i; k++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
}
