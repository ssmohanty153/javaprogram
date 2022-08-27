package org.ssm.numberSystem;

import java.util.Scanner;

public class NumberIsPositiveOrNegative 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	sc.close();
	if(n>0)
	{
	System.out.println("Enter  the number is Positive");	
	}
	else
	{
		System.out.println("Enter the number is negative");
	}
	
}
}
