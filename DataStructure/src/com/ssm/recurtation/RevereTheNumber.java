package com.ssm.recurtation;

import java.util.Scanner;

public class RevereTheNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  first element");
		int m=sc.nextInt();
		sc.close();
		int r=reversenu(m,0);
		System.out.println(r);
	}

	static int reversenu(int n, int rev) 

	{
		if(n==0)
			return  rev;

		return  reversenu(n/10,rev*10+n%10);
	}
}
