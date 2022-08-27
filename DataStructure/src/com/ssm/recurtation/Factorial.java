package com.ssm.recurtation;
import java.util.Scanner;
public class Factorial 
{  
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int n=sc.nextInt();
		sc.close();
		int f=factorial(n);
		System.out.println(f);
	}
	static int factorial(int n)
	{
		if(n<2)
		{
			return 1; 
		}
		else
		{
			return n*factorial(n-1);
		}
	}
}
