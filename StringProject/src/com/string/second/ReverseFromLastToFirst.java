package com.string.second;

import java.util.Scanner;

public class ReverseFromLastToFirst
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String st=sc.nextLine();
		String a=reveseString(st);
		System.out.println(a);
		
		}
	static String reveseString(String str)
	{
     	char ch[]=str.toCharArray();
		String stra="";
		for (int i =ch.length-1; i>=0; i--) 
		{
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				 i--;
			}
			int j=i+1;
			while(j<=k)
			{
				stra=stra+ch[j];
				j++;
			}
			if(i>0)
					
			stra=stra+ch[i];
		}
		return stra;
		
	}
}
		