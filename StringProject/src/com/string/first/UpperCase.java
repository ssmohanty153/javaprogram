package com.string.first;
import java.util.Scanner;


public class UpperCase {
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String st=sc.nextLine();
		String cap=toUppercase(st);
		System.out.println(cap);
	}
	static String toUppercase(String str)
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
			
		}
		String s=new String(ch);
		return s;
	}
	}



