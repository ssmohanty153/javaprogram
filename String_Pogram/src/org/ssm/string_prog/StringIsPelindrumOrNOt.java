package org.ssm.string_prog;
import java.util.Scanner;
public class StringIsPelindrumOrNOt 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		sc.close();
		boolean rs=ispalindrum(str);
		if(rs)
		{
			System.out.println(str+" is pellindrum");

		}
		else
		{
			System.out.println(str+" is not pelindrum");
		}
	}

	static boolean ispalindrum(String str) 
	{
		char ch[]=str.toCharArray();
		int i=0;
		int l=ch.length-1;
		if(i<l&&ch[i++]==ch[l--])
		return true;
		
		return false;
		
		
	}
}
