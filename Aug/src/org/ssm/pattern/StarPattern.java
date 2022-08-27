package org.ssm.pattern;

import java.util.Scanner;

public class StarPattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for (int i = 1; i <=n; i++) 
		{
			int k=1;
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
			
		}
		
	}

}
