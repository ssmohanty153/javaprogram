package org.ssm.string_prog;
import java.util.Scanner;
public class ReplaceNoOfWardsByPre
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		sc.close();
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++)
		{
			int count=0;
			while(i<ch.length&&ch[i]!=' ')
			{
				count++;
				str=str+ch[i];
				i++;
			}
			if(count!=0)
				str=str+count;
		}
		System.out.println(str);
	}
}