package org.ssm.string;
public class DescString 
{
	public static void main(String[] args) 
	{
		String s="bhgcuy";
		sortString(s);
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
