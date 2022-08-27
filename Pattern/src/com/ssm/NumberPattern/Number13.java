package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=a;j++)
			{
				
				System.out.print(n/2+a-1+" ");
				
			}
		    if(i<n/2)	
			a++;
			if(i>n/2)
			a--;
			System.out.println();
		}
	}
	  

}
