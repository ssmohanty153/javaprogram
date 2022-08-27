/*
 enter the number
5=


1
22
333
4444
55555
 */
package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print(i);
			}
			System.out.println();
		}
	
	}

}
