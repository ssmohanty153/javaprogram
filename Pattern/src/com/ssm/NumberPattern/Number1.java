/*
 enter the number
5=

1
23
456
7891
23456

 */






package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
				if(k==10)
					k=1;
			}
			System.out.println();
		}
				
	}

}
