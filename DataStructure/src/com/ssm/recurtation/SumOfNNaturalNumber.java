package com.ssm.recurtation;

import java.util.Scanner;

public class SumOfNNaturalNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int n=sc.nextInt();
		sc.close();
		int s=sumOfN(n);
		System.out.println(s);

	}
	static int sumOfN(int n)
	{
		if(n<=1)
			return 1;

		return n+sumOfN(n-1);



	}

}
