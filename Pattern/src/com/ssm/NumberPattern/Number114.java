package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number114 {
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number :");
			int n=sc.nextInt();
		
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print(" ");
			    }
				int k=1;
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print(k);
					if(j<=(2*i-1)/2)
					{
					k++;
					}
					else
					{
						k--;
					}
					
					
				}
				System.out.println();
			
			}
			
			
	
	
	}

}
