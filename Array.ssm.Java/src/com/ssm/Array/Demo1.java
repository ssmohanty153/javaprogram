package com.ssm.Array;

import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
	int	ar[]=new int[size];
	System.out.println("enter"+size+" the value");
		for (int i = 0; i <size; i++) 
		{
			ar[i]=sc.nextInt();
			
		}
		sc.close();
		for (int in = 0; in < ar.length; in++) 
		{
			System.out.println(in+"---->"+ar[in]);
		}
		
	}

	
	

	

}
