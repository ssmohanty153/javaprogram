package org.ssm.string;
import java.util.Scanner;
public class ReverseTheString
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		String st=reverseStri(str);
		System.out.println(st);
		
	}
	static String reverseStri(String str) 
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i=ch.length-1; i>=0; i--)
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
			if(i>0)
			{
				str=str+ch[i];
			}
		}
		return str;
	}
}
