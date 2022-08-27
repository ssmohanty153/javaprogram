package com.string.second;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entyer the string :");
		String st=sc.nextLine();
		String a=reveseString(st);
		System.out.println(a);
		
	}
	static String reveseString(String str)
	{
		
		char ch[]=str.toCharArray();
		String stra="";
		for (int i = 0; i < ch.length; i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
		{
			i++;
		}
			
		int j=i-1;
		while(j>=k)
		{
			stra=stra+ch[j];
			j--;
		}
		if(i<ch.length)
		{
			stra=stra+ch[i];
		}
		}
		return stra;
	}
	
	/*static String reveseString(String str)
	{
	char ch[]=str.toCharArray();
	String rst=" ";
	for (int i=0 ;i<ch.length;i++ )
	{
	int k=i;
	while (i<ch.length &&ch [i]!=' ')
	{
	i++;
	}
	int j=i-1;
	while ( k<=j)
	{
	rst=rst + ch[j];
	j--;
	}
	rst=rst+' ';
	}
	System.out.println("The reserved words of sentence is:"+rst);
	return rst;
	}
	*/
	}

