package org.ssm.string_prog;

import java.util.Scanner;

public class ConvertNumberToSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		sc.close();
		nTow(no/1000000,"Croce");
		nTow(no/100000%100,"Lake");
		nTow(no/1000%100,"Thousand");
		nTow(no/100%100,"Hundred");
		nTow(no%100," ");  

	}
	static void nTow (int n,String st)
	{
		String one[]={" ","one","two","three","four","five","six",
				"seven" ,"eight",
				" nine","ten"," eleven"," twelve"," threenteen",
				"fourteen","fifteen","sixteen","seventeen","eighteen",
				"nineteen"};
		String two[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		if(n<20)
		{
			System.out.print(one[n]);
		}
		else
		{
			System.out.print(two[n/10]+one[n%10]);
			
		}
		if(n!=0)
		{
			System.out.print(st+"");
		}
		
		}

	}

