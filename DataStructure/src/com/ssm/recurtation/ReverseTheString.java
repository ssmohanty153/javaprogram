package com.ssm.recurtation;

import java.util.Scanner;

public class ReverseTheString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		sc.close();
		String stri=reverseStr(str);
		System.out.println(stri);
	}
	static String reverseStr(String str) 
	{
		if(str.isEmpty())
		//if(str.length()==0)
			return str;

		return reverseStr(str.substring(1))+str.charAt(0);


	}
}
