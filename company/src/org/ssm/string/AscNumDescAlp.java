package org.ssm.string;
import java.util.Arrays;
public class AscNumDescAlp 
{
	public static void main(String[] args)
	{
		String str="12khshukjnds4387";
		String str2=ascNumDescAlp(str);
	}
	static String ascNumDescAlp(String str) 
	{
		//ascending orde of all string value
		ascStrin(str);
		char ch[]=str.toCharArray();
		str="";
		String str1="";
		String str2="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				str1=str1+(ch[i]);
			}
			else
			{
				str2=str2+ch[i];
			}
			if(i==ch.length-1)
			{
				System.out.print(str2);
				sortString(str1);

			}
		}
		return str;
	}
	static String ascStrin(String str) 
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++)
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[j]<ch[i])
					
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
				
			}
			if(i<ch.length)
			{
				str=str+ch[i];
			}
			
		}
		return str;
		
	}
	static void sortString(String str) 
	{
		int charCount[]=new int[26];
		for (int i = 0; i < str.length(); i++)
		{
			charCount[str.charAt(i)-'a']++;
		}
		for (int i = 25; i>=0; i--) 
		{
			for (int j = 0; j < charCount[i]; j++) 
			{
				System.out.print((char)('a'+i));
			}
			
		}
	}
}
