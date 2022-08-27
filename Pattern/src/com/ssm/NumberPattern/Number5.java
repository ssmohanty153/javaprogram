/*
 enter the number
5=

2 
3 4 
4 5 6 
5 6 7 8 
6 7 8 9 10 

 */
package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i+j)+" ");
			}
			System.out.println();
		}
	}

}
