package org.ssm.string_prog;
import java.util.Scanner;
public class CountNunbersInString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the string");
		String str=sc.nextLine();
		sc.close();
		char ch[]=str.toCharArray();
		int count=0;
		for (int i1 = 0; i1 < ch.length; i1++)
		{
			if(ch[i1]>='0'&&ch[i1]<='9')
			{
				int no = 0;
				while(i1<ch.length&&ch[i1]>='0'&&ch[i1]<='9')
				{
					no=no*10+(ch[i1]-48);
					i1++;
				}
				count++;
			}
		}
		System.out.println(count);
	}
}
