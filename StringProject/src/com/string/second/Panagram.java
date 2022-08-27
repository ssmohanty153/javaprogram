package com.string.second;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String :");
		String st=sc.nextLine();
		boolean s=isPanagram(st);
		if(s)
			System.out.println("String is anagram");
		else
			System.out.println("String is no anagram");
		
	}
	static boolean isPanagram(String s1) {
		if(s1.length()<26)
			return false;
		
		int c[]=countOccourance(s1);
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]==0)
				return false;
		}
		return true;

	
	}
	static int [] countOccourance(String a) {
		
	{
		int c[]=new int[26];
		
		for (int i = 0; i < a.length(); i++) 
		{
			char ch=a.charAt(i);
			if(ch>65&&ch<=90)
		    c[ch-65]++;
			else if (ch>=97&&ch<=122)
				c[ch-97]++;
			}
			return c; 
		}
	}
}
