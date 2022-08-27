package com.string.first;

import java.util.Scanner;

public class LowerCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string :");
	String st=sc.nextLine();
	String low=tolowercase(st);
	System.out.println(low);
}
static String tolowercase(String str)
{
	char ch[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);
		
	}
	String s=new String(ch);
	return s;
}
}

