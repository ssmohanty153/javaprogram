package org.ssm.string_prog;
import java.util.Scanner;
public class Anagram2 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("enter Second the String");
		String str2=sc.nextLine();
		boolean st=anagram(str1,str2);
		if(st)
		{
			System.out.println(str1+" is anagam");
		}
		else
			{
				System.out.println(str1+" is not anagam");
			}



	}

	static boolean anagram(String str1, String str2) 
	{
		boolean status=false;
		for (int i = 0; i < str1.length(); i++) 
		{
			for (int j = 0; j < str2.length(); j++) 
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					status=true;
					break;
				}
			}	
			if(status!=true)
			{
				return false;
			}
			
		}
		return true;
	}

}
