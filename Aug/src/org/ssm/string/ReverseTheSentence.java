package org.ssm.string;

import java.util.Scanner;

public class ReverseTheSentence 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=reverseaStr(str);
		System.out.println(str2);

	}

	static String reverseaStr(String str) 
	{
		
		char ch[]=str.toCharArray();
		str="";
		for (int i =ch.length-1; i >0 ; i--) 
		{
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				str=str+ch[j];
				j++;
			}
			if(i>=0)
			{
				str=str+ch[i];
			}
			
			
			
		}
	
		return str;
	}
}
