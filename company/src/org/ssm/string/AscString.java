package org.ssm.string;

public class AscString
{
	public static void main(String[] args) 
	{
		String str="12khshukjnds4387";
		
		String str2=ascStri(str);
		System.out.println(str2);
		
		
	}

	static String ascStri(String str) 
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

}
