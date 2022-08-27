//hareHrishna is my brother
//brother my is hareHrishna

package org.ssm.string_prog;
import java.util.Scanner;
public class ReverseTheSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");	
		String str=sc.nextLine();
		sc.close();
		String rs=reverseTheSentence(str);
		System.out.println(rs);
	}
	static String reverseTheSentence(String str)
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
