package org.ssm.Number;

import java.util.Scanner;

public class SpecialTWoDigitNumber 
{
public static void main(String []arg)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int d1=n/10;
	int d2=n%10;
	int sum=d1*d2+d1+d2;
	sc.close();
	if(sum==n)
	{
		System.out.println(n+" is the SpecialTWoDigitNumber ");
	}
	else
	{
		System.out.println(n+"  is not SpecialTWoDigitNumber ");
	}
	
			
}
}
