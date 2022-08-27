package org.ssm.numberSystem;

import java.util.Scanner;

public class EvenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		/*
		if(n%2==0)
		{
			System.out.println(n+" is enen number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}
		*/
		String st[]={"even","odd"};
		System.out.println(n+" is "+st[n%2]);
	}
}
