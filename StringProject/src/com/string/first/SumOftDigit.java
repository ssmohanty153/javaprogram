package com.string.first;

import java.util.Scanner;

public class SumOftDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String :");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int sum=0;
	for (int i = 0; i < ch.length; i++) 
	{
		if(ch[i]>='0'&&ch[i]<='9')
		{
			sum=sum+ch[i]-48;
		}
	}
		
	System.out.println("sum of number is :"+sum);	
	}

}
