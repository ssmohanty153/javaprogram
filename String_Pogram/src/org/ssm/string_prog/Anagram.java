package org.ssm.string_prog;
import java.util.Scanner;
public class Anagram 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=sc.nextLine();
		System.out.println("Enter the second string");
		String s2=sc.nextLine();
		sc.close();
		s1=removeSpace(s1);
		s2=removeSpace(s2);
		boolean ana=isAnagram(s1,s2);
		if(ana)
			System.out.println(s1+" is anagrom");
		else
			System.out.println(s1+" is not anagrom");
	}
	private static String removeSpace(String s) 
	{
		char ch[]=s.toCharArray();
		String nstr="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				nstr=nstr+ch[i];
			}
		}
		return nstr;
	}
	static boolean isAnagram(String s1, String s2) 
	{
		if(s1.length()!=s2.length())
			return false;
		else
		{
			s1=toLowerCase(s1);
			s2=toLowerCase(s2);
			s1=sort(s1);
			s2=sort(s2);
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			for (int i = 0; i < ch1.length; i++) 
			{
				if(ch1[i]!=ch2[i])
				{
					return false;
				}
			}
		}
		return true;
	}
	static String sort(String s1)
	{
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]>ch[j])
				{
					char t=ch[i];
					ch[i]=ch[j];
				 	ch[j]=t;
				}
			}
		}
		String st=new String(ch);
		return st;
	}
	static String toLowerCase(String str) 
	{
		char ch[]=str.toCharArray();
		String nStr="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				nStr=nStr+(char)(ch[i]+32);
			}
			else
			{
				nStr=nStr+ch[i];
			}
		}    
		return nStr;
	}
}