package org.ssm.string;
import java.util.Scanner;
public class ReverseWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String str1=reverseStr(str);
		System.out.println(str1);
		sc.close();
	}
	static String reverseStr(String str)
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{ 
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				str=str+ch[j];
				j--;
			}
			if(i<ch.length)
				str=str+ch[i];
		}
		return str;
	}
}
